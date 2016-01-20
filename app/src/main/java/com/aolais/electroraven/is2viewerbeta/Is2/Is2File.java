package com.aolais.electroraven.is2viewerbeta.Is2;

import android.graphics.Bitmap;

import com.aolais.electroraven.is2viewerbeta.protos.CalibrationDataVGPB;
import com.aolais.electroraven.is2viewerbeta.protos.CalibrationDataVGPB.CALIBRATION_DATA_VGPB;
import com.aolais.electroraven.is2viewerbeta.protos.CalibrationRangeInfoVGPB;
import com.aolais.electroraven.is2viewerbeta.protos.GeminiUniverseCurveDescriptorVGPB;
import com.aolais.electroraven.is2viewerbeta.protos.ThermalImageInfoDataVGPB;
import com.aolais.electroraven.is2viewerbeta.protos.ThermalImageInfoDataVGPB.THERMAL_IMAGE_INFO_DATA_VGPB;
import com.aolais.electroraven.is2viewerbeta.utils.EndianBinaryReader;

import java.util.Arrays;
import java.util.Map;
/**
 * Created by w7 on 02/03/2015.
 */
public class Is2File {
    private byte []  frameHeader;
    private int[][] pixles;
    private boolean PIPinfo;
    int minEnergy;
    int MaxEnergy=65535;
    Map<String,Object> irObject;
    private THERMAL_IMAGE_INFO_DATA_VGPB.Builder irImageInfo=null;
    private CALIBRATION_DATA_VGPB.Builder calibrationData;
    ColorMapper colorMapper;


    public Is2File(Map<String,Object> irObject){
        this.SetIrObject(irObject);
        this.SetFrameHeader();
        this.SetPixels();
        this.SetPIPinfo();
    }

    public void SetIrObject(Map<String,Object> irObject){
        this.irObject= irObject;
    }


    public void SetFrameHeader(){
        int x=320;
        byte [] buff=(byte[]) this.irObject.get("IR.data");

        this.frameHeader= Arrays.copyOfRange(buff,0,x*2);
    }

    public void SetPixels(){
        int x=320;
        EndianBinaryReader endianBinaryReader=new EndianBinaryReader(this.irObject);
        //endianBinaryReader.ReadUint16Array(320,240);
        this.pixles=endianBinaryReader.ReadIntArray(320,240);
        endianBinaryReader.TestWrapper(); //ONLY FOR TESTS OF CONVERT CHAR TO USHORT
    }

    private void SetPIPinfo(){
        Object obj=irObject.get("IRImageInfo");
        irImageInfo=(ThermalImageInfoDataVGPB.THERMAL_IMAGE_INFO_DATA_VGPB.Builder)obj;
        if(irImageInfo==null){
            this.PIPinfo= false;
        }
         this.PIPinfo=irImageInfo.getBasicPresentationFlags().getPipMode()>0;
    }

    public Bitmap GetIrBitmap(){
        int [][]energyValues=this.GetEnergyValues(0,this.PIPinfo,0);

        int[][]pixels2d=energyValues;
        int width = pixels2d.length;
        int height = pixels2d[0].length;
        int[] pixels = new int[width * height];
        int pixelsIndex = 0;
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                //long num3=pixels2d[i][j];
                pixels[pixelsIndex] = pixels2d[j][i];
                pixelsIndex ++;
            }
        }

        Bitmap test;
        test=Bitmap.createBitmap(pixels, width, height, Bitmap.Config.ARGB_8888);

        return test;

    }

    private int[][] GetEnergyValues(int frameIndex,boolean PIPinfo,int irScaleFactor){
        int [][]numArray=null;
        int [][]energyFrame=this.pixles;

        numArray=AdjustForEBT(energyFrame);
        colorMapper=GetColorMapper();
        numArray=colorMapper.GetMapEnergyGridInPlace(numArray);
        int [][]energyValues=numArray;



        return numArray;

    }

    private int[][] AdjustForEBT(int [][] energyFrame){
        CalibrationRangeInfoVGPB.CALIBRATION_RANGE_INFO_VGPB item;
        this.calibrationData=(CalibrationDataVGPB.CALIBRATION_DATA_VGPB.Builder)irObject.get("CalibrationData");
        item=calibrationData.getCalibrationRangeInfoVgpb(0);
        float single=item.getMinDisplayableTempC();
        float single1=item.getMaxDisplayableTempC();
        int num=GrayBodyEnergyFotTemperature((double)single,item);
        int num1=GrayBodyEnergyFotTemperature((double)single1,item);
        energyFrame=AdjustForEBT(energyFrame,calibrationData,num,num1,item);
        /*
        colorMapper=new ColorMapper();
        colorMapper.calibrationData=calibrationData;
        colorMapper.iriImageInfo=this.irImageInfo;
        colorMapper.GetEnergyToCelsiusTemperatureTable(this.minEnergy,this.MaxEnergy);
        colorMapper.GetTemperatureToColorTable(0,-20,2000,1);
        colorMapper.GetEnergyColorTable();
        */

        return energyFrame;

    }

    private ColorMapper GetColorMapper(){
        colorMapper=new ColorMapper();
        colorMapper.calibrationData=calibrationData;
        colorMapper.iriImageInfo=this.irImageInfo;
        colorMapper.GetEnergyToCelsiusTemperatureTable(this.minEnergy,this.MaxEnergy);
        colorMapper.GetTemperatureToColorTable(0,-20,2000,1);
        colorMapper.GetEnergyColorTable();

        return colorMapper;

    }

    private int[][] AdjustForEBT(int[][]pMatrix,CalibrationDataVGPB.CALIBRATION_DATA_VGPB.Builder ebtInfo,int minEnergy,int maxEnergy,CalibrationRangeInfoVGPB.CALIBRATION_RANGE_INFO_VGPB firstCalRange) {
        boolean flag = true;
        if (ebtInfo != null) {
            double emissivity = this.irImageInfo.getCapturedEmissivity();
            double backGroundTemp = this.irImageInfo.getCapturedBackgroundTempC();
            double transmissionCorrectionCoefficient = (double) this.irImageInfo.getCapturedTransmissionFactor();
            double num = (double) GrayBodyEnergyFotTemperature(backGroundTemp, firstCalRange);
            double num1 = 1 - transmissionCorrectionCoefficient;
            double num2 = 1 - emissivity;
            double num3 = 1 / emissivity;
            double num4 = 1 / (emissivity * transmissionCorrectionCoefficient);
            int length = pMatrix.length;
            int length1 = pMatrix[0].length;
            for (int i = 0; i < length1; i++) {
                for (int j = 0; j < length; j++) {
                    double num5 = (double) pMatrix[j][i];
                    double num6 = num5 * num4 - num * num1 * num4 - num * num2 * num3;
                    int num7 = (int) Math.round(num6);
                    if (num7 < minEnergy) {
                        num7 = minEnergy;
                    } else if (num7 > maxEnergy) {
                        num7 = maxEnergy;
                    }
                    pMatrix[j][i] = num7;
                }
            }
        } else {
            flag = false;
        }
        return pMatrix;
    }


    public static int GrayBodyEnergyFotTemperature (double tempValueCelsius,CalibrationRangeInfoVGPB.CALIBRATION_RANGE_INFO_VGPB calRange){
        int num=0;
        int num1=0;
        while(num1<calRange.getGeminiUInverseCurvesCount()){
            GeminiUniverseCurveDescriptorVGPB.GEMINI_UINVERSE_CURVE_DESCRIPTOR_VGPB item=calRange.getGeminiUInverseCurves(num1);
            if((double)item.getStartTempC()>tempValueCelsius || (double)item.getEndTempC()<tempValueCelsius){
                num1++;
            }
            else{
                double num2=(tempValueCelsius*(double)item.getU2()+(double)item.getU1())*tempValueCelsius + (double)item.getU0();
                num=(int)num2;
                break;
            }

        }
        return num;
    }


}

package com.aolais.electroraven.is2viewerbeta.Is2;

import android.graphics.Color;

import com.aolais.electroraven.is2viewerbeta.protos.CalibrationDataVGPB.CALIBRATION_DATA_VGPB;
import com.aolais.electroraven.is2viewerbeta.protos.CalibrationRangeInfoVGPB.CALIBRATION_RANGE_INFO_VGPB;
import com.aolais.electroraven.is2viewerbeta.protos.IrPaletteDataVGPB;
import com.aolais.electroraven.is2viewerbeta.protos.ThermalImageInfoDataVGPB.THERMAL_IMAGE_INFO_DATA_VGPB;

/**
 * Created by w7 on 05/03/2015.
 */
public class ColorMapper {
    float  maxEnergyValueInTables;
    float  minEnergyValueInTables=65535;
    CALIBRATION_DATA_VGPB.Builder calibrationData;
    THERMAL_IMAGE_INFO_DATA_VGPB.Builder iriImageInfo;
    float [] energyToTempTable;
    int []   temperatureColorTable;
    int[]EnergyColorTable;
    float maxTemperature;
    float minTemperature;


    public void GetEnergyToCelsiusTemperatureTable(int minEnergy,int maxEnergy){
        float [] singleArray=null;
        if(this.energyToTempTable!=null){
            this.maxEnergyValueInTables=maxEnergy;
            this.minEnergyValueInTables=minEnergy;
        }
        else{

            CALIBRATION_RANGE_INFO_VGPB item=calibrationData.getCalibrationRangeInfoVgpb(0);
            float single=item.getMinDisplayableTempC();
            float single1=item.getMaxDisplayableTempC();
            int num=Is2File.GrayBodyEnergyFotTemperature((double)(single - 1f), item);
            int num1 = num;
            minEnergy = num;
            this.minEnergyValueInTables=num;
            maxEnergy=Is2File.GrayBodyEnergyFotTemperature((double)single1, item);
            int num2 = maxEnergy + 1;
            int num3 = num2;
            maxEnergy = num2;
            this.maxEnergyValueInTables=num3;
            int num4 = maxEnergy - minEnergy + 1;
            singleArray=new float[num4];
            int num5 = 0;
            if (minEnergy > 0)
            {
                num5 = minEnergy;
            }
            int count=item.getGeminiUInverseCurvesCount();
            int num6=0;
            double item1=(double)item.getGeminiUInverseCurves(num6).getStartTempC();
            double item2=(double)item.getGeminiUInverseCurves(num6).getEndTempC();

            double num7=(double)Is2File.GrayBodyEnergyFotTemperature(item2,item);
            double u0=(double)item.getGeminiUInverseCurves(num6).getU0();
            double u1=(double)item.getGeminiUInverseCurves(num6).getU1();
            double u2=(double)item.getGeminiUInverseCurves(num6).getU2();
            double num8=u1*u1;
            double num9=-u1;
            double num10=u2*2;
            double num11=4*u2;
            for(int i=minEnergy;i<=maxEnergy;i++){
                while ((double)i>num7){
                    num6++;
                    if(num6>=count){
                        break;
                    }
                    item1=(double)item.getGeminiUInverseCurves(num6).getStartTempC();
                    item2=(double)item.getGeminiUInverseCurves(num6).getEndTempC();
                    num7=(double)Is2File.GrayBodyEnergyFotTemperature(item2,item);
                    u0 = (double)item.getGeminiUInverseCurves(num6).getU0();
                    u1 = (double)item.getGeminiUInverseCurves(num6).getU1();
                    u2 = (double)item.getGeminiUInverseCurves(num6).getU2();
                    num8 = u1 * u1;
                    num9 = -u1;
                    num10 = u2 * 2;
                    num11 = 4 * u2;
                }
                double num12=(num9 + Math.sqrt(num8-num11*(u0-(double)i)))/num10;
                Double _num12=(Double)num12;
                if(_num12.isNaN())
                {
                    num12=item1;
                }
                singleArray[i-num5]=(float)num12;

            }

            this.energyToTempTable=(float[])singleArray;
        }

    }
    public void GetTemperatureToColorTable(int frameIndex,float maxTemp,float minTemp,float temperatureScalingFactor){
        int []temperatureToColorTableRomulusUltraContrast=null;
        float single=0f;
        float single1=0f;
        temperatureScalingFactor=1f;

        temperatureToColorTableRomulusUltraContrast=this.GetTemperatureToColorTable_Linear(frameIndex,single,single1,temperatureScalingFactor);
        this.temperatureColorTable=temperatureToColorTableRomulusUltraContrast;

    }

    public int[] GetTemperatureToColorTable_Linear(int frameIndex,float minTemperature,float maxTemperature,float temperatureScalingFactor ){
        float lowBoundaryTemp=iriImageInfo.getIrPaletteSetup().getPaletteRangeMinTempC();
        float highBoundaryTemp=iriImageInfo.getIrPaletteSetup().getPaletteRangeMaxTempC();

        minTemperature=lowBoundaryTemp;
        minTemperature=minTemperature-1f;
        maxTemperature=highBoundaryTemp;
        maxTemperature=maxTemperature+1f;
        double num1=(double)(maxTemperature-minTemperature);
        if (num1 > 500)
        {
            temperatureScalingFactor = 1f;
        }
        else if (num1 <= 100)
        {
            temperatureScalingFactor = 64f;
        }
        else
        {
            temperatureScalingFactor = 16f;
        }
        int num2=(int)((double)temperatureScalingFactor*num1);
        int[]numArray=new int[num2];
        int num3=(int)((lowBoundaryTemp-minTemperature)*temperatureScalingFactor);
        int num4=(int)((highBoundaryTemp-minTemperature)*temperatureScalingFactor);
        int []colorTable=this.GetColorTable(iriImageInfo.getIrPaletteSetup().getPaletteScheme());

        ColorOverrideRecord colorOverrideRecord=new ColorOverrideRecord();
        colorOverrideRecord.ColorValue=colorTable[0];
        colorOverrideRecord.FirstBucketIndex=0;
        colorOverrideRecord.LastBucketIndex=num3;

        numArray=this.OverrideColors(numArray,colorOverrideRecord);

        ColorOverrideRecord colorOverrideRecord1=new ColorOverrideRecord();
        colorOverrideRecord1.ColorValue=colorTable[(int)colorTable.length-1];
        colorOverrideRecord1.FirstBucketIndex=num4;
        colorOverrideRecord1.LastBucketIndex=num2;

        numArray=this.OverrideColors(numArray,colorOverrideRecord1);
        numArray=this.PopulateColorTable_Linear(colorTable,lowBoundaryTemp,highBoundaryTemp,num3,num4,numArray);

        this.maxTemperature=maxTemperature;
        this.minTemperature=minTemperature;



        return numArray;

    }

    private int[]GetColorTable(IrPaletteDataVGPB.PaletteSchemes palScheme){
        Color color;
        Color color1;
        int[] argb=this.Generate32bppLookupTable(1024);

        if(true){
            argb[0]=argb[1];
            argb[(int)argb.length-1]=argb[(int) argb.length-2];
        }

        return argb;

    }

    private int[] Generate32bppLookupTable(int elements){
        int num = 0;
        int num1 = elements;
        if(true){
            num++;
            num1 = num1 - 2;
        }
        double num2 = 0;
        double num3 = 1 / (double)(num1 - 1);
        int[] aRGB = new int[elements];
        IronBowPalette ironBowPalette=new IronBowPalette();
        for (int i = 0; i < num1 - 1; i++)
        {
            ColorF color = ironBowPalette.GetColor(num2);
            aRGB[i + num] = color.ToARGB();
            num2 = num2 + num3;
        }
        ColorF colorF = ironBowPalette.GetColor(1);
        aRGB[num1 + num - 1] = colorF.ToARGB();
        ColorF saturableColor=new ColorF();
        ColorF saturateHighColor=new ColorF();
        saturableColor.R=0.7;
        saturableColor.G=0.6;
        saturableColor.B=0.3;
        saturateHighColor.G=0.5;
        if(true){
            aRGB[0] = saturableColor.ToARGB();
            aRGB[elements - 1] = saturateHighColor.ToARGB();
        }
        return aRGB;


    }

    private int[] OverrideColors(int[]ColorValueTable,ColorOverrideRecord record){
        record.FirstBucketIndex = (int)Math.min((int)record.FirstBucketIndex, ((int)ColorValueTable.length));
        record.LastBucketIndex = Math.min((int)record.LastBucketIndex,(int)ColorValueTable.length);
        for (int i = record.FirstBucketIndex; i < record.LastBucketIndex; i++)
        {
            ColorValueTable[i] = record.ColorValue;
        }
        return ColorValueTable;
    }

    private int[]PopulateColorTable_Linear(int[] paletteColorTable, float resultPaletteColorTable_minTemperature, float resultPaletteColorTable_maxTemperature, int resultPaletteColorTable_minTemperatureIndex, int resultPaletteColorTable_maxTemperatureIndex,int[] paletteColorTable_Result){
        double length = (double)((int)paletteColorTable.length);
        double resultPaletteColorTableMaxTemperatureIndex = (double)(resultPaletteColorTable_maxTemperatureIndex - resultPaletteColorTable_minTemperatureIndex);
        for (int i = resultPaletteColorTable_minTemperatureIndex; i < resultPaletteColorTable_maxTemperatureIndex; i++)
        {
            double resultPaletteColorTableMinTemperatureIndex = (double)(i - resultPaletteColorTable_minTemperatureIndex) / resultPaletteColorTableMaxTemperatureIndex;
            int num = (int)(length * resultPaletteColorTableMinTemperatureIndex);
            paletteColorTable_Result[i] = paletteColorTable[num];
        }

        return paletteColorTable_Result;
    }

    public void GetEnergyColorTable(){
        int num = (int)(this.maxEnergyValueInTables - this.minEnergyValueInTables + 1);
        int[] numArray = new int[num];
        int num1 = 0;
        for (int i = (int)this.minEnergyValueInTables; i <= (int)this.maxEnergyValueInTables; i++){
            if((i - (int)this.minEnergyValueInTables==3222)){
                int x=10;

            }
            float single = this.energyToTempTable[i - (int)this.minEnergyValueInTables];
            if (single < this.minTemperature)
            {
                num1 = this.temperatureColorTable[0];
            }
            else if (single < this.maxTemperature)
            {
                int length = (int)((single - this.minTemperature) * 64);
                if (length >= (int)this.temperatureColorTable.length)
                {
                    length = (int)this.temperatureColorTable.length - 1;
                }
                num1 = this.temperatureColorTable[length];
            }
            else
            {
                num1 = this.temperatureColorTable[(int)this.temperatureColorTable.length - 1];
            }
            if (i - this.minEnergyValueInTables < (int)numArray.length)
            {

                numArray[i - (int)this.minEnergyValueInTables] = num1;
            }

        }
        this.EnergyColorTable=numArray;

    }

    public int[][]GetMapEnergyGridInPlace(int[][]input){
        int length = input.length;
        int num = input[0].length;
        int length1 = (int)this.EnergyColorTable.length;
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < length; j++)
            {

                    int num1 = input[j][i] - (int)this.minEnergyValueInTables;
                    if (num1 < 0)
                    {
                        num1 = 0;
                    }
                    else if (num1 >= length1)
                    {
                        num1 = length1 - 1;
                    }
                    input[j][ i] = (int)this.EnergyColorTable[num1];
          }
        }
        return input;
    }

}

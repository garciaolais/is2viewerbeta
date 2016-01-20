package com.aolais.electroraven.is2viewerbeta.utils;

import com.aolais.electroraven.is2viewerbeta.protos.CalibrationDataVGPB.CALIBRATION_DATA_VGPB;
import com.aolais.electroraven.is2viewerbeta.protos.ThermalImageInfoDataVGPB.THERMAL_IMAGE_INFO_DATA_VGPB;
import com.aolais.electroraven.is2viewerbeta.protos.ThermalImagerInfoDataGPB.THERMAL_IMAGER_INFO_DATA_GPB;
import com.aolais.electroraven.is2viewerbeta.protos.UserDefinedMarkerPoint.USER_DEFINED_MARKER_POINT;
import com.aolais.electroraven.is2viewerbeta.protos.UserDefinedMarkerRectangle.USER_DEFINED_MARKER_RECTANGLE;
import com.aolais.electroraven.is2viewerbeta.protos.VlImageMetadataVGPB.VL_IMAGE_METADATA_VGPB;
import com.google.protobuf.InvalidProtocolBufferException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by w7 on 27/02/2015.
 */
public class Desarialize {
    private ArrayList<String> gbMembers=new ArrayList<String>(Arrays.asList("CalibrationData","CameraInfo","Centerbox","Centerpoint","Coldpoint","Hotpoint","IRImageInfo","VLImageInfo","IR.data"));
    private List<ZipData> zipData;
    private Map<String,Object> irObject=new HashMap<String,Object>();
    private CALIBRATION_DATA_VGPB.Builder calibrationData;
    private THERMAL_IMAGER_INFO_DATA_GPB.Builder cameraInfo=null;
    private THERMAL_IMAGE_INFO_DATA_VGPB.Builder irImageInfoV=null;
    private USER_DEFINED_MARKER_POINT.Builder centerPoint=null;
    private USER_DEFINED_MARKER_POINT.Builder hotPoint=null;
    private USER_DEFINED_MARKER_POINT.Builder coldPoint=null;
    private USER_DEFINED_MARKER_RECTANGLE.Builder centerBox=null;
    private VL_IMAGE_METADATA_VGPB.Builder vlImageMetadata=null;

    public Desarialize(List<ZipData> zipData) {
        for (ZipData mZipdata: zipData) {
            for(String temp:gbMembers)
                if (mZipdata.getMember().contains(temp)) {
                    switch (temp) {
                        case "IR.data":
                            SetIrData(temp,mZipdata);
                            break;
                        case "CalibrationData":
                            SetCalibrationData(temp, mZipdata);
                            break;
                        case "CameraInfo":
                            SetCameraInfo(temp, mZipdata);
                            break;
                        case "Centerbox":
                            SetCenterbox(temp, mZipdata);
                            break;
                        case "Centerpoint":
                            SetCenterpoint(temp, mZipdata);
                            break;
                        case "Coldpoint":
                            SetColdpoint(temp, mZipdata);
                            break;
                        case "Hotpoint":
                            SetHotpoint(temp, mZipdata);
                            break;
                        case "IRImageInfo":
                            SetIRImageInfo(temp, mZipdata);
                            break;
                        case "VLImageInfo":
                            SetVLImageInfo(temp, mZipdata);
                            break;

                    }
                    break;
                }
        }
        /*
        calibrationData=null;
        cameraInfo=null;
        irImageInfoV=null;
        centerPoint=null;
        hotPoint=null;
        coldPoint=null;
        centerBox=null;
        vlImageMetadata=null;
        */
    }

    public Map<String,Object> GetirObject(){
        return irObject;
    }

    private void SetIrData(String key,ZipData zipData){
        Object obj=zipData.getBuff();
        irObject.put(key,obj);
    }
    private void SetCalibrationData(String key,ZipData zipdata){
        try {
            calibrationData=CALIBRATION_DATA_VGPB.parseFrom(zipdata.getBuff()).toBuilder();
            irObject.put(key,calibrationData);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }

    }
    private void SetCameraInfo(String key,ZipData zipdata){

        try {
            cameraInfo=THERMAL_IMAGER_INFO_DATA_GPB.parseFrom(zipdata.getBuff()).toBuilder();
            irObject.put(key,cameraInfo);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }
    private void SetCenterbox(String key,ZipData zipdata){
        try {
            centerBox=USER_DEFINED_MARKER_RECTANGLE.parseFrom(zipdata.getBuff()).toBuilder();
            irObject.put(key,centerBox);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }
    private void SetCenterpoint(String key,ZipData zipdata){
        try {
            centerPoint=USER_DEFINED_MARKER_POINT.parseFrom(zipdata.getBuff()).toBuilder();
            irObject.put(key,centerPoint);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }
    private void SetColdpoint(String key,ZipData zipdata){
        try {
            coldPoint=USER_DEFINED_MARKER_POINT.parseFrom(zipdata.getBuff()).toBuilder();
            irObject.put(key,coldPoint);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }
    private void SetHotpoint(String key,ZipData zipdata){
        try {
            hotPoint=USER_DEFINED_MARKER_POINT.parseFrom(zipdata.getBuff()).toBuilder();
            irObject.put(key,hotPoint);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }
    private void SetIRImageInfo(String key,ZipData zipdata){
        try {
            irImageInfoV=THERMAL_IMAGE_INFO_DATA_VGPB.parseFrom(zipdata.getBuff()).toBuilder();
            irObject.put(key,irImageInfoV);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }
    private void SetVLImageInfo(String key,ZipData zipdata){
        try {
            vlImageMetadata=VL_IMAGE_METADATA_VGPB.parseFrom(zipdata.getBuff()).toBuilder();
            irObject.put(key,vlImageMetadata);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }

}


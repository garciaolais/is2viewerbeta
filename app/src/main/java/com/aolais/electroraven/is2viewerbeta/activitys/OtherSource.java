package com.aolais.electroraven.is2viewerbeta.activitys;

import android.content.Context;
import android.graphics.Bitmap;

import com.aolais.electroraven.is2viewerbeta.Is2.Is2File;
import com.aolais.electroraven.is2viewerbeta.utils.Desarialize;
import com.aolais.electroraven.is2viewerbeta.utils.ZipUtil;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * Created by w7 on 19/03/2015.
 */
public class OtherSource extends BaseImageDownloader {
    private static final String SCHEME_DB = "db";
    private static final String DB_URI_PREFIX = SCHEME_DB + ":/-";
    public String url="";

    public OtherSource(Context context){
        super(context);
    }
    @Override
    protected InputStream getStreamFromOtherSource(String imageUri, Object extra)throws IOException {
        if (imageUri.startsWith(DB_URI_PREFIX)) {
            String path = imageUri.substring(DB_URI_PREFIX.length());
            byte[] imageData=null;
            Bitmap bitmap=null;

            ZipUtil zipUtil=new ZipUtil();
            //String path="/sdcard/Download/ti400_20_250.IS2";
            Map<String,Object> irObject;
            if(zipUtil.HandleFile(path)) {
                irObject = new Desarialize(zipUtil.Getzipdata(path)).GetirObject();
                Is2File is2File = new Is2File(irObject);
                bitmap = is2File.GetIrBitmap();
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);

            imageData = byteArrayOutputStream.toByteArray();
            return new ByteArrayInputStream(imageData);
        } else {
            return super.getStreamFromOtherSource(imageUri, extra);
        }

    }

}

package com.aolais.electroraven.is2viewerbeta.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;


/**
 * Created by w7 on 21/02/2015.
 */
public class ZipUtil {

    public boolean HandleFile(String file) {
        boolean flag = false;
        String extension;
        String flukeExtension;
        flukeExtension = "is2";

        extension = file.substring(file.lastIndexOf(".") + 1, file.length());
        extension = extension.toLowerCase();

        if (extension.equals(flukeExtension)) {
            byte[] bFile;
            FileInputStream fileInputStream;
            bFile = new byte[file.length()];

            try {
                fileInputStream = new FileInputStream(file);
                fileInputStream.read(bFile);
                fileInputStream.close();
                if ((bFile[0] == 80) && (bFile[1] == 75)) {
                    flag = true;
                }
            } catch (IOException e) {
                flag = false;
                e.printStackTrace();
            }

        } else {
            flag = false;
        }

        return flag;
    }

    public List<ZipData> Getzipdata(String file) {
        String TAG = "Zip";
        String IS2path =file;
        byte buf[] = new byte[1024];
        ZipInputStream zipInputStream = null;
        List<ZipData> zipDataList = new ArrayList<>();
        ZipEntry zipentry = null;
        int n = 0;
        int j = 0;
        int mj = 0;

        ZipFile fis = null;
        try {
            fis = new ZipFile(IS2path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int i = 0;
        for (Enumeration e = fis.entries(); e.hasMoreElements(); ) {
            ZipEntry entry = (ZipEntry) e.nextElement();
            ZipData zipData = null;
            System.out.println(entry);
            System.out.println(i);
            byte[] buf_jpeg2 = new byte[(int) entry.getSize()];

            zipData = new ZipData(entry.getName());
            n = 0;
            mj = 0;


            if (entry.getName().contains("xfert")) {


            } else {
                InputStream in = null;
                try {
                    in = fis.getInputStream(entry);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

                try {
                    while ((n = in.read(buf, 0, 1024)) > -1) {
                        for (j = 0; j < n; j++) {
                            buf_jpeg2[j + mj] = buf[j];
                        }
                        mj = n + mj;
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

            }
            zipData.SetBuff(buf_jpeg2);
            zipDataList.add(zipData);

        }

      return zipDataList;
    }

}


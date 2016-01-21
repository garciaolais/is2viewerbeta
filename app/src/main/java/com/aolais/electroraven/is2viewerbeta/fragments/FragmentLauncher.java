package com.aolais.electroraven.is2viewerbeta.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import com.aolais.electroraven.is2viewerbeta.fileExplorer.FileExplorer;
import com.aolais.electroraven.is2viewerbeta.fileExplorer.FileItem;
import com.aolais.electroraven.is2viewerbeta.fileExplorer.ImageLauncher;


/**
 * Created by w7 on 17/03/2015.
 */
public class FragmentLauncher extends FragmentActivity {

    @Override
    public void onCreate(Bundle SaveInstance){
        super.onCreate(SaveInstance);
        int frIndex = getIntent().getIntExtra("frName",0);

        Fragment fragment=null;
        String tag="";

        switch (frIndex){
            case 100:
                tag= FileExplorer.class.getSimpleName();
                fragment=getSupportFragmentManager().findFragmentByTag(tag);

                if(fragment==null){
                    fragment=new FileExplorer();
                }
                break;
            case 200:
                FileItem fileItem=(FileItem)getIntent().getParcelableExtra("fileName");
                tag= ImageLauncher.class.getSimpleName();
                fragment=getSupportFragmentManager().findFragmentByTag(tag);

                if(fragment==null){
                    fragment=new ImageLauncher();
                    fragment.setArguments(getIntent().getExtras());
                }
                int x=100;
                break;

        }

        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, fragment, tag).commit();
    }
}
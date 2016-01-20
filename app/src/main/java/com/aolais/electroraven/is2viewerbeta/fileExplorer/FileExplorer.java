package com.aolais.electroraven.is2viewerbeta.fileExplorer;


import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.aolais.electroraven.is2viewerbeta.R;
import com.aolais.electroraven.is2viewerbeta.fragments.FragmentLauncher;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;





/**
 * Created by w7 on 17/03/2015.
 */
public class FileExplorer extends Fragment {
    DisplayImageOptions options;
    List<FileItem> mlistFiles = new ArrayList<FileItem>();

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        GetFiles();
        options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.drawable.ic_launcher)
                .showImageForEmptyUri(R.drawable.ic_launcher)
                .showImageOnFail(R.drawable.ic_launcher)
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .considerExifParams(true)
                .displayer(new RoundedBitmapDisplayer(10))
                .build();
    }
    @Override
    public  View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.list_view, container, false);
        ListView listView=(ListView)rootView.findViewById(android.R.id.list);
        listView.setAdapter(new ImageAdapter(mlistFiles));
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FileItem fileItem = mlistFiles.get(position);
                Intent intent = new Intent(getActivity(), FragmentLauncher.class);
                intent.putExtra("frName", 200);
                intent.putExtra("fileName",(Parcelable)fileItem);
                //intent.putExtra(Constants.Extra.IMAGE_POSITION, position);
                startActivity(intent);
            }
        });

        return rootView;
    }



    public void GetFiles(){
        //File externalDirectory=new File(Environment.getExternalStorageDirectory().getPath());
        File externalDirectory=new File("/sdcard/Download");//Only for rapid test
        File [] files=externalDirectory.listFiles();
        List<FileItem> listFiles = new ArrayList<FileItem>();
        List<FileItem> is2Files = new ArrayList<FileItem>();

        for(File currentFile:files){
            Date lastModDate=new Date(currentFile.lastModified());
            DateFormat dataFormat= DateFormat.getDateTimeInstance();
            String dateModfiy=dataFormat.format(lastModDate);
            if(currentFile.isDirectory()){
                File[] fbuf = currentFile.listFiles();
                int buf = 0;
                if(fbuf != null){
                    buf = fbuf.length;
                }
                else buf = 0;
                String num_item = String.valueOf(buf);
                if(buf == 0) num_item = num_item + " item";
                else num_item = num_item + " items";
                FileItem fileItem=new FileItem(currentFile.getName(),dateModfiy,num_item,currentFile.getAbsolutePath(),"file");
                listFiles.add(fileItem);
            }else if(currentFile.isFile()) {
                String extension= FilenameUtils.getExtension(currentFile.getPath().toLowerCase());
                if(extension.contains("is2")){
                    FileItem fileItem=new FileItem(currentFile.getName(),dateModfiy,currentFile.length() +  " byte",currentFile.getAbsolutePath(),"is2");
                    is2Files.add(fileItem);
                }
            }
        }
        Collections.sort(listFiles);
        Collections.sort(is2Files);
        listFiles.addAll(is2Files);
        mlistFiles.addAll(listFiles);
    }
    class ImageAdapter extends BaseAdapter   {
        private LayoutInflater inflater;
        private ImageLoadingListener animateFirstListener = new AnimateFirstDisplayListener();
        public List<FileItem> mlistFiles=new ArrayList<>();

        ImageAdapter(List<FileItem> listFiles){
            inflater = LayoutInflater.from(getActivity());
            mlistFiles.addAll(listFiles);
        }

        @Override
        public int getCount() {
            return mlistFiles.size();
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            View view=inflater.inflate(R.layout.item_list_complex,parent,false);
            ViewHolder_test viewHolder_test=new ViewHolder_test();
            viewHolder_test.text01=(TextView)view.findViewById(R.id.TextView01);
            viewHolder_test.text02=(TextView)view.findViewById(R.id.TextView02);
            viewHolder_test.textData=(TextView)view.findViewById(R.id.TextViewDate);
            viewHolder_test.image=(ImageView)view.findViewById(R.id.fd_Icon1);
            view.setTag(viewHolder_test);
            final FileItem fileItem=mlistFiles.get(i);
            viewHolder_test.text01.setText(fileItem.getName());
            viewHolder_test.text02.setText(fileItem.getDate());
            viewHolder_test.textData.setText(fileItem.getData());

            if(fileItem.getType().contains("file")){
                String uri="drawable://"  + R.drawable.folderpng2;
                try {
                    ImageLoader.getInstance().displayImage(uri, viewHolder_test.image, options, animateFirstListener);
                }catch (Exception e){
                    e.toString();
                }
            }else if(fileItem.getType().contains("is2")){

                String uri="db:/-" + fileItem.getPath();
                ImageLoader.getInstance().displayImage(uri,viewHolder_test.image,options,animateFirstListener);

            }
            return view;
        }

    }
    private static class AnimateFirstDisplayListener extends SimpleImageLoadingListener {

        static final List<String> displayedImages = Collections.synchronizedList(new LinkedList<String>());

        @Override
        public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
            if (loadedImage != null) {
                ImageView imageView = (ImageView) view;
                boolean firstDisplay = !displayedImages.contains(imageUri);
                if (firstDisplay) {
                    FadeInBitmapDisplayer.animate(imageView, 500);
                    displayedImages.add(imageUri);
                }
            }
        }
    }
    private static class ViewHolder_test {
        TextView text01;
        TextView text02;
        TextView textData;
        ImageView image;
    }


}

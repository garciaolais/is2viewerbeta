package com.aolais.electroraven.is2viewerbeta.fileExplorer;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by electroRaven on 16/03/2015.
 */
public class FileItem implements Comparable<FileItem>, Parcelable {
    private String name;
    private String date;
    private String data;
    private String path;
    private String type;

    public FileItem(String name, String date, String data, String path,String type) {
        this.name = name;
        this.date = date;
        this.data = data;
        this.path = path;
        this.type = type;
    }
    private FileItem(Parcel in) {
        name=in.readString();
        date=in.readString();
        data=in.readString();
        path=in.readString();
        type=in.readString();
    }

    public String getName(){
        return this.name;
    }
    public String getDate(){
        return this.date;
    }
    public String getData(){
        return this.data;
    }
    public String getPath(){
        return this.path;
    }
    public String getType(){
        return this.type;
    }


    @Override
    public int compareTo(FileItem fileItem) {
        if(this.name != null)
            return this.name.toLowerCase().compareTo(fileItem.getName().toLowerCase());
        else
            throw new IllegalArgumentException();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(date);
        dest.writeString(data);
        dest.writeString(path);
        dest.writeString(type);
    }


    private void readFromParcel(Parcel in) {
        name=in.readString();


    }

    public static final Parcelable.Creator<FileItem> CREATOR = new Parcelable.Creator<FileItem>() {
        public FileItem createFromParcel(Parcel in) {
            return new FileItem(in);
        }

        public FileItem[] newArray(int size) {
            return new FileItem[size];
        }
    };


}
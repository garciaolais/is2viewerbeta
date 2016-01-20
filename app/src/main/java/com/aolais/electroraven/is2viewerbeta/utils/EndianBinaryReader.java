package com.aolais.electroraven.is2viewerbeta.utils;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;

/**
 * Created by w7 on 02/03/2015.
 */
public class EndianBinaryReader {
    private byte buff[];



    public EndianBinaryReader(Map<String, Object> irObject) {
        buff=(byte[]) irObject.get("IR.data");
    }
    /*
    public UShort[][] ReadUint16Array(int cols,int rows){
    }
    */

    public void TestWrapper(){
        byte[] buff;
        byte[] buff2;
        int int16;
        int num;
        short snum;
        char cnum;

        buff=new byte[4];
        buff[0]=-1;
        buff[1]=-1;
        buff[2]=00;
        buff[3]=00;

        ByteBuffer byBuff=ByteBuffer.wrap(buff);
        byBuff.order(ByteOrder.LITTLE_ENDIAN);
        int16=byBuff.getInt();


        buff=new byte[2];
        buff[0]=-1;
        buff[1]=-1;

        byBuff=ByteBuffer.wrap(buff);
        byBuff.order(ByteOrder.LITTLE_ENDIAN);
        snum=byBuff.getShort();
        cnum=(char)snum;
        num=(int)cnum;

        buff2=new byte[2];
        buff2[0]= (byte) (cnum  & (0xff));;
        buff2[1]= (byte) (cnum  >> 8);;

        buff[0]=30;
    }
    public char[][] ReadUint16Array(int cols,int rows){
        int num=320;
        char[][] Uint16Array=new char[cols][rows];
        byte buff[]=new byte[2];
        ByteArrayInputStream is=new ByteArrayInputStream(this.buff,num *2,this.buff.length);;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                is.read(buff,0,2);
                if(j==319) {
                    Uint16Array[j][i] = this.ReadUint16(buff);
                }
                else{
                    Uint16Array[j][i] = this.ReadUint16(buff);
                }
            }
        }
        return Uint16Array=null;
    }
    public char ReadUint16(byte[]buff){



        return ReadLittleEndianChar(buff);
    }
    public char ReadLittleEndianChar(byte[]buff){
        short sNum;
        char cNum;
        ByteBuffer byBuff=ByteBuffer.wrap(buff);
        byBuff.order(ByteOrder.LITTLE_ENDIAN);
        sNum=byBuff.getShort();
        cNum=(char)sNum;

        return cNum;

    }

    public int[][]ReadIntArray(int cols,int rows){
        int num=320;
        int[][] intArray=new int[cols][rows];
        byte buff[]=new byte[2];
        ByteArrayInputStream is=new ByteArrayInputStream(this.buff,num *2,this.buff.length);;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                is.read(buff,0,2);
                    intArray[j][i] = this.ReadInt(buff);
            }
        }
        return intArray;

    }
    public int ReadInt(byte[]buff){
        int num;
        byte[] mbuff=new byte[4];
        mbuff[0]=buff[0];
        mbuff[1]=buff[1];
        mbuff[2]=0;
        mbuff[3]=0;
        ByteBuffer byBuff=ByteBuffer.wrap(mbuff);
        byBuff.order(ByteOrder.LITTLE_ENDIAN);
        num=byBuff.getInt();

        return num;
    }
}

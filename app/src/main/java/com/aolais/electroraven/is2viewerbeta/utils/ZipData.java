package com.aolais.electroraven.is2viewerbeta.utils;

/**
 * Created by w7 on 21/02/2015.
 */
public class ZipData {
    String member;
    String PathMember;
    byte buff[];

    public ZipData(String member){
        this.member=member;
    }

    public void SetPathMember(String PathMember){
        this.PathMember=PathMember;
    }

    public void SetBuff(byte Buff[]){
        this.buff=Buff;
    }

    public String getMember() {
        return member;
    }

    public String getPathMember() {
        return PathMember;
    }

    public byte[] getBuff() {
        return buff;
    }
}

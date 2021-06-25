package com.huang.pojo;


public class Customers {

    private int cID;
    private String cName;
    private String cWeChat;
    private long cTel;
    private String api;
    private String secret;
    private float re;
    private float reY;
    private float reM;
    private float reNow;

    public void setcID(int cID) {
        this.cID = cID;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setcWeChat(String cWeChat) {
        this.cWeChat = cWeChat;
    }

    public void setcTel(long cTel) {
        this.cTel = cTel;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public void setRe(float re) {
        this.re = re;
    }

    public void setReY(float reY) {
        this.reY = reY;
    }

    public void setReM(float reM) {
        this.reM = reM;
    }

    public void setReNow(float reNow) {
        this.reNow = reNow;
    }

    public int getcID() {
        return cID;
    }

    public String getcName() {
        return cName;
    }

    public String getcWeChat() {
        return cWeChat;
    }

    public long getcTel() {
        return cTel;
    }

    public String getApi() {
        return api;
    }

    public String getSecret() {
        return secret;
    }

    public float getRe() {
        return re;
    }

    public float getReY() {
        return reY;
    }

    public float getReM() {
        return reM;
    }

    public float getReNow() {
        return reNow;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "cID=" + cID +
                ", cName='" + cName + '\'' +
                ", cWeChat='" + cWeChat + '\'' +
                ", cTel=" + cTel +
                ", api='" + api + '\'' +
                ", secret='" + secret + '\'' +
                ", re=" + re +
                ", reY=" + reY +
                ", reM=" + reM +
                ", reNow=" + reNow +
                '}';
    }
}
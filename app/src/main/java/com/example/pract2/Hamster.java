package com.example.pract2;

public class Hamster {
    private String name;
    private String descr;
    private int imgRes;

    public Hamster(String name, String descr, int imgRes)
    {
        this.name=name;
        this.descr=descr;
        this.imgRes=imgRes;
    }

    public String getName(){return this.name;}

    public void setName(String name){this.name=name;}
    public String getDescr(){return this.descr;}
    public void setDescr(String capital){this.descr=descr;}
    public int getImgRes(){return this.imgRes;}
    public void setImgRes(int flagResource){this.imgRes= imgRes;}
}

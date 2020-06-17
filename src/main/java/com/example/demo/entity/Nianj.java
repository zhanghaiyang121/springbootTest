package com.example.demo.entity;

public class Nianj {
    private int num;//年级
    private int njnum;//班级数量
    private String njzr;//年级主任
    private int id;//主键



    public Nianj(int num, int njnum, String njzr, int id) {
        this.num = num;
        this.njnum = njnum;
        this.njzr = njzr;
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNjnum() {
        return njnum;
    }

    public void setNjnum(int njnum) {
        this.njnum = njnum;
    }

    public String getNjzr() {
        return njzr;
    }

    public void setNjzr(String njzr) {
        this.njzr = njzr;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Nianj{" +
                "num=" + num +
                ", njnum=" + njnum +
                ", njzr='" + njzr + '\'' +
                ", id=" + id +
                '}';
    }
}

package com.example.demo.entity;

public class Banji {
    private int peos;//班级人数
    private String bzr;//班主任

    public int getPeos() {
        return peos;
    }

    public void setPeos(int peos) {
        this.peos = peos;
    }

    public String getBzr() {
        return bzr;
    }

    public void setBzr(String bzr) {
        this.bzr = bzr;
    }
    public Banji(int peos,String bzr){
            this.peos=peos;
            this.bzr=bzr;
    }
    @Override
    public String toString() {
        return "Banji{" +
                "peos=" + peos +
                ", bzr='" + bzr + '\'' +
                '}';
    }
}

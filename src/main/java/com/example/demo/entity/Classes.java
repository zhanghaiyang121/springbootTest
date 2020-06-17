package com.example.demo.entity;

public class Classes {
    private Integer cid;
    private String className;
    private Integer studentNum;

    public Classes(Integer cid, String className, Integer studentNum) {
        this.cid = cid;
        this.className = className;
        this.studentNum = studentNum;
    }

    public Integer getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Integer studentNum) {
        this.studentNum = studentNum;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Class{" +
                "cid=" + cid +
                ", className='" + className + '\'' +
                ", studentNum=" + studentNum +
                '}';
    }
}

package com.example.demo.model;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer sNo;

    private String sName;

    private Short sAge;

    private Byte sSex;

    private static final long serialVersionUID = 1L;

    public Integer getsNo() {
        return sNo;
    }

    public void setsNo(Integer sNo) {
        this.sNo = sNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Short getsAge() {
        return sAge;
    }

    public void setsAge(Short sAge) {
        this.sAge = sAge;
    }

    public Byte getsSex() {
        return sSex;
    }

    public void setsSex(Byte sSex) {
        this.sSex = sSex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sNo=").append(sNo);
        sb.append(", sName=").append(sName);
        sb.append(", sAge=").append(sAge);
        sb.append(", sSex=").append(sSex);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
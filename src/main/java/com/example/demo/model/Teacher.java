package com.example.demo.model;

import java.io.Serializable;

public class Teacher implements Serializable {
    private Integer tNo;

    private String tName;

    private static final long serialVersionUID = 1L;

    public Integer gettNo() {
        return tNo;
    }

    public void settNo(Integer tNo) {
        this.tNo = tNo;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tNo=").append(tNo);
        sb.append(", tName=").append(tName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
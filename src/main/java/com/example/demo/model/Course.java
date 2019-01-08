package com.example.demo.model;

import java.io.Serializable;

public class Course implements Serializable {
    private Integer cNo;

    private String cName;

    private Integer tNo;

    private static final long serialVersionUID = 1L;

    public Integer getcNo() {
        return cNo;
    }

    public void setcNo(Integer cNo) {
        this.cNo = cNo;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Integer gettNo() {
        return tNo;
    }

    public void settNo(Integer tNo) {
        this.tNo = tNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cNo=").append(cNo);
        sb.append(", cName=").append(cName);
        sb.append(", tNo=").append(tNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
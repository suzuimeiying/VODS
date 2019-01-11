package com.qfedu.app.entity;

import java.util.Date;

public class BabyGrow {
    private Integer growId;

    private Integer growBabyid;

    private Date growTime;

    private String growMarke;

    private String growHeight;

    private String growWeight;

    private String growHeadsize;

    private Integer flag;

    public Integer getGrowId() {
        return growId;
    }

    public void setGrowId(Integer growId) {
        this.growId = growId;
    }

    public Integer getGrowBabyid() {
        return growBabyid;
    }

    public void setGrowBabyid(Integer growBabyid) {
        this.growBabyid = growBabyid;
    }

    public Date getGrowTime() {
        return growTime;
    }

    public void setGrowTime(Date growTime) {
        this.growTime = growTime;
    }

    public String getGrowMarke() {
        return growMarke;
    }

    public void setGrowMarke(String growMarke) {
        this.growMarke = growMarke == null ? null : growMarke.trim();
    }

    public String getGrowHeight() {
        return growHeight;
    }

    public void setGrowHeight(String growHeight) {
        this.growHeight = growHeight == null ? null : growHeight.trim();
    }

    public String getGrowWeight() {
        return growWeight;
    }

    public void setGrowWeight(String growWeight) {
        this.growWeight = growWeight == null ? null : growWeight.trim();
    }

    public String getGrowHeadsize() {
        return growHeadsize;
    }

    public void setGrowHeadsize(String growHeadsize) {
        this.growHeadsize = growHeadsize == null ? null : growHeadsize.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
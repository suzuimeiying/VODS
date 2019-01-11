package com.qfedu.app.entity;

import java.util.Date;

public class Baby {
    private Integer babyId;

    private Integer babyUid;

    private String babyImg;

    private String babyName;

    private Date babyBirthday;

    private Integer flag;


    public Integer getBabyId() {
        return babyId;
    }

    public void setBabyId(Integer babyId) {
        this.babyId = babyId;
    }

    public Integer getBabyUid() {
        return babyUid;
    }

    public void setBabyUid(Integer babyUid) {
        this.babyUid = babyUid;
    }

    public String getBabyImg() {
        return babyImg;
    }

    public void setBabyImg(String babyImg) {
        this.babyImg = babyImg == null ? null : babyImg.trim();
    }

    public String getBabyName() {
        return babyName;
    }

    public void setBabyName(String babyName) {
        this.babyName = babyName == null ? null : babyName.trim();
    }

    public Date getBabyBirthday() {
        return babyBirthday;
    }

    public void setBabyBirthday(Date babyBirthday) {
        this.babyBirthday = babyBirthday;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

}
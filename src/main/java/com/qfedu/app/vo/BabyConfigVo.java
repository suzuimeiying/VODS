package com.qfedu.app.vo;

import java.util.Date;

public class BabyConfigVo {
    private Integer babyId;

    private String babyImg;

    private String babyName;

    private Date babyBirthday;

    private String  photoId;

    private  String photoImg;

    public Integer getBabyId() {
        return babyId;
    }

    public void setBabyId(Integer babyId) {
        this.babyId = babyId;
    }

    public String getBabyImg() {
        return babyImg;
    }

    public void setBabyImg(String babyImg) {
        this.babyImg = babyImg;
    }

    public String getBabyName() {
        return babyName;
    }

    public void setBabyName(String babyName) {
        this.babyName = babyName;
    }

    public Date getBabyBirthday() {
        return babyBirthday;
    }

    public void setBabyBirthday(Date babyBirthday) {
        this.babyBirthday = babyBirthday;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getPhotoImg() {
        return photoImg;
    }

    public void setPhotoImg(String photoImg) {
        this.photoImg = photoImg;
    }
}

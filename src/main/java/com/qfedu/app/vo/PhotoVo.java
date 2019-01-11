package com.qfedu.app.vo;

import java.util.Date;

public class PhotoVo {
    private Integer babyId;

    private Integer babyUid;

    private String babyImg;

    private String babyName;

    private Date babyBirthday;

    private Integer flag;

    private Integer photoId;

    private Integer photoBabyid;

    private String photoImg;

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

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Integer photoId) {
        this.photoId = photoId;
    }

    public Integer getPhotoBabyid() {
        return photoBabyid;
    }

    public void setPhotoBabyid(Integer photoBabyid) {
        this.photoBabyid = photoBabyid;
    }

    public String getPhotoImg() {
        return photoImg;
    }

    public void setPhotoImg(String photoImg) {
        this.photoImg = photoImg;
    }
}

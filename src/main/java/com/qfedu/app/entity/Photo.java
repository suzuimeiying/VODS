package com.qfedu.app.entity;

import java.util.Date;

public class Photo {
    private Integer photoId;

    private Integer photoBabyid;

    private String photoImg;

    private Date photoTime;

    private String photoMarke;

    private Integer flag;

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

    public Date getPhotoTime() {
        return photoTime;
    }

    public void setPhotoTime(Date photoTime) {
        this.photoTime = photoTime;
    }

    public String getPhotoMarke() {
        return photoMarke;
    }

    public void setPhotoMarke(String photoMarke) {
        this.photoMarke = photoMarke;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
package com.qfedu.app.vo;

import java.util.Date;

public class BabyVo {
    private Integer id;

    private String name;

    private String password;

    private String email;

    private String tel;

    private Integer flag;

    private Integer babyId;

    private Integer babyUid;

    private String babyImg;

    private String babyName;

    private Date babyBirthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

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
}

package com.qfedu.app.entity;

public class Goods {
    private Integer goodsId;

    private String goodsImg;

    private String goodsName;

    private String goodsPrice;

    private String goodsVipprice;

    private String goodsMarke;

    private Integer flag;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg == null ? null : goodsImg.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice == null ? null : goodsPrice.trim();
    }

    public String getGoodsVipprice() {
        return goodsVipprice;
    }

    public void setGoodsVipprice(String goodsVipprice) {
        this.goodsVipprice = goodsVipprice == null ? null : goodsVipprice.trim();
    }

    public String getGoodsMarke() {
        return goodsMarke;
    }

    public void setGoodsMarke(String goodsMarke) {
        this.goodsMarke = goodsMarke == null ? null : goodsMarke.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
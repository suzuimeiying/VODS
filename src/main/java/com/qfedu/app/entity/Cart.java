package com.qfedu.app.entity;

public class Cart {
    private Integer cartId;

    private Integer cartUid;

    private Integer cartGoodsid;

    private String cartGoodssize;

    private String cartGoodscolor;

    private String cartAddress;

    private String cartGoodsnumber;

    private Integer cartFlag;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getCartUid() {
        return cartUid;
    }

    public void setCartUid(Integer cartUid) {
        this.cartUid = cartUid;
    }

    public Integer getCartGoodsid() {
        return cartGoodsid;
    }

    public void setCartGoodsid(Integer cartGoodsid) {
        this.cartGoodsid = cartGoodsid;
    }

    public String getCartGoodssize() {
        return cartGoodssize;
    }

    public void setCartGoodssize(String cartGoodssize) {
        this.cartGoodssize = cartGoodssize == null ? null : cartGoodssize.trim();
    }

    public String getCartGoodscolor() {
        return cartGoodscolor;
    }

    public void setCartGoodscolor(String cartGoodscolor) {
        this.cartGoodscolor = cartGoodscolor == null ? null : cartGoodscolor.trim();
    }

    public String getCartAddress() {
        return cartAddress;
    }

    public void setCartAddress(String cartAddress) {
        this.cartAddress = cartAddress == null ? null : cartAddress.trim();
    }

    public String getCartGoodsnumber() {
        return cartGoodsnumber;
    }

    public void setCartGoodsnumber(String cartGoodsnumber) {
        this.cartGoodsnumber = cartGoodsnumber == null ? null : cartGoodsnumber.trim();
    }

    public Integer getCartFlag() {
        return cartFlag;
    }

    public void setCartFlag(Integer cartFlag) {
        this.cartFlag = cartFlag;
    }
}
package com.qfedu.app.dao;

import com.qfedu.app.entity.Cart;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer cartId);

    //添加
    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer cartId);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    //展示购物车里的所有商品
    List<Cart> selectAllGoods(Integer userId);


}
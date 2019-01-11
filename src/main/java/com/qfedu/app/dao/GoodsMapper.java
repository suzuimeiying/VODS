package com.qfedu.app.dao;

import com.qfedu.app.entity.Goods;
import com.qfedu.app.vo.PageBeanVo;

import java.util.List;

public interface GoodsMapper {

    //根据id查
    int deleteByPrimaryKey(Integer goodsId);

    //添加商品
    int insert(Goods record);

    int insertSelective(Goods record);

    //根据商品id查询单个商品内容
    Goods selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    //查询所有商品
    List<Goods> all(Integer flag);

    //查询相册商品
    List <Goods> selectphoto(Integer flag);


}
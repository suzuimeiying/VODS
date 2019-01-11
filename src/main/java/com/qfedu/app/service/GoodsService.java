package com.qfedu.app.service;

import com.qfedu.app.entity.Goods;
import com.qfedu.app.vo.JsonVo;

public interface GoodsService {

    //查询全部商品（优品）
    JsonVo findAllGoods();


    //查询全部相册商品
    JsonVo findPhtotGoods();

    //查询特定类型商品根据flag
    JsonVo selectgoodsbyflag(Integer flag);

    //根据商品id查询单个商品内容
    JsonVo selectById(Integer flag);





}

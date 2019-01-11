package com.qfedu.app.service;

import com.qfedu.app.entity.Goods;
import com.qfedu.app.vo.JsonVo;

public interface GoodsService {
    //增
    JsonVo insert(Goods goods);

    //删
    JsonVo deleteById(Integer goodsId);

    //改
    JsonVo updateById(Goods goods);
    //查询全部
    JsonVo findAll(Integer flag);

    //根据商品id查询单个商品内容
    JsonVo selectById(Integer flag);





}

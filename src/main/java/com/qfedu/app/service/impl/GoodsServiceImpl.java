package com.qfedu.app.service.impl;

import com.qfedu.app.dao.GoodsMapper;
import com.qfedu.app.entity.Goods;
import com.qfedu.app.service.GoodsService;

import com.qfedu.app.vo.JsonVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsDao;


    //查询所有商品
    @Override
    public JsonVo findAllGoods() {
        List<Goods> all = goodsDao.selectallgoods();

        if (all!=null){
            return JsonVo.setOK(all);
        }
            return  JsonVo.setERROR();
    }
    //查询所有相册商品
    @Override
    public JsonVo findPhtotGoods() {
        List<Goods> all = goodsDao.selectphotogoods();

        if (all!=null){
            return JsonVo.setOK(all);
        }
        return  JsonVo.setERROR();
    }

    //查询特定类型商品根据flag
    @Override
    public JsonVo selectgoodsbyflag(Integer flag) {
        List<Goods> goodsList = goodsDao.selectgoodsbyflag(flag);
        if ( goodsList != null){
            return JsonVo.setOK(goodsList);
        }
        return JsonVo.setERROR();
    }

    //根据商品id查询单个商品内容
    @Override
    public JsonVo selectById(Integer id) {
        Goods goods = goodsDao.selectByPrimaryKey(id);
        if(goods!=null){
            return JsonVo.setOK(goods);
        }

        return JsonVo.setERROR();
    }
}

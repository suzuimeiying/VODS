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


    //添加商品
    @Override
    public JsonVo insert(Goods goods) {
       if(goodsDao.insert(goods)>0){
           return JsonVo.setOK(1);
       }

        return JsonVo.setERROR();
    }
    //根据id删除
    @Override
    public JsonVo deleteById(Integer goodsId) {
        if(goodsDao.deleteByPrimaryKey(goodsId)!=0){
            return JsonVo.setOK(1);
        }
        return JsonVo.setERROR();
    }

    //更新商品
    @Override
    public JsonVo updateById(Goods goods) {
       if( goodsDao.updateByPrimaryKey(goods)>0){
           return JsonVo.setOK(1);
       }
        return JsonVo.setERROR();
    }
    //查询所有商品
    @Override
    public JsonVo findAll(Integer flag) {
        List<Goods> all = goodsDao.all(flag);

        if (all!=null){
            return JsonVo.setOK(all);
        }
            return  JsonVo.setERROR();
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

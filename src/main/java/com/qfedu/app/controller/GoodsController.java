package com.qfedu.app.controller;

import com.qfedu.app.entity.Goods;
import com.qfedu.app.service.GoodsService;
import com.qfedu.app.vo.JsonVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/goods")
@Api(produces = "这是Java编写的接口文档",value = "接口文档")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;
    //添加商品
    @ApiOperation(notes = "后台添加商品",tags = {"添加商品"},value = "添加")
    @RequestMapping("/addgoods.do")
    public JsonVo insert(Goods goods){

        return goodsService.insert(goods);

    }
    //根据id删除商品
    @ApiOperation(notes = "后台删除商品",tags = {"删除商品"},value = "删除")
    @RequestMapping("/deletegoods.do")
    public JsonVo delete(Integer goodsId){

        return goodsService.deleteById(goodsId);

    }

    //根据id更新商品
    @ApiOperation(notes = "后天更新商品",tags = {"更新商品"},value = "更新")
    @RequestMapping("/updategoods.do")
    public JsonVo update(Goods goods){

        return goodsService.updateById(goods);
    }
    //根据传入的flag类型对应商品
    @ApiOperation(notes = "查询所有商品",tags = {"显示商品首页"},value = "根据flag商品显示")
    /*@RequestMapping("/listgoods.do")*/
    @GetMapping("/listgoods.do")
    public JsonVo selectAll(Integer flag){

        return goodsService.findAll(flag);
    }

    //根据商品id查询详细内容
    @ApiOperation(notes = "根据商品id查询商品内容",tags = {"显示商品信息"},value = "商品id进行查询")
    @GetMapping("/onegoodsById")
    public JsonVo selectById(Integer goodsId){

        return   goodsService.selectById(goodsId);
    }




}

package com.qfedu.app.controller;

import com.qfedu.app.entity.Goods;
import com.qfedu.app.service.GoodsService;
import com.qfedu.app.vo.JsonVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/goods")
@Api(produces = "这是Java编写的接口文档",value = "接口文档")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    //查询所有的商品
    @ApiOperation(notes = "查询所有商品",tags = {"优品-显示所有商品"},value = "初始化所有商品展示")
    /*@RequestMapping("/listgoods.do")*/
    @GetMapping("/allgoods.do")
    public JsonVo selectAllGoods(){
        return JsonVo.setOK(goodsService.findAllGoods());
    }

    //查询所有的相册商品
    @ApiOperation(notes = "查询所有的相册商品",tags = {"我的-相册商品"},value = "我的-制作相册-初始化显示所有相册商品")
    @GetMapping("/allphotogoods.do")
    public JsonVo selectPhotoGoods(){

        return JsonVo.setOK(goodsService.findPhtotGoods());
    }

    //根据商品id查询详细内容
    @ApiOperation(notes = "根据查询类型id查询商品内容",tags = {"优品-按需查询商品"},value = "查询特定类型商品")
    @PostMapping("/findgoodsbyflag.do")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "flag",value = "按照清洁flag=1、喂养flag=2、童装flag=3，其他flag=4，展示不同类型商品",paramType = "Integer",required = true),
    })
    public JsonVo selectById(Integer flag){

        return   goodsService.selectgoodsbyflag(flag);
    }




}

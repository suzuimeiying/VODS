package com.qfedu.app.controller;

import com.qfedu.app.entity.Cart;
import com.qfedu.app.entity.UserLogin;
import com.qfedu.app.service.CartService;
import com.qfedu.app.util.JWT;
import com.qfedu.app.vo.JsonVo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService service;

    //把商品加入到购物车
    @ApiOperation(notes = "购物车",tags = {"添加商品到购物车"},value = "优品-点击加入购物车添加到购物车")
    @PostMapping("/addcart.do")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "goodsId",value = "商品id",paramType = "Integer",required = true),
            @ApiImplicitParam(name = "token",value = "token",paramType = "String",required = true),
            @ApiImplicitParam(name = "cartGoodssize",value = "商品尺寸",paramType = "String",required = false),
            @ApiImplicitParam(name = "cartGoodscolor",value = "商品颜色",paramType = "String",required = false),
            @ApiImplicitParam(name = "cartAddress",value = "收货地址",paramType = "String",required = false),
            @ApiImplicitParam(name = "cartGoodsnumber",value = "商品数量",paramType = "String",required = false),
    })
    public JsonVo addcart(Integer goodsId, String token,String cartGoodssize, String cartGoodscolor, String cartAddress, String cartGoodsnumber, Integer cartFlag){
        UserLogin user = JWT.unsign(token, UserLogin.class);

        Cart cart = new Cart();
        cart.setCartUid(user.getId());
        cart.setCartGoodssize(cartGoodssize);
        cart.setCartGoodscolor(cartGoodscolor);
        cart.setCartAddress(cartAddress);
        cart.setCartGoodsnumber(cartGoodsnumber);
        cart.setCartFlag(1);

        return service.insert(cart);

    }

    //把商品加入到购物车
    @ApiOperation(notes = "购物车",tags = {"优品-直接购买商品"},value = "优品-点击直接购买添加")
    @PostMapping("/pay.do")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "goodsId",value = "商品id",paramType = "Integer",required = true),
            @ApiImplicitParam(name = "token",value = "token",paramType = "String",required = true),
            @ApiImplicitParam(name = "cartGoodssize",value = "商品尺寸",paramType = "String",required = false),
            @ApiImplicitParam(name = "cartGoodscolor",value = "商品颜色",paramType = "String",required = false),
            @ApiImplicitParam(name = "cartAddress",value = "收货地址",paramType = "String",required = false),
            @ApiImplicitParam(name = "cartGoodsnumber",value = "商品数量",paramType = "String",required = false),
    })
    public JsonVo pay(Integer goodsId, String token,String cartGoodssize, String cartGoodscolor, String cartAddress, String cartGoodsnumber, Integer cartFlag){
        UserLogin user = JWT.unsign(token, UserLogin.class);

        Cart cart = new Cart();
        cart.setCartUid(user.getId());
        cart.setCartGoodssize(cartGoodssize);
        cart.setCartGoodscolor(cartGoodscolor);
        cart.setCartAddress(cartAddress);
        cart.setCartGoodsnumber(cartGoodsnumber);
        cart.setCartFlag(1);

        return service.insert(cart);

    }


}

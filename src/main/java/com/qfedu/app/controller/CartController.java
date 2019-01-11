package com.qfedu.app.controller;

import com.qfedu.app.entity.Cart;
import com.qfedu.app.entity.UserLogin;
import com.qfedu.app.service.CartService;
import com.qfedu.app.util.JWT;
import com.qfedu.app.vo.JsonVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService service;

    //把商品加入到购物车
    @ApiOperation(notes = "购物车",tags = {"添加商品到购物车"},value = "添加")
    @GetMapping("/addcart.do")
    public JsonVo addcart(Integer goodsId, String token, Integer cartGoodsid, String cartGoodssize, String cartGoodscolor, String cartAddress, String cartGoodsnumber, Integer cartFlag){
        UserLogin user = JWT.unsign(token, UserLogin.class);

        Cart cart = new Cart();
        cart.setCartUid(user.getId());
        cart.setCartGoodssize(cartGoodssize);
        cart.setCartGoodscolor(cartGoodscolor);
        cart.setCartAddress(cartAddress);
        cart.setCartGoodsnumber(cartGoodsnumber);

        return service.insert(cart);

    }


}

package com.qfedu.app.service.impl;

import com.qfedu.app.dao.CartMapper;
import com.qfedu.app.entity.Cart;
import com.qfedu.app.service.CartService;
import com.qfedu.app.vo.JsonVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;


    @Override
    public JsonVo insert(Cart cart) {
         if(cartMapper.insert(cart)>0){
             return JsonVo.setOK(1);
         }

        return JsonVo.setERROR();
    }
}

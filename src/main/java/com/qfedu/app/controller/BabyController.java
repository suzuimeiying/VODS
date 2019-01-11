package com.qfedu.app.controller;

import com.qfedu.app.service.BabyService;
import com.qfedu.app.vo.JsonVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/baby")
@Api(produces = "这是Java编写的接口文档",value = "接口文档")
public class BabyController {

    @Autowired
    private BabyService babyService;

    @RequestMapping("babyInfo.do")
    //根据用户的id查询baby的信息
    public JsonVo selectBabyInfoById(Integer id) {

      return babyService.selectBabyInfoById(id);
    }

    @RequestMapping("findAllPhoto.do")
    //根据baby的id查询其照片
    public JsonVo findAllPhoto(Integer babyId) {

        return babyService.findAllPhoto(babyId);
    }

    @RequestMapping("babyGrow.do")
    //根据baby的id查询其成长记录
    public JsonVo babyGrow(Integer babyId) {

        return babyService.babyGrow(babyId);
    }
}
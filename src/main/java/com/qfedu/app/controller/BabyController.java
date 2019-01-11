package com.qfedu.app.controller;

import com.qfedu.app.entity.UserLogin;
import com.qfedu.app.service.BabyService;
import com.qfedu.app.util.JWT;
import com.qfedu.app.vo.BabyConfigVo;
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
@RequestMapping("/baby")
@Api(produces = "这是Java编写的接口文档",value = "接口文档")
public class BabyController {

    @Autowired
    private BabyService babyService;

    @GetMapping("babyInfo.do")
    @ApiOperation(notes = "baby信息初始化",tags = {"时光机-页面初始化"},value = "根据token信息展示所拥有的baby")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token",value = "Token",paramType = "String",required = true),
    })
    //通过baby家长id查找babyinfo，自定义VO类
    public JsonVo selectBabyInfoById(String token) {
        UserLogin user = JWT.unsign(token, UserLogin.class);

      return babyService.selectBabyInfoById(user.getId());
    }

    @GetMapping("findAllPhoto.do")
    @ApiOperation(notes = "baby所有照片信息",tags = {"时光机-云相册"},value = "点击云相册展示所有的照片")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "babyId",value = "宝宝的ID",paramType = "Integer",required = true),
    })
    //根据baby的id查询其照片
    public JsonVo findAllPhoto(Integer babyId) {

        return babyService.findAllPhoto(babyId);
    }

    @GetMapping("babyGrow.do")
    @ApiOperation(notes = "baby成长信息",tags = {"时光机-成长记录"},value = "点击成长记录展示所有的记录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "babyId",value = "宝宝的ID",paramType = "Integer",required = true),
    })
    //根据baby的id查询其成长记录
    public JsonVo babyGrow(Integer babyId) {

        return babyService.babyGrow(babyId);
    }

    @PostMapping("addbabyGrow.do")
    //根据baby的id查询其成长记录
    public JsonVo addGrow(Integer babyId) {

        return null;
    }

}
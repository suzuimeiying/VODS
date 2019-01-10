package com.qfedu.app.controller;


import com.qfedu.app.entity.UserDetail;
import com.qfedu.app.entity.UserLogin;
import com.qfedu.app.service.UserService;
import com.qfedu.app.service.impl.UserServiceImpl;
import com.qfedu.app.util.AES;
import com.qfedu.app.vo.ResultVo;
import io.swagger.annotations.*;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xt.tutorial.utils.JWT;

@RestController
@RequestMapping("/user")
@Api(produces = "这是Java编写的接口文档",value = "接口文档")
public class UserController {
/*
    @GetMapping("/test")
    @ApiOperation(notes = "测试一下",tags = {"测试用的"},value = "hello word")
    public String getStr(){
        return "hello";
    }*/

    @Autowired
    UserService userService;

    //添加新的用户----注册
    @PostMapping("/register.do")
    @ApiOperation(notes = "注册",tags = {"注册"},value = "会员用户注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "用户名字",type = "string",required = true),
            @ApiImplicitParam(name = "password",value = "密码",type = "string",required = true),
            @ApiImplicitParam(name = "email",value = "邮箱",type = "string",required = false),
            @ApiImplicitParam(name = "tel",value = "电话",type = "string",required = false)


    })
    public ResultVo insert(String name, String password, String email, String tel ){
        //新的用户
        UserLogin userLogin = new UserLogin();
        //用户信息
        UserDetail userDetail = new UserDetail();


        try {
            userLogin.setName(name);
            userLogin.setPassword(AES.Encrypt(password,"1234567890123456"));
            userLogin.setEmail(email);
            userLogin.setTel(tel);
            userLogin.setFlag(1);

            //添加userLogin
            int id = userService.insert(userLogin);
            //添加userDetail
            userDetail.setDetailUid(id);
            userDetail.setDetailImgurl("http://pic3.nipic.com/20090529/778031_095637027_2.jpg");
            userDetail.setDetailFans("0");
            userDetail.setDetailFocus("0");
            userDetail.setFlag(1);
            userService.insertUserDetail(userDetail);
            return ResultVo.setOK();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVo.setERROR();
        }

    }


    //登录验证
    @PostMapping("/login.do")
    @ApiOperation(notes = "登录",tags = {"登录"},value = "用户登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "用户名字",paramType = "string",required = true),
            @ApiImplicitParam(name = "password",value = "密码",paramType = "string",required = true),
    })
    public ResultVo login(String name, String password){

        ResultVo user = null;
        try {
            user = userService.login(name,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;

    }


    @GetMapping("/my.do")
    @ApiOperation(notes = "我的主页面初始化用户",tags = {"我的主页面"},value = "初始化")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token",value = "Token",paramType = "string",required = true),
    })
    public ResultVo my(String token){
        UserLogin user = JWT.unsign(token, UserLogin.class);
        if (user != null) {

            UserDetail userDetail = userService.selectUserDetailById(user.getId());
            if (userDetail == null){
                System.out.println("token查询 为空");
            }

            return ResultVo.setOK().putDataValue("userDetail", userDetail);

        }
        return  ResultVo.setERROR();
    }

}

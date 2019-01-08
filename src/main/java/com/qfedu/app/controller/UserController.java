package com.qfedu.app.controller;


import com.qfedu.app.entity.UserLogin;
import com.qfedu.app.service.UserService;
import com.qfedu.app.util.AES;
import com.qfedu.app.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
            @ApiImplicitParam(name = "用户名",value = "name",type = "string"),
            @ApiImplicitParam(name = "密码",value = "password",type = "string"),
            @ApiImplicitParam(name = "邮箱",value = "email",type = "string"),
            @ApiImplicitParam(name = "电话",value = "tel",type = "string")


    })
    public ResultVo insert(String name, String password, String email, String tel ){
        ResultVo resultVo = new ResultVo();
        //新的用户
        UserLogin userLogin = new UserLogin();
        userLogin.setName(name);
        userLogin.setPassword(AES.encrypt("8856",password));
        userLogin.setEmail(email);
        userLogin.setTel(tel);
        userLogin.setFlag(1);

        try {
            //添加
            userService.insert(userLogin);
            resultVo.setCode(1);
            resultVo.setMsg("注册成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultVo.setCode(0);
            resultVo.setData(e.getMessage());
        }

        return  resultVo;

    }


    //登录验证
    @RequestMapping("/login.do")
    public ResultVo login(String name, String password){

        ResultVo user = userService.login(name,password);
        //完成登录认证
        if(user.getCode()==1) {

            //1、获取主题
            Subject subject= SecurityUtils.getSubject();

            //2、设置登录的Token
            UsernamePasswordToken token=new UsernamePasswordToken(name, password);
            //token.setRememberMe(true);  记住我 将用户名和密码存储到Cookie中

            //3、存储数据到Session
            subject.getSession().setAttribute("user", user.getData());

            //UserLogin user=(UserLogin) SecurityUtils.getSubject().getSession().getAttribute("user");-----获取Token

            //4、登录认证
            subject.login(token);
        }
        return user;

    }










}

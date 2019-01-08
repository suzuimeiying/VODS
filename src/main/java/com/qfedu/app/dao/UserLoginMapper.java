package com.qfedu.app.dao;

import com.qfedu.app.entity.UserLogin;

public interface UserLoginMapper {
    int deleteByPrimaryKey(Integer id);

    //添加新的用户
    int insert(UserLogin record);


    int insertSelective(UserLogin record);

    UserLogin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserLogin record);

    int updateByPrimaryKey(UserLogin record);


    //通过名字查找user
    UserLogin selectUserLoginByName(String name);



}
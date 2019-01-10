package com.qfedu.app.dao;


import com.qfedu.app.entity.UserDetail;

public interface UserDetailMapper {
    int deleteByPrimaryKey(Integer detailId);

    //添加新的用户信息--注册时默认添加用户信息默认值；
    int insert(UserDetail record);

    int insertSelective(UserDetail record);

    UserDetail selectByPrimaryKey(Integer detailId);

    int updateByPrimaryKeySelective(UserDetail record);

    int updateByPrimaryKey(UserDetail record);

    //通过login_id查找user详细信息
    UserDetail selectUserDetailById(Integer uid);
}
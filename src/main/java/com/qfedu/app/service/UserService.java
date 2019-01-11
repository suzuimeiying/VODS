package com.qfedu.app.service;

import com.qfedu.app.entity.UserDetail;
import com.qfedu.app.entity.UserLogin;
import com.qfedu.app.vo.JsonVo;

public interface UserService {
    //添加新的用户
    int insert(UserLogin record);
    //添加新的用户信息--注册时默认添加用户信息默认值；
    int insertUserDetail(UserDetail userDetail);

    //登录验证---查找用户名对比用户是否存在,密码是否正确
    JsonVo login(String userName, String password);

    //通过login_id查找user详细信息
    UserDetail selectUserDetailById(Integer uid);


}

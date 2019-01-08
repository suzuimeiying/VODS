package com.qfedu.app.service;

import com.qfedu.app.entity.UserLogin;
import com.qfedu.app.vo.ResultVo;

public interface UserService {
    //添加新的用户
    int insert(UserLogin record);

    //登录验证---查找用户名对比用户是否存在,密码是否正确
    ResultVo login(String userName, String password);


}

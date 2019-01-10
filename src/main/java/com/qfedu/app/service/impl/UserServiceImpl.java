package com.qfedu.app.service.impl;

import com.qfedu.app.dao.UserDetailMapper;
import com.qfedu.app.dao.UserLoginMapper;
import com.qfedu.app.entity.UserDetail;
import com.qfedu.app.entity.UserLogin;
import com.qfedu.app.service.UserService;
import com.qfedu.app.util.AES;
import com.qfedu.app.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xt.tutorial.utils.JWT;

import java.util.Map;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserLoginMapper userLoginDao;
    @Autowired
    private UserDetailMapper userDetailDao;

    //添加新的用户---注册
    @Override
    public int insert(UserLogin record) {
        int i = userLoginDao.insert(record);
        return i;
    }
    //添加新的用户信息--注册时默认添加用户信息默认值；
    @Override
    public int insertUserDetail(UserDetail userDetail) {
        int insert = userDetailDao.insert(userDetail);
        return insert;
    }


    //登录验证---查找用户名对比用户是否存在,密码是否正确
    @Override
    public ResultVo login(String userName, String password){

        UserLogin user = userLoginDao.selectUserLoginByName(userName);

        //判断是否存在该用户
        if (user != null) {
            //存在就判断密码正确与否
            try {
                if ((user.getPassword()).equals(AES.Encrypt(password,"1234567890123456"))) {
                     //登录成功
                    ResultVo resultVo = ResultVo.setOK();

                    resultVo.putDataValue("user",user);

                    String token = JWT.sign(user, 30L * 24L * 3600L * 1000L);
                    if (token != null) {
                        resultVo.putDataValue("token",token);
                    }
                    return resultVo;

                 }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ResultVo.setERROR();
    }


    //通过login_id查找user详细信息
    @Override
    public UserDetail selectUserDetailById(Integer uid) {
        return userDetailDao.selectUserDetailById(uid);
    }

}

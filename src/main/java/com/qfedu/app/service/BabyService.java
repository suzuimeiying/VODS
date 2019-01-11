package com.qfedu.app.service;

import com.qfedu.app.vo.BabyConfigVo;
import com.qfedu.app.vo.JsonVo;

import java.util.List;

public interface BabyService {

    //通过token中的用户（家长）id查找其bady信息（自定义）
    JsonVo selectBabyInfoById(Integer id);

    //通过前端返回的babyId查找其photo
    JsonVo findAllPhoto(Integer babyId);

    //根据baby的id查找对应的成长记录
    JsonVo babyGrow(Integer babyId);
}

package com.qfedu.app.service;

import com.qfedu.app.vo.JsonVo;

public interface BabyService {

    //通过前端返回的用户id查找其bady
    JsonVo selectBabyInfoById(Integer id);

    //通过前端返回的babyId查找其photo
    JsonVo findAllPhoto(Integer babyId);

    //根据baby的id查找对应的成长记录
    JsonVo babyGrow(Integer babyId);
}

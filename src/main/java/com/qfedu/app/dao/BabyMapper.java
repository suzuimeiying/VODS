package com.qfedu.app.dao;


import com.qfedu.app.entity.Baby;
import com.qfedu.app.vo.BabyConfigVo;

import java.util.List;

public interface BabyMapper {
    int deleteByPrimaryKey(Integer babyId);

    int insert(Baby record);

    int insertSelective(Baby record);

    Baby selectByPrimaryKey(Integer babyId);

    int updateByPrimaryKeySelective(Baby record);

    int updateByPrimaryKey(Baby record);

    //通过token中的用户（家长）id查找其bady信息（自定义）
    List<BabyConfigVo> selectBabyInfoById(Integer id);
}
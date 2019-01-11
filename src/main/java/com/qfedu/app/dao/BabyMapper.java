package com.qfedu.app.dao;


import com.qfedu.app.entity.Baby;
import com.qfedu.app.vo.BabyVo;

import java.util.List;

public interface BabyMapper {
    int deleteByPrimaryKey(Integer babyId);

    int insert(Baby record);

    int insertSelective(Baby record);

    Baby selectByPrimaryKey(Integer babyId);

    int updateByPrimaryKeySelective(Baby record);

    int updateByPrimaryKey(Baby record);

    //通过前端返回的用户id查找其bady
    List<BabyVo> selectBabyInfoById(Integer id);
}
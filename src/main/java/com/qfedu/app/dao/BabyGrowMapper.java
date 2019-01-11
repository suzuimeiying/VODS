package com.qfedu.app.dao;


import com.qfedu.app.entity.BabyGrow;
import com.qfedu.app.vo.GrowVo;

import java.util.List;

public interface BabyGrowMapper {
    int deleteByPrimaryKey(Integer growId);

    int insert(BabyGrow record);

    int insertSelective(BabyGrow record);

    BabyGrow selectByPrimaryKey(Integer growId);

    int updateByPrimaryKeySelective(BabyGrow record);

    int updateByPrimaryKey(BabyGrow record);

    //根据baby的id查询baby的成长记录
    List<GrowVo> babyGrow(Integer babyId);
}
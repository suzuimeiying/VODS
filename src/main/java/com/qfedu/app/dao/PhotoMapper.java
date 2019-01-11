package com.qfedu.app.dao;

import com.qfedu.app.entity.Photo;
import com.qfedu.app.vo.PhotoVo;

import java.util.List;

public interface PhotoMapper {
    int deleteByPrimaryKey(Integer photoId);

    int insert(Photo record);

    int insertSelective(Photo record);

    Photo selectByPrimaryKey(Integer photoId);

    int updateByPrimaryKeySelective(Photo record);

    int updateByPrimaryKey(Photo record);

    //根据baby的babyId查询baby的照片
    List<PhotoVo> findAllPhoto(Integer babyId);
}
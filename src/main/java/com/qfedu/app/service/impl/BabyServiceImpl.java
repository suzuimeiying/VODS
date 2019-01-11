package com.qfedu.app.service.impl;

import com.qfedu.app.dao.BabyGrowMapper;
import com.qfedu.app.dao.BabyMapper;
import com.qfedu.app.dao.PhotoMapper;
import com.qfedu.app.entity.Photo;
import com.qfedu.app.service.BabyService;
import com.qfedu.app.vo.BabyConfigVo;
import com.qfedu.app.vo.GrowVo;
import com.qfedu.app.vo.JsonVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BabyServiceImpl implements BabyService {

    @Autowired
    private BabyMapper babyDao;

    @Autowired
    private PhotoMapper photoDao;

    @Autowired
    private BabyGrowMapper growDao;

    @Override
    //通过token中的用户（家长）id查找其bady信息（自定义）
    public JsonVo selectBabyInfoById(Integer id) {
        List<BabyConfigVo> list = babyDao.selectBabyInfoById(id);
        return JsonVo.setOK(list);
    }

    @Override
    //根据babyid查询baby的照片
    public JsonVo findAllPhoto(Integer babyId) {
        List<Photo> list = photoDao.findAllPhoto(babyId);
        return JsonVo.setOK(list);
    }

    @Override
    //根据babyid查询baby的成长记录
    public JsonVo babyGrow(Integer babyId) {
        List<GrowVo> list = growDao.babyGrow(babyId);
        return JsonVo.setOK(list);
    }
}

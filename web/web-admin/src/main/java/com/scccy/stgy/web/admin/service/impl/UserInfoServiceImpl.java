package com.scccy.stgy.web.admin.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.scccy.stgy.model.mapper.UserInfoMapper;
import com.scccy.stgy.model.domain.UserInfo;
import com.scccy.stgy.web.admin.service.UserInfoService;
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService{

    @Override
    public int updateBatch(List<UserInfo> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<UserInfo> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(UserInfo record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(UserInfo record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

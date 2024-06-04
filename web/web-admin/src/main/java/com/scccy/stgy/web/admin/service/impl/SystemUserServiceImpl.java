package com.scccy.stgy.web.admin.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scccy.stgy.model.domain.SystemUser;
import java.util.List;
import com.scccy.stgy.model.mapper.SystemUserMapper;
import com.scccy.stgy.web.admin.service.SystemUserService;
@Service
public class SystemUserServiceImpl extends ServiceImpl<SystemUserMapper, SystemUser> implements SystemUserService{

    @Override
    public int updateBatch(List<SystemUser> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<SystemUser> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(SystemUser record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(SystemUser record) {
        return baseMapper.insertOrUpdateSelective(record);
    }

    @Override
    public void updateStatusById(Integer id, String status) {

    }
}

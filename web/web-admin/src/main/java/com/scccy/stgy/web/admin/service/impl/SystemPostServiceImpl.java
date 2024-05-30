package com.scccy.stgy.web.admin.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.scccy.stgy.model.mapper.SystemPostMapper;
import com.scccy.stgy.model.domain.SystemPost;
import com.scccy.stgy.web.admin.service.SystemPostService;
@Service
public class SystemPostServiceImpl extends ServiceImpl<SystemPostMapper, SystemPost> implements SystemPostService{

    @Override
    public int updateBatch(List<SystemPost> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<SystemPost> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(SystemPost record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(SystemPost record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

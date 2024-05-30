package com.scccy.stgy.web.admin.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scccy.stgy.model.domain.FeeKey;
import java.util.List;
import com.scccy.stgy.model.mapper.FeeKeyMapper;
import com.scccy.stgy.web.admin.service.FeeKeyService;
@Service
public class FeeKeyServiceImpl extends ServiceImpl<FeeKeyMapper, FeeKey> implements FeeKeyService{

    @Override
    public int updateBatch(List<FeeKey> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<FeeKey> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(FeeKey record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(FeeKey record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

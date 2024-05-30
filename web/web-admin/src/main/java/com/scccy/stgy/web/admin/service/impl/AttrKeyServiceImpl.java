package com.scccy.stgy.web.admin.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.scccy.stgy.model.domain.AttrKey;
import com.scccy.stgy.model.mapper.AttrKeyMapper;
import com.scccy.stgy.web.admin.service.AttrKeyService;
@Service
public class AttrKeyServiceImpl extends ServiceImpl<AttrKeyMapper, AttrKey> implements AttrKeyService{

    @Override
    public int updateBatch(List<AttrKey> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<AttrKey> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(AttrKey record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(AttrKey record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

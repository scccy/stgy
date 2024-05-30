package com.scccy.stgy.web.admin.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.scccy.stgy.model.domain.AttrValue;
import com.scccy.stgy.model.mapper.AttrValueMapper;
import com.scccy.stgy.web.admin.service.AttrValueService;
@Service
public class AttrValueServiceImpl extends ServiceImpl<AttrValueMapper, AttrValue> implements AttrValueService{

    @Override
    public int updateBatch(List<AttrValue> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<AttrValue> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(AttrValue record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(AttrValue record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

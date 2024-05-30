package com.scccy.stgy.web.admin.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.scccy.stgy.model.domain.FeeValue;
import com.scccy.stgy.model.mapper.FeeValueMapper;
import com.scccy.stgy.web.admin.service.FeeValueService;
@Service
public class FeeValueServiceImpl extends ServiceImpl<FeeValueMapper, FeeValue> implements FeeValueService{

    @Override
    public int updateBatch(List<FeeValue> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<FeeValue> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(FeeValue record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(FeeValue record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

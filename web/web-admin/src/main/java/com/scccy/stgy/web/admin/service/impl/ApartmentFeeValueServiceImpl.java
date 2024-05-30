package com.scccy.stgy.web.admin.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.scccy.stgy.model.mapper.ApartmentFeeValueMapper;
import com.scccy.stgy.model.domain.ApartmentFeeValue;
import com.scccy.stgy.web.admin.service.ApartmentFeeValueService;
@Service
public class ApartmentFeeValueServiceImpl extends ServiceImpl<ApartmentFeeValueMapper, ApartmentFeeValue> implements ApartmentFeeValueService{

    @Override
    public int updateBatch(List<ApartmentFeeValue> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<ApartmentFeeValue> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(ApartmentFeeValue record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(ApartmentFeeValue record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

package com.scccy.stgy.web.admin.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scccy.stgy.model.domain.ApartmentLabel;
import java.util.List;
import com.scccy.stgy.model.mapper.ApartmentLabelMapper;
import com.scccy.stgy.web.admin.service.ApartmentLabelService;
@Service
public class ApartmentLabelServiceImpl extends ServiceImpl<ApartmentLabelMapper, ApartmentLabel> implements ApartmentLabelService{

    @Override
    public int updateBatch(List<ApartmentLabel> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<ApartmentLabel> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(ApartmentLabel record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(ApartmentLabel record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

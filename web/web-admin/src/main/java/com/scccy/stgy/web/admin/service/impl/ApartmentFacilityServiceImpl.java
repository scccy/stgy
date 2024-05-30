package com.scccy.stgy.web.admin.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.scccy.stgy.model.domain.ApartmentFacility;
import com.scccy.stgy.model.mapper.ApartmentFacilityMapper;
import com.scccy.stgy.web.admin.service.ApartmentFacilityService;
@Service
public class ApartmentFacilityServiceImpl extends ServiceImpl<ApartmentFacilityMapper, ApartmentFacility> implements ApartmentFacilityService{

    @Override
    public int updateBatch(List<ApartmentFacility> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<ApartmentFacility> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(ApartmentFacility record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(ApartmentFacility record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

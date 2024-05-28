package com.scccy.stgy.admin.service;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scccy.stgy.mapper.ApartmentFacilityMapper;
import com.scccy.stgy.model.ApartmentFacility;
import java.util.List;
@Service
public class ApartmentFacilityService extends ServiceImpl<ApartmentFacilityMapper, ApartmentFacility> {

    
    public int updateBatch(List<ApartmentFacility> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int batchInsert(List<ApartmentFacility> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(ApartmentFacility record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(ApartmentFacility record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

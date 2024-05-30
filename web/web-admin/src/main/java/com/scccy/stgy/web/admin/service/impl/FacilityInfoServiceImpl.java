package com.scccy.stgy.web.admin.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scccy.stgy.model.mapper.FacilityInfoMapper;
import java.util.List;
import com.scccy.stgy.model.domain.FacilityInfo;
import com.scccy.stgy.web.admin.service.FacilityInfoService;
@Service
public class FacilityInfoServiceImpl extends ServiceImpl<FacilityInfoMapper, FacilityInfo> implements FacilityInfoService{

    @Override
    public int updateBatch(List<FacilityInfo> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<FacilityInfo> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(FacilityInfo record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(FacilityInfo record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

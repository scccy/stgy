package com.scccy.stgy.web.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.scccy.stgy.model.domain.FacilityInfo;
import com.scccy.stgy.web.admin.service.FacilityInfoService;
import com.scccy.stgy.web.admin.service.FacilityService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityServiceImpl implements FacilityService {
    @Resource
    FacilityInfoService facilityInfoService;
    @Override
    public boolean saveOrUpdate(FacilityInfo facilityInfo) {
        return facilityInfoService.saveOrUpdate(facilityInfo);
    }

    @Override
    public List<FacilityInfo> List(byte type) {
        return facilityInfoService.list(new LambdaQueryWrapper<FacilityInfo>().eq(FacilityInfo::getType, type));

    }

    @Override
    public boolean deleteById(byte type) {
        return facilityInfoService.remove(new LambdaQueryWrapper<FacilityInfo>().eq(FacilityInfo::getType,type));
    }
}

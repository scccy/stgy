package com.scccy.stgy.web.admin.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.scccy.stgy.model.domain.CityInfo;
import com.scccy.stgy.model.domain.DistrictInfo;
import com.scccy.stgy.model.domain.ProvinceInfo;
import com.scccy.stgy.web.admin.service.CityInfoService;
import com.scccy.stgy.web.admin.service.DistrictInfoService;
import com.scccy.stgy.web.admin.service.ProvinceInfoService;
import com.scccy.stgy.web.admin.service.RegionService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {
    @Resource
    ProvinceInfoService provinceInfoService;
    @Resource
    DistrictInfoService districtInfoService;

    @Resource
    CityInfoService cityInfoService;
    @Override
    public List<ProvinceInfo> list() {
        return provinceInfoService.list();
    }

    @Override
    public List<DistrictInfo> provinceList(Long id) {
        return districtInfoService.list(Wrappers.lambdaQuery(DistrictInfo.class).eq(DistrictInfo::getCityId,id));
    }

    @Override
    public List<CityInfo> listByProvinceId(Long id) {
        return cityInfoService.list(Wrappers.lambdaQuery(CityInfo.class).eq(CityInfo::getProvinceId,id));
    }
}

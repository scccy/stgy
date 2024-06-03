package com.scccy.stgy.web.admin.service;

import com.scccy.stgy.model.domain.CityInfo;
import com.scccy.stgy.model.domain.DistrictInfo;
import com.scccy.stgy.model.domain.ProvinceInfo;

import java.util.List;

public interface RegionService {
    List<ProvinceInfo> list();


    List<DistrictInfo> provinceList(Long id);

    List<CityInfo> listByProvinceId(Long id);
}

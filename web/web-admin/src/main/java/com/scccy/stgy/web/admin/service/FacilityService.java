package com.scccy.stgy.web.admin.service;

import com.scccy.stgy.model.domain.FacilityInfo;

import java.util.List;

public interface FacilityService {
    boolean saveOrUpdate(FacilityInfo facilityInfo);

    List<FacilityInfo> List( );

    boolean deleteById(long id);
}

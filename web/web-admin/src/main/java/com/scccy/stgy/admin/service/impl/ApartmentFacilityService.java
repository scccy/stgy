package com.scccy.stgy.admin.service.impl;

import com.scccy.stgy.model.ApartmentFacility;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface ApartmentFacilityService extends IService<ApartmentFacility>{


    int updateBatch(List<ApartmentFacility> list);

    int batchInsert(List<ApartmentFacility> list);

    int insertOrUpdate(ApartmentFacility record);

    int insertOrUpdateSelective(ApartmentFacility record);

}

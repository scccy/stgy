package com.scccy.stgy.web.admin.service;

import java.util.List;
import com.scccy.stgy.model.domain.ApartmentFacility;
import com.baomidou.mybatisplus.extension.service.IService;
public interface ApartmentFacilityService extends IService<ApartmentFacility>{


    int updateBatch(List<ApartmentFacility> list);

    int batchInsert(List<ApartmentFacility> list);

    int insertOrUpdate(ApartmentFacility record);

    int insertOrUpdateSelective(ApartmentFacility record);

}

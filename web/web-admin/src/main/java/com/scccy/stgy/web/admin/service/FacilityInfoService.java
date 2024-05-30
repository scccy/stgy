package com.scccy.stgy.web.admin.service;

import java.util.List;
import com.scccy.stgy.model.domain.FacilityInfo;
import com.baomidou.mybatisplus.extension.service.IService;
public interface FacilityInfoService extends IService<FacilityInfo>{


    int updateBatch(List<FacilityInfo> list);

    int batchInsert(List<FacilityInfo> list);

    int insertOrUpdate(FacilityInfo record);

    int insertOrUpdateSelective(FacilityInfo record);

}

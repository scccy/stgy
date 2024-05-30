package com.scccy.stgy.web.admin.service;

import java.util.List;
import com.scccy.stgy.model.domain.DistrictInfo;
import com.baomidou.mybatisplus.extension.service.IService;
public interface DistrictInfoService extends IService<DistrictInfo>{


    int updateBatch(List<DistrictInfo> list);

    int batchInsert(List<DistrictInfo> list);

    int insertOrUpdate(DistrictInfo record);

    int insertOrUpdateSelective(DistrictInfo record);

}

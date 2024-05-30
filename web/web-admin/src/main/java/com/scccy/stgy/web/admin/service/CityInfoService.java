package com.scccy.stgy.web.admin.service;

import com.scccy.stgy.model.domain.CityInfo;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface CityInfoService extends IService<CityInfo>{


    int updateBatch(List<CityInfo> list);

    int batchInsert(List<CityInfo> list);

    int insertOrUpdate(CityInfo record);

    int insertOrUpdateSelective(CityInfo record);

}

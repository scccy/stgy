package com.scccy.stgy.web.admin.service;

import com.scccy.stgy.model.domain.ApartmentInfo;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface ApartmentInfoService extends IService<ApartmentInfo>{


    int updateBatch(List<ApartmentInfo> list);

    int batchInsert(List<ApartmentInfo> list);

    int insertOrUpdate(ApartmentInfo record);

    int insertOrUpdateSelective(ApartmentInfo record);

}

package com.scccy.stgy.web.admin.service;

import java.util.List;
import com.scccy.stgy.model.domain.ApartmentFeeValue;
import com.baomidou.mybatisplus.extension.service.IService;
public interface ApartmentFeeValueService extends IService<ApartmentFeeValue>{


    int updateBatch(List<ApartmentFeeValue> list);

    int batchInsert(List<ApartmentFeeValue> list);

    int insertOrUpdate(ApartmentFeeValue record);

    int insertOrUpdateSelective(ApartmentFeeValue record);

}

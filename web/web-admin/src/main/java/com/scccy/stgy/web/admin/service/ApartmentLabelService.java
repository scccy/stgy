package com.scccy.stgy.web.admin.service;

import com.scccy.stgy.model.domain.ApartmentLabel;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface ApartmentLabelService extends IService<ApartmentLabel>{


    int updateBatch(List<ApartmentLabel> list);

    int batchInsert(List<ApartmentLabel> list);

    int insertOrUpdate(ApartmentLabel record);

    int insertOrUpdateSelective(ApartmentLabel record);

}

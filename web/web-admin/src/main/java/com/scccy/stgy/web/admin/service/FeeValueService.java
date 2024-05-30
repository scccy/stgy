package com.scccy.stgy.web.admin.service;

import java.util.List;
import com.scccy.stgy.model.domain.FeeValue;
import com.baomidou.mybatisplus.extension.service.IService;
public interface FeeValueService extends IService<FeeValue>{


    int updateBatch(List<FeeValue> list);

    int batchInsert(List<FeeValue> list);

    int insertOrUpdate(FeeValue record);

    int insertOrUpdateSelective(FeeValue record);

}

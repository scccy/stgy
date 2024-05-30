package com.scccy.stgy.web.admin.service;

import com.scccy.stgy.model.domain.FeeKey;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface FeeKeyService extends IService<FeeKey>{


    int updateBatch(List<FeeKey> list);

    int batchInsert(List<FeeKey> list);

    int insertOrUpdate(FeeKey record);

    int insertOrUpdateSelective(FeeKey record);

}

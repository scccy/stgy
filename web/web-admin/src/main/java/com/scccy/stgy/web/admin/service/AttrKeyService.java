package com.scccy.stgy.web.admin.service;

import java.util.List;
import com.scccy.stgy.model.domain.AttrKey;
import com.baomidou.mybatisplus.extension.service.IService;
public interface AttrKeyService extends IService<AttrKey>{


    int updateBatch(List<AttrKey> list);

    int batchInsert(List<AttrKey> list);

    int insertOrUpdate(AttrKey record);

    int insertOrUpdateSelective(AttrKey record);

}

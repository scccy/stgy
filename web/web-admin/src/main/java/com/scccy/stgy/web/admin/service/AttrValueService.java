package com.scccy.stgy.web.admin.service;

import java.util.List;
import com.scccy.stgy.model.domain.AttrValue;
import com.baomidou.mybatisplus.extension.service.IService;
public interface AttrValueService extends IService<AttrValue>{


    int updateBatch(List<AttrValue> list);

    int batchInsert(List<AttrValue> list);

    int insertOrUpdate(AttrValue record);

    int insertOrUpdateSelective(AttrValue record);

}

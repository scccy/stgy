package com.scccy.stgy.web.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.scccy.stgy.model.domain.AttrKey;
import com.scccy.stgy.model.vo.AttrListVo;


import java.util.List;

public interface AttrKeyService extends IService<AttrKey>{


    int updateBatch(List<AttrKey> list);

    int batchInsert(List<AttrKey> list);

    int insertOrUpdate(AttrKey record);

    int insertOrUpdateSelective(AttrKey record);

    List<AttrListVo> attrList();
}

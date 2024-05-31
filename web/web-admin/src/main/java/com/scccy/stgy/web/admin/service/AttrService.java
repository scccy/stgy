package com.scccy.stgy.web.admin.service;

import com.scccy.stgy.model.domain.AttrKey;
import com.scccy.stgy.model.domain.AttrValue;
import com.scccy.stgy.model.vo.AttrListVo;

import java.util.List;

public interface AttrService {
    boolean valueSaveOrUpdate(AttrValue attrValue);

    boolean keySaveOrUpdate(AttrKey attrKey);

    List<AttrListVo> attrList();

    boolean valueDeleteById(long id);

    boolean keyDeleteById(long id);
}

package com.scccy.stgy.web.admin.service;

import com.scccy.stgy.model.domain.FeeKey;
import com.scccy.stgy.model.domain.FeeValue;
import com.scccy.stgy.model.vo.FeeListVo;

import java.util.List;

public interface FeeService {
    boolean valueSaveOrUpdate(FeeValue feeValue);

    boolean keySaveOrUpdate(FeeKey feeKey);

    List<FeeListVo> list();

    boolean valueDeleteById(long id);

    boolean keyDeleteById(long id);
}

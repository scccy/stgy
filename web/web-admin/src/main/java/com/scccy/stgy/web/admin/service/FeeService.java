package com.scccy.stgy.web.admin.service;

import com.scccy.stgy.model.domain.FeeKey;
import com.scccy.stgy.model.domain.FeeValue;
import com.scccy.stgy.model.vo.FeeListVo;

public interface FeeService {
    boolean valueSaveOrUpdate(FeeValue feeValue);

    boolean keySaveOrUpdate(FeeKey feeKey);

    FeeListVo list(long id);

    boolean valueDeleteById(long id);

    boolean keyDeleteById(long id);
}

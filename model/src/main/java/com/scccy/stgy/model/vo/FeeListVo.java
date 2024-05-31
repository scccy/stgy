package com.scccy.stgy.model.vo;

import com.scccy.stgy.model.domain.FeeKey;
import com.scccy.stgy.model.domain.FeeValue;
import lombok.Data;

import java.util.List;

@Data
public class FeeListVo extends FeeKey {
    private List<FeeValue> feeValueList;
}

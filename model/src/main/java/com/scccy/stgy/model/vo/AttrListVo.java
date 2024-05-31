package com.scccy.stgy.model.vo;

import com.scccy.stgy.model.domain.AttrKey;
import com.scccy.stgy.model.domain.AttrValue;
import lombok.Data;

import java.util.List;

@Data
public class AttrListVo extends AttrKey {
    private List<AttrValue> attrValueList;
}
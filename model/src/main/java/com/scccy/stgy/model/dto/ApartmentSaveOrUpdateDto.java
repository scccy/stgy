package com.scccy.stgy.model.dto;

import com.alibaba.fastjson2.annotation.JSONField;
import com.scccy.stgy.model.domain.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class ApartmentSaveOrUpdateDto extends ApartmentInfo {

    @JSONField(name = "facilityInfoIds")
    private List<ApartmentFacility> facilityInfoIds;
    @JSONField(name = "labelIds")
    private List<ApartmentLabel> labelIds;
    @JSONField(name = "feeValueIds")
    private List<ApartmentFeeValue> feeValueIds;
    @JSONField(name = "graphVoList")
    private List<GraphInfo> GraphInfos;


}

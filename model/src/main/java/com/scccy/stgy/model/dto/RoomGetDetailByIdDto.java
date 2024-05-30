package com.scccy.stgy.model.dto;

import com.scccy.stgy.model.domain.*;
import com.scccy.stgy.model.vo.AttrValueVo;
import lombok.Data;

import java.util.List;

@Data
public class RoomGetDetailByIdDto extends RoomInfo {
    private ApartmentInfo apartmentInfo;
    private List<FacilityInfo> facilityInfoList;
    private List<GraphInfo> graphVoList;
    private List<AttrValueVo> attrValueVoList;
    private List<LabelInfo> labelInfoList;
    private List<PaymentType> paymentTypeList;
    private List<LeaseTerm> leaseTermList;
}

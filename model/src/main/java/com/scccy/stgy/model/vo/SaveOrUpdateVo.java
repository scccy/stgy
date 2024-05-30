package com.scccy.stgy.model.vo;

import com.scccy.stgy.model.domain.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaveOrUpdateVo {
    private Long id;
    private String roomNumber;
    private double rent;
    private Long apartmentId;
    private byte isRelease;
    private List<GraphVo> graphVoList;
    private List<Long> attrValueIds;
    private List<Long> facilityInfoIds;
    private List<Long> labelInfoIds;
    private List<Long> paymentTypeIds;
    private List<Long> leaseTermIds;

    public  RoomInfo toRoomInfo() {
        RoomInfo roomInfo = new RoomInfo();
        roomInfo.setId(this.id);
        roomInfo.setRoomNumber(this.roomNumber);
        roomInfo.setRent(BigDecimal.valueOf(this.rent));
        roomInfo.setApartmentId(this.apartmentId);
        roomInfo.setIsRelease(this.isRelease); // 转换为字节类型，true为1，false为0
        return roomInfo;
    }
    public List<GraphInfo> toGarphInfo(){
        ArrayList<GraphInfo> graphInfos = new ArrayList<>();
        for (GraphVo graphVo : graphVoList) {
            GraphInfo graphInfo = new GraphInfo();
            graphInfo.setId(this.id);
            graphInfo.setName(graphVo.getName());
            graphInfo.setUrl(graphVo.getUrl());
            graphInfos.add(graphInfo);
        }


        return graphInfos;
    }
    public List<RoomAttrValue> toRoomAttrValue(){
        ArrayList<RoomAttrValue> roomAttrValues = new ArrayList<>();
        for (Long attrValueId : attrValueIds) {
            RoomAttrValue roomAttrValue = new RoomAttrValue();
            roomAttrValue.setRoomId(this.id);
            roomAttrValue.setAttrValueId(attrValueId);
            roomAttrValues.add(roomAttrValue);
        }


        return roomAttrValues;
    }

    public List<RoomFacility> toRoomFacility() {
        ArrayList<RoomFacility> roomFacilities = new ArrayList<>();
        for (Long facilityInfoId : facilityInfoIds) {
            RoomFacility roomFacility = new RoomFacility();
            roomFacility.setRoomId(this.id);
            roomFacility.setFacilityId(facilityInfoId);
            roomFacilities.add(roomFacility);
        }
        return roomFacilities;
    }

    public List<RoomLabel> toRoomLabel() {
        ArrayList<RoomLabel> roomLabels = new ArrayList<>();
        for (Long labelInfoId : labelInfoIds) {
            RoomLabel roomLabel = new RoomLabel();
            roomLabel.setRoomId(this.id);
            roomLabel.setLabelId(labelInfoId);
            roomLabels.add(roomLabel);
        }
        return roomLabels;
    }

    public List<RoomPaymentType> toRoomPaymentType() {
        ArrayList<RoomPaymentType> roomPaymentTypes = new ArrayList<>();
        for (Long paymentTypeId : paymentTypeIds) {
            RoomPaymentType roomPaymentType = new RoomPaymentType();
            roomPaymentType.setRoomId(this.id);
            roomPaymentType.setPaymentTypeId(paymentTypeId);
            roomPaymentTypes.add(roomPaymentType);
        }
        return roomPaymentTypes;
    }

    public List<RoomLeaseTerm> toRoomLeaseTerm() {
        ArrayList<RoomLeaseTerm> roomLeaseTerms = new ArrayList<>();
        for (Long leaseTermId : leaseTermIds) {
            RoomLeaseTerm roomLeaseTerm = new RoomLeaseTerm();
            roomLeaseTerm.setRoomId(this.id);
            roomLeaseTerm.setLeaseTermId(leaseTermId);
            roomLeaseTerms.add(roomLeaseTerm);
        }
        return roomLeaseTerms;
    }


    @Data
    public static class GraphVo {
        private String name;
        private String url;
    }


}

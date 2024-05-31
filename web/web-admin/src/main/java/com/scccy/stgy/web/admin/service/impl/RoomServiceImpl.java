package com.scccy.stgy.web.admin.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.scccy.stgy.model.domain.*;
import com.scccy.stgy.model.dto.RoomGetDetailByIdDto;
import com.scccy.stgy.model.vo.RoomPageItemVo;
import com.scccy.stgy.model.vo.RoomAttrValueVo;
import com.scccy.stgy.model.dto.RoomSaveOrUpdateDto;
import com.scccy.stgy.web.admin.service.*;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomInfoService roomInfoService;
    @Resource
    GraphInfoService graphInfoService;
    @Resource
    RoomPaymentTypeService roomPaymentTypeService;
    @Resource
    PaymentTypeService paymentTypeService;
    @Resource
    RoomAttrValueService roomAttrValueService;
    @Resource
    RoomFacilityService roomFacilityService;
    @Resource
    RoomLabelService roomLabelService;
    @Resource
    FacilityInfoService facilityInfoService;
    @Resource
    LabelInfoService labelInfoService;
    @Resource
    LeaseTermService leaseTermService;


    @Override
    @Transactional
    public boolean saveOrUpdate(RoomSaveOrUpdateDto roomSaveOrUpdateDto) {
        roomInfoService.saveOrUpdate(roomSaveOrUpdateDto.toRoomInfo());
        graphInfoService.saveOrUpdateBatch(roomSaveOrUpdateDto.toGarphInfo());
        roomPaymentTypeService.saveOrUpdateBatch(roomSaveOrUpdateDto.toRoomPaymentType());
        roomAttrValueService.saveOrUpdateBatch(roomSaveOrUpdateDto.toRoomAttrValue());
        roomFacilityService.saveOrUpdateBatch(roomSaveOrUpdateDto.toRoomFacility());
        roomLabelService.saveOrUpdateBatch(roomSaveOrUpdateDto.toRoomLabel());
        return true;

    }



    @Override
    public boolean updateReleaseStatusById(RoomInfo info) {
        return roomInfoService.saveOrUpdate(info);
    }

    @Override
    public IPage<RoomPageItemVo> pageItem(IPage<RoomPageItemVo> roomPageItemDtoPage, Long provinceId, Long cityId, Long districtId, Long apartmentId) {
        return roomInfoService.getRoomPageItem(roomPageItemDtoPage, provinceId, cityId, districtId, apartmentId);

    }

    @Override
    public List<RoomInfo> listBasicByApartmentId(Integer id) {
        return roomInfoService.list(new LambdaQueryWrapper<RoomInfo>().eq(BaseModel::getId, id));
    }

    @Override
    public RoomGetDetailByIdDto getDetailById(Integer id) {

        List<GraphInfo> graphInfos = graphInfoService.list(new LambdaQueryWrapper<GraphInfo>().eq(BaseModel::getId, id));
        List<FacilityInfo> facilityInfos = facilityInfoService.list(new LambdaQueryWrapper<FacilityInfo>().eq(BaseModel::getId, id));
        List<LabelInfo> labelInfos = labelInfoService.list(new LambdaQueryWrapper<LabelInfo>().eq(BaseModel::getId, id));
        List<PaymentType> paymentTypes = paymentTypeService.list(new LambdaQueryWrapper<PaymentType>().eq(BaseModel::getId,id));
        List<LeaseTerm> leaseTerms = leaseTermService.list(new LambdaQueryWrapper<LeaseTerm>().eq(BaseModel::getId,id));

        List<RoomAttrValueVo> roomAttrValueVos = roomAttrValueService.getAttrValueVos(id);

        RoomGetDetailByIdDto roomGetDetailByIdDto = new RoomGetDetailByIdDto();
        roomGetDetailByIdDto.setGraphVoList(graphInfos);
        roomGetDetailByIdDto.setFacilityInfoList(facilityInfos);
        roomGetDetailByIdDto.setLabelInfoList(labelInfos);
        roomGetDetailByIdDto.setPaymentTypeList(paymentTypes);
        roomGetDetailByIdDto.setLeaseTermList(leaseTerms);
        roomGetDetailByIdDto.setRoomAttrValueVoList(roomAttrValueVos);
        
        return roomGetDetailByIdDto;
    }

    @Override
    public boolean removeById(Integer id) {
        return roomInfoService.removeById(id);
    }


}

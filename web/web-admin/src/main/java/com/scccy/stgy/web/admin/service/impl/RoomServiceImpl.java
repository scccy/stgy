package com.scccy.stgy.web.admin.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.scccy.stgy.model.domain.*;
import com.scccy.stgy.model.dto.RoomGetDetailByIdVo;
import com.scccy.stgy.model.dto.RoomSaveOrUpdateDto;
import com.scccy.stgy.model.vo.RoomAttrValueVo;
import com.scccy.stgy.model.vo.RoomPageItemVo;
import com.scccy.stgy.web.admin.service.*;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

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
    AttrKeyService attrKeyService;
    @Resource
    FacilityInfoService facilityInfoService;
    @Resource
    LabelInfoService labelInfoService;
    @Resource
    LeaseTermService leaseTermService;
    @Resource
    ApartmentInfoService apartmentInfoService;


    @Override
    @Transactional(rollbackFor = Exception.class)
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
    public Page<RoomPageItemVo> pageItem(Page<RoomPageItemVo> roomPageItemDtoPage, Long provinceId, Long cityId, Long districtId, Long apartmentId) {
        return roomInfoService.getRoomPageItem(roomPageItemDtoPage, provinceId, cityId, districtId, apartmentId);

    }

    @Override
    public List<RoomInfo> listBasicByApartmentId(Integer id) {

        return roomInfoService.list(new LambdaQueryWrapper<RoomInfo>().eq(BaseModel::getId, id));
    }

//    todo:不能直接赋值查询
    @Override
    public RoomGetDetailByIdVo getDetailById(Long id) {

//        RoomGetDetailByIdVo roomGetDetailByIdVo = roomInfoService.getDetailById(id);
        RoomInfo roomInfo = roomInfoService.getOne(Wrappers.lambdaQuery(RoomInfo.class).eq(RoomInfo::getId,id));
        RoomGetDetailByIdVo roomGetDetailByIdVo = new RoomGetDetailByIdVo();
        BeanUtils.copyProperties(roomInfo,roomGetDetailByIdVo);

        List<GraphInfo> graphInfos = graphInfoService.list(Wrappers.lambdaQuery(GraphInfo.class).eq(GraphInfo::getItemId, roomInfo.getId()));
        roomGetDetailByIdVo.setGraphVoList(graphInfos);

        List<RoomAttrValueVo> roomAttrValueVos = roomAttrValueService.getAttrValueVos(roomInfo.getId());
        roomGetDetailByIdVo.setAttrValueVoList(roomAttrValueVos);

        List<FacilityInfo> facilityInfos = roomFacilityService.list(Wrappers.lambdaQuery(RoomFacility.class).eq(RoomFacility::getRoomId, roomInfo.getId())).stream()
                .map(roomFacility -> facilityInfoService.getOne(Wrappers.lambdaQuery(FacilityInfo.class).eq(BaseModel::getId, roomFacility.getFacilityId()).eq(BaseModel::getDeleted,0)))
                .collect(Collectors.toList());
        roomGetDetailByIdVo.setFacilityInfoList(facilityInfos);


        List<LabelInfo> labelInfos = roomLabelService.list(Wrappers.lambdaQuery(RoomLabel.class).eq(RoomLabel::getRoomId, roomInfo.getId())).stream().map(
                roomLabel -> labelInfoService.getOne(Wrappers.lambdaQuery(LabelInfo.class).eq(BaseModel::getId, roomLabel.getLabelId()))
        ).collect(Collectors.toList());
        roomGetDetailByIdVo.setLabelInfoList(labelInfos);


        List<PaymentType> paymentTypes = roomPaymentTypeService.list(Wrappers.lambdaQuery(RoomPaymentType.class).eq(RoomPaymentType::getRoomId, roomInfo.getId())).stream().map(
                roomPaymentType -> paymentTypeService.getOne(Wrappers.lambdaQuery(PaymentType.class).eq(BaseModel::getId, roomPaymentType.getPaymentTypeId()))

        ).collect(Collectors.toList());
        roomGetDetailByIdVo.setPaymentTypeList(paymentTypes);
        return roomGetDetailByIdVo;

    }





    @Override
    public boolean removeById(Integer id) {
        return roomInfoService.removeById(id);
    }


}

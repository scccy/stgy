package com.scccy.stgy.admin.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.scccy.stgy.admin.service.impl.*;

import com.scccy.stgy.model.dto.RoomGetDetailByIdDto;
import com.scccy.stgy.model.dto.RoomPageItemDto;
import com.scccy.stgy.model.domain.*;
import com.scccy.stgy.model.vo.AttrValueVo;
import com.scccy.stgy.model.vo.SaveOrUpdateVo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Resource
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
    public boolean saveOrUpdate(SaveOrUpdateVo saveOrUpdateVo) {
        roomInfoService.saveOrUpdate(saveOrUpdateVo.toRoomInfo());
        graphInfoService.saveOrUpdateBatch(saveOrUpdateVo.toGarphInfo());
        roomPaymentTypeService.saveOrUpdateBatch(saveOrUpdateVo.toRoomPaymentType());
        roomAttrValueService.saveOrUpdateBatch(saveOrUpdateVo.toRoomAttrValue());
        roomFacilityService.saveOrUpdateBatch(saveOrUpdateVo.toRoomFacility());
        roomLabelService.saveOrUpdateBatch(saveOrUpdateVo.toRoomLabel());
        return true;

    }



    @Override
    public boolean updateReleaseStatusById(RoomInfo info) {
        return roomInfoService.saveOrUpdate(info);
    }

    @Override
    public IPage<RoomPageItemDto> pageItem(IPage<RoomPageItemDto> roomPageItemDtoPage, Long provinceId, Long cityId, Long districtId, Long apartmentId) {
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
        List<AttrValueVo> attrValueVos = roomAttrValueService.getAttrValueVos(id);

        RoomGetDetailByIdDto roomGetDetailByIdDto = new RoomGetDetailByIdDto();
        roomGetDetailByIdDto.setGraphVoList(graphInfos);
        roomGetDetailByIdDto.setFacilityInfoList(facilityInfos);
        roomGetDetailByIdDto.setLabelInfoList(labelInfos);
        roomGetDetailByIdDto.setPaymentTypeList(paymentTypes);
        roomGetDetailByIdDto.setLeaseTermList(leaseTerms);
        roomGetDetailByIdDto.setAttrValueVoList(attrValueVos);
        
        return roomGetDetailByIdDto;
    }


}

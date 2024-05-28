package com.scccy.stgy.admin.service;

import com.scccy.stgy.admin.service.impl.*;
import com.scccy.stgy.model.RoomInfo;
import com.scccy.stgy.vo.SaveOrUpdateVo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {

    @Resource
    RoomInfoService roomInfoService;
    @Resource
    GraphInfoService graphInfoService;
    @Resource
    RoomPaymentTypeService roomPaymentTypeService;
    @Resource
    RoomAttrValueService roomAttrValueService;
    @Resource
    RoomFacilityService roomFacilityService;
    @Resource
    RoomLabelService roomLabelService;

    @Override
    public boolean saveOrUpdate(SaveOrUpdateVo saveOrUpdateVo) {
        boolean isok =false;
        try{
        roomInfoService.saveOrUpdate(saveOrUpdateVo.toRoomInfo());
        graphInfoService.saveOrUpdateBatch(saveOrUpdateVo.toGarphInfo());
        roomPaymentTypeService.saveOrUpdateBatch(saveOrUpdateVo.toRoomPaymentType());
        roomAttrValueService.saveOrUpdateBatch(saveOrUpdateVo.toRoomAttrValue());
        roomFacilityService.saveOrUpdateBatch(saveOrUpdateVo.toRoomFacility());
        roomLabelService.saveOrUpdateBatch(saveOrUpdateVo.toRoomLabel());
            return isok=true;
        }catch (Exception e){
            return isok;
        }
    }

    @Override
    public boolean updateReleaseStatusById(RoomInfo info) {
        return roomInfoService.saveOrUpdate(info);
    }
}

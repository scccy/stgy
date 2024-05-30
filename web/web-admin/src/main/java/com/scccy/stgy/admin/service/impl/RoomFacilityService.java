package com.scccy.stgy.admin.service.impl;

import java.util.List;
import com.scccy.stgy.model.domain.RoomFacility;
import com.baomidou.mybatisplus.extension.service.IService;
public interface RoomFacilityService extends IService<RoomFacility>{


    int updateBatch(List<RoomFacility> list);

    int batchInsert(List<RoomFacility> list);

    int insertOrUpdate(RoomFacility record);

    int insertOrUpdateSelective(RoomFacility record);

}

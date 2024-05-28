package com.scccy.stgy.admin.service.impl;

import java.util.List;
import com.scccy.stgy.model.RoomInfo;
import com.baomidou.mybatisplus.extension.service.IService;
public interface RoomInfoService extends IService<RoomInfo>{


    int updateBatch(List<RoomInfo> list);

    int batchInsert(List<RoomInfo> list);

    int insertOrUpdate(RoomInfo record);

    int insertOrUpdateSelective(RoomInfo record);

}

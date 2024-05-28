package com.scccy.stgy.admin.service.impl;

import com.scccy.stgy.model.RoomInfo;
import com.scccy.stgy.vo.SaveOrUpdateVo;

public interface RoomService {
    boolean saveOrUpdate(SaveOrUpdateVo saveOrUpdateVo);


    boolean updateReleaseStatusById(RoomInfo info);
}

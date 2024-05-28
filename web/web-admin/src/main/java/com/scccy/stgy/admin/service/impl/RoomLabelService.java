package com.scccy.stgy.admin.service.impl;

import java.util.List;
import com.scccy.stgy.model.RoomLabel;
import com.baomidou.mybatisplus.extension.service.IService;
public interface RoomLabelService extends IService<RoomLabel>{


    int updateBatch(List<RoomLabel> list);

    int batchInsert(List<RoomLabel> list);

    int insertOrUpdate(RoomLabel record);

    int insertOrUpdateSelective(RoomLabel record);

}

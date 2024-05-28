package com.scccy.stgy.admin.service.impl;

import java.util.List;
import com.scccy.stgy.model.RoomAttrValue;
import com.baomidou.mybatisplus.extension.service.IService;
public interface RoomAttrValueService extends IService<RoomAttrValue>{


    int updateBatch(List<RoomAttrValue> list);

    int batchInsert(List<RoomAttrValue> list);

    int insertOrUpdate(RoomAttrValue record);

    int insertOrUpdateSelective(RoomAttrValue record);

}

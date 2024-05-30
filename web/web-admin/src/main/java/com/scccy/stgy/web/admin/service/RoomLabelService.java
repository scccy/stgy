package com.scccy.stgy.web.admin.service;

import java.util.List;
import com.scccy.stgy.model.domain.RoomLabel;
import com.baomidou.mybatisplus.extension.service.IService;
public interface RoomLabelService extends IService<RoomLabel>{


    int updateBatch(List<RoomLabel> list);

    int batchInsert(List<RoomLabel> list);

    int insertOrUpdate(RoomLabel record);

    int insertOrUpdateSelective(RoomLabel record);

}

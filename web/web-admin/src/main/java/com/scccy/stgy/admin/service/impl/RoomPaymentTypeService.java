package com.scccy.stgy.admin.service.impl;

import com.scccy.stgy.model.domain.RoomPaymentType;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface RoomPaymentTypeService extends IService<RoomPaymentType>{


    int updateBatch(List<RoomPaymentType> list);

    int batchInsert(List<RoomPaymentType> list);

    int insertOrUpdate(RoomPaymentType record);

    int insertOrUpdateSelective(RoomPaymentType record);

}

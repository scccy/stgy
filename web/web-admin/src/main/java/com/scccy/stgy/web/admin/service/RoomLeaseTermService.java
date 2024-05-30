package com.scccy.stgy.web.admin.service;

import java.util.List;
import com.scccy.stgy.model.domain.RoomLeaseTerm;
import com.baomidou.mybatisplus.extension.service.IService;
public interface RoomLeaseTermService extends IService<RoomLeaseTerm>{


    int updateBatch(List<RoomLeaseTerm> list);

    int batchInsert(List<RoomLeaseTerm> list);

    int insertOrUpdate(RoomLeaseTerm record);

    int insertOrUpdateSelective(RoomLeaseTerm record);

}

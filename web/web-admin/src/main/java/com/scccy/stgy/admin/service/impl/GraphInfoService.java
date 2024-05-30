package com.scccy.stgy.admin.service.impl;

import com.scccy.stgy.model.domain.GraphInfo;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;

public interface GraphInfoService extends IService<GraphInfo>{


    int updateBatch(List<GraphInfo> list);

    int batchInsert(List<GraphInfo> list);

    int insertOrUpdate(GraphInfo record);

    int insertOrUpdateSelective(GraphInfo record);

}

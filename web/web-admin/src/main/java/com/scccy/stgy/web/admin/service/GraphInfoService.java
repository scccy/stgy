package com.scccy.stgy.web.admin.service;

import java.util.List;
import com.scccy.stgy.model.domain.GraphInfo;
import com.baomidou.mybatisplus.extension.service.IService;
public interface GraphInfoService extends IService<GraphInfo>{


    int updateBatch(List<GraphInfo> list);

    int batchInsert(List<GraphInfo> list);

    int insertOrUpdate(GraphInfo record);

    int insertOrUpdateSelective(GraphInfo record);

}

package com.scccy.stgy.web.admin.service;

import com.scccy.stgy.model.domain.LabelInfo;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface LabelInfoService extends IService<LabelInfo>{


    int updateBatch(List<LabelInfo> list);

    int batchInsert(List<LabelInfo> list);

    int insertOrUpdate(LabelInfo record);

    int insertOrUpdateSelective(LabelInfo record);

}

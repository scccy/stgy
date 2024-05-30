package com.scccy.stgy.web.admin.service;

import java.util.List;
import com.scccy.stgy.model.domain.ProvinceInfo;
import com.baomidou.mybatisplus.extension.service.IService;
public interface ProvinceInfoService extends IService<ProvinceInfo>{


    int updateBatch(List<ProvinceInfo> list);

    int batchInsert(List<ProvinceInfo> list);

    int insertOrUpdate(ProvinceInfo record);

    int insertOrUpdateSelective(ProvinceInfo record);

}

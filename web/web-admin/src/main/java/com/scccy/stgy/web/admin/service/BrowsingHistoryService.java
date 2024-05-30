package com.scccy.stgy.web.admin.service;

import java.util.List;
import com.scccy.stgy.model.domain.BrowsingHistory;
import com.baomidou.mybatisplus.extension.service.IService;
public interface BrowsingHistoryService extends IService<BrowsingHistory>{


    int updateBatch(List<BrowsingHistory> list);

    int batchInsert(List<BrowsingHistory> list);

    int insertOrUpdate(BrowsingHistory record);

    int insertOrUpdateSelective(BrowsingHistory record);

}

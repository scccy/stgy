package com.scccy.stgy.web.admin.service;

import java.util.List;
import com.scccy.stgy.model.domain.SystemPost;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SystemPostService extends IService<SystemPost>{


    int updateBatch(List<SystemPost> list);

    int batchInsert(List<SystemPost> list);

    int insertOrUpdate(SystemPost record);

    int insertOrUpdateSelective(SystemPost record);

}

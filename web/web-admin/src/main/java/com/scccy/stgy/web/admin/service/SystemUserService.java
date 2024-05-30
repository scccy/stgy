package com.scccy.stgy.web.admin.service;

import com.scccy.stgy.model.domain.SystemUser;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SystemUserService extends IService<SystemUser>{


    int updateBatch(List<SystemUser> list);

    int batchInsert(List<SystemUser> list);

    int insertOrUpdate(SystemUser record);

    int insertOrUpdateSelective(SystemUser record);

}

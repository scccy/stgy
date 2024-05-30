package com.scccy.stgy.web.admin.service;

import java.util.List;
import com.scccy.stgy.model.domain.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;
public interface UserInfoService extends IService<UserInfo>{


    int updateBatch(List<UserInfo> list);

    int batchInsert(List<UserInfo> list);

    int insertOrUpdate(UserInfo record);

    int insertOrUpdateSelective(UserInfo record);

}

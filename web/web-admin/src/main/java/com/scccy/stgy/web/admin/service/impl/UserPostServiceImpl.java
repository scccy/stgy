package com.scccy.stgy.web.admin.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.scccy.stgy.model.domain.BaseModel;
import com.scccy.stgy.model.domain.SystemPost;
import com.scccy.stgy.web.admin.service.SystemPostService;
import com.scccy.stgy.web.admin.service.UserPostService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPostServiceImpl implements UserPostService {
    @Resource
    SystemPostService systemPostService;
    @Override
    public void updateStatusByPostId(Long id, String status) {
        systemPostService.update(Wrappers.lambdaUpdate(SystemPost.class).eq(BaseModel::getId, id)
                .set(SystemPost::getStatus, status));
    }

    @Override
    public List<SystemPost> list() {
        return systemPostService.list();
    }
}

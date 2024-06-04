package com.scccy.stgy.web.admin.service;

import com.scccy.stgy.model.domain.SystemPost;

import java.util.List;

public interface UserPostService {
    void updateStatusByPostId(Long id, String status);

    List<SystemPost> list();
}

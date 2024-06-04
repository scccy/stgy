package com.scccy.stgy.web.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.scccy.stgy.model.domain.SystemUser;
import com.scccy.stgy.model.dto.UserPageDto;
import com.scccy.stgy.model.vo.UserPageVo;

public interface UserService {
    void updateStatusById(Integer id, String status);

    void saveOrUpdate(SystemUser systemUser);

    boolean isUserNameAvailable(String username);

    Page<UserPageVo> page(Page<SystemUser> systemUserPage, UserPageDto userPageDto);

    UserPageVo getById(long id);

    void deleteById(long id);
}

package com.scccy.stgy.web.admin.service;

import com.scccy.stgy.model.dto.LoginDto;
import com.scccy.stgy.model.vo.CaptchaVO;
import com.scccy.stgy.model.vo.SystemUserInfoVo;

public interface LoginService {
    String login(LoginDto loginDto);

    CaptchaVO captcha();

    SystemUserInfoVo info(String token);
}

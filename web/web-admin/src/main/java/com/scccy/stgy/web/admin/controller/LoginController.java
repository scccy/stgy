package com.scccy.stgy.web.admin.controller;

import com.scccy.stgy.common.pojo.ResultData;
import com.scccy.stgy.model.dto.LoginDto;
import com.scccy.stgy.model.vo.CaptchaVO;
import com.scccy.stgy.model.vo.SystemUserInfoVo;
import com.scccy.stgy.web.admin.service.LoginService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin")
public class LoginController {
    @Resource
    LoginService loginService;
    @PostMapping("/login")
    public ResultData login(@RequestBody LoginDto loginDto){
        String token = loginService.login(loginDto);
        return ResultData.ok().setData(token);
    }
    @GetMapping("/login/captcha")
    public ResultData captcha(){
        CaptchaVO captchaVO = loginService.captcha();
        return ResultData.ok().setData(captchaVO);
    }
    @GetMapping("/info")
    public ResultData info(@RequestHeader("access_token" ) String token){
        SystemUserInfoVo systemUserInfoVo = loginService.info(token);
        return ResultData.ok().setData(systemUserInfoVo);
    }
}

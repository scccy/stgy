package com.scccy.stgy.web.admin.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.scccy.stgy.common.enums.RedisPrefixConsts;
import com.scccy.stgy.common.enums.ResultCodeEnum;
import com.scccy.stgy.common.handlerExption.GlobalExceptionHandler;
import com.scccy.stgy.common.untils.JwtUtils;
import com.scccy.stgy.model.domain.BaseModel;
import com.scccy.stgy.model.domain.SystemUser;
import com.scccy.stgy.model.dto.LoginDto;
import com.scccy.stgy.model.vo.CaptchaVO;
import com.scccy.stgy.model.vo.SystemUserInfoVo;
import com.scccy.stgy.web.admin.service.LoginService;
import com.scccy.stgy.web.admin.service.SystemUserService;
import com.wf.captcha.SpecCaptcha;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import jakarta.annotation.Resource;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    StringRedisTemplate stringRedisTemplate;
    @Resource
    SystemUserService systemUserService;

    @Override
    public String login(LoginDto loginDto) {
        String username = loginDto.getUsername();
        String password = loginDto.getPassword();
        String captchaCode = loginDto.getCaptchaCode();
        String captchaKey = loginDto.getCaptchaKey();
        if(StringUtils.isEmpty(username)||
                StringUtils.isEmpty(password)||
                StringUtils.isEmpty(captchaCode)||
                StringUtils.isEmpty(captchaKey)){
//            throw new RuntimeException("登录参数不能为空");
            throw new GlobalExceptionHandler.CustomException(ResultCodeEnum.PARAM_ERROR);
        }
        //2、校验验证码
        //获取验证码：  需要拼接key的前缀查询(使用相同的redisTemplate存取数据)
        String cacheCode = stringRedisTemplate.opsForValue().get(RedisPrefixConsts.SYSTEM_USER_LOGIN_PREFIX+captchaKey);
        //比较
        if(StringUtils.isEmpty(cacheCode) || !cacheCode.equals(captchaCode.toLowerCase())){
            throw new GlobalExceptionHandler.CustomException(ResultCodeEnum.ADMIN_CAPTCHA_CODE_ERROR);
        }
        //删除缓存：此处删除 如果后面账号密码错误 前端需要重新获取验证码
        stringRedisTemplate.delete(RedisPrefixConsts.SYSTEM_USER_LOGIN_PREFIX+captchaKey);
        //3、根据账号查询用户信息
        SystemUser systemUser = systemUserService.getOne(Wrappers.lambdaQuery(SystemUser.class)
                .eq(SystemUser::getUsername, username));
        if(systemUser==null){
//            throw new RuntimeException("账号错误");
            throw new GlobalExceptionHandler.CustomException(ResultCodeEnum.ADMIN_ACCOUNT_NOT_EXIST_ERROR);
        }

        //4、判断密码是否正确
        String encodedPwd = systemUser.getPassword();//获取数据库加密的密码
        //使用盐 采用注册相同的方式 对登录明文密码加密
        String salt = systemUser.getSalt();
        String inputEncodedPwd = DigestUtils.md5Hex(DigestUtils.md5Hex(password)+salt);
        if(!encodedPwd.equals(inputEncodedPwd)){
//            throw new RuntimeException("密码错误");
            throw new GlobalExceptionHandler.CustomException(ResultCodeEnum.ADMIN_ACCOUNT_ERROR);
        }
        //5、判断用户状态是否正常
        if(systemUser.getStatus()!=1){
//            throw new RuntimeException("账户禁用");
            throw new GlobalExceptionHandler.CustomException(ResultCodeEnum.ADMIN_ACCOUNT_DISABLED_ERROR);
        }

        return JwtUtils.buildToken(systemUser.getUsername() , systemUser.getId());
    }

    @Override
    public CaptchaVO captcha() {
        //1、生成验证码
        SpecCaptcha captcha = new SpecCaptcha(120 , 40 , 4);
        //2、缓存验证码文本到redis
        String key = UUID.randomUUID().toString().replace("-", "");
        String code = captcha.text().toLowerCase();
        //拼接字符串的规则 不要暴露给前端
        stringRedisTemplate.opsForValue().set(RedisPrefixConsts.SYSTEM_USER_LOGIN_PREFIX +key,code, 20 , TimeUnit.MINUTES);
        //3、组装数据
        CaptchaVO vo = new CaptchaVO();
        vo.setImage(captcha.toBase64());
        vo.setKey(key);
        return vo;
    }

    @Override
    public SystemUserInfoVo info(String token) {
        Jws<Claims> claimsJws = JwtUtils.parseToken(token);
        Long id = claimsJws.getBody().get("id", Long.class);
        SystemUser userServiceOne = systemUserService.getOne(Wrappers.lambdaQuery(SystemUser.class
        ).eq(BaseModel::getId, id));
        SystemUserInfoVo systemUserInfoVo = new SystemUserInfoVo();
        BeanUtils.copyProperties(userServiceOne,systemUserInfoVo);
        return systemUserInfoVo;
    }
}

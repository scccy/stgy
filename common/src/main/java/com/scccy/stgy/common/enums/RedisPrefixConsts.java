package com.scccy.stgy.common.enums;

public interface RedisPrefixConsts {
    String SYSTEM_USER_LOGIN_PREFIX = "system:user:login:";
    //验证码前缀
    String APP_LOGIN_CODE_PRIFIX = "app:login:code:";
    //两分钟不能重复发送验证码前缀
    String APP_LOGIN_LIMIT_PRIFIX = "app:login:limit:";
    //一天内只能发送五次 前缀
    String APP_LOGIN_COUNT_PRIFIX = "app:login:count:";
}
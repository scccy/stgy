package com.scccy.stgy.common.config;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "scccy.jwt")
public class JwtProperties implements InitializingBean {
    private String alg;
    private String typ;
    private long expire;
    private String subject;
    private String key;
    public static String ALG;
    public static  String TYP;
    public static  long EXPIRE;
    public static  String SUBJECT;
    public static  String KEY;

    @Override
    public void afterPropertiesSet() throws Exception {
        ALG = this.alg;
        TYP = this.typ;
        EXPIRE = this.expire;
        SUBJECT = this.subject;
        KEY = this.key;
    }
}

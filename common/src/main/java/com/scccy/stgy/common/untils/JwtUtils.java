package com.scccy.stgy.common.untils;


import com.scccy.stgy.common.config.JwtProperties;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtUtils {
    private JwtUtils(){

    }


    //封装jwt
    public static String buildToken(String username , Long id){
        return Jwts.builder()
                .setHeaderParam("alg", JwtProperties.ALG)
                .setHeaderParam("typ", JwtProperties.TYP)
                .claim("id", id)
                .claim("username", username)
                //设置授权过期时间为7天
                .setExpiration(new Date(System.currentTimeMillis() + JwtProperties.EXPIRE))
                .setSubject(JwtProperties.SUBJECT)
                .signWith(SignatureAlgorithm.HS256, JwtProperties.KEY)
                .compact();
    }
    //解析jwt
    public static Jws<Claims> parseToken(String token){
        return Jwts.parserBuilder()
                .setSigningKey(JwtProperties.KEY) //设置密钥
                .build() //构建解析器
                //解析载荷内容
                .parseClaimsJws(token);
    }

    public static boolean checkToken(String token) {
        try {
            Jwts.parserBuilder()
                    .setSigningKey(JwtProperties.KEY) //设置密钥
                    .build() //构建解析器
                    //解析载荷内容
                    .parseClaimsJws(token);
            //解析token：没有过期、签名正确、数据正常  表示登录状态正常
            return true;
        } catch (Exception e) {
//            throw new RuntimeException(e);
            //jwt解析失败
            return false;
        }
    }
}

package com.scccy.stgy.model.dto;

import lombok.Data;

@Data
public class LoginDto {
    private String username;
    private String password;
    private String captchaKey;
    private String captchaCode;

}

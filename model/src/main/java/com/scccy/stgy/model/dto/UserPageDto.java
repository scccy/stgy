package com.scccy.stgy.model.dto;

import lombok.Data;

@Data
public class UserPageDto {
    private Integer current;
    private Integer size;
    private String name;
    private String phone;
}

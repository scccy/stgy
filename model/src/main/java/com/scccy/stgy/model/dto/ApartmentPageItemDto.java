package com.scccy.stgy.model.dto;

import lombok.Data;

@Data
public class ApartmentPageItemDto {
    private Integer current;
    private Integer size;
    private String provinceId;
    private String cityId;
    private String districtId;
}

package com.scccy.stgy.model.vo;

import com.scccy.stgy.model.domain.ApartmentInfo;
import com.scccy.stgy.model.dto.ApartmentPageItemDto;
import lombok.Data;

@Data
public class ApartmentPageItemVo extends ApartmentInfo {
    private Integer totalRoomCount;
    private Integer freeRoomCount;
}

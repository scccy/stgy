package com.scccy.stgy.model.vo;

import com.scccy.stgy.model.domain.ApartmentInfo;
import com.scccy.stgy.model.domain.RoomInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Data
public class RoomPageItemVo extends RoomInfo {
    @Schema(description = "租约结束日期")
    private Date leaseEndDate;

    @Schema(description = "当前入住状态")
    private Boolean isCheckIn;

    @Schema(description = "所属公寓信息")
    private ApartmentInfo apartmentInfo;


}
package com.scccy.stgy.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 房间信息表
 */
@Schema(description = "房间信息表")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "room_info")
public class RoomInfo extends BaseModel implements Serializable {
    /**
     * 房间号
     */
    @TableField(value = "room_number")
    @Schema(description = "房间号")
    private String roomNumber;

    /**
     * 租金（元/月）
     */
    @TableField(value = "rent")
    @Schema(description = "租金（元/月）")
    private BigDecimal rent;

    /**
     * 所属公寓id
     */
    @TableField(value = "apartment_id")
    @Schema(description = "所属公寓id")
    private Long apartmentId;

    /**
     * 是否发布
     */
    @TableField(value = "is_release")
    @Schema(description = "是否发布")
    private Byte isRelease;

    private static final long serialVersionUID = 1L;
}
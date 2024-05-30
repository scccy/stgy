package com.scccy.stgy.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 房间租期管理表
 */
@Schema(description = "房间租期管理表")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "room_lease_term")
public class RoomLeaseTerm extends BaseModel implements Serializable {
    /**
     * 房间id
     */
    @TableField(value = "room_id")
    @Schema(description = "房间id")
    private Long roomId;

    /**
     * 租期id
     */
    @TableField(value = "lease_term_id")
    @Schema(description = "租期id")
    private Long leaseTermId;

    private static final long serialVersionUID = 1L;
}
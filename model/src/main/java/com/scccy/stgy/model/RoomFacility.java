package com.scccy.stgy.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
    * 房间&配套关联表
    */
@Schema(description="房间&配套关联表")
@Data
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "room_facility")
public class RoomFacility extends BaseModel implements Serializable {
    /**
     * 房间id
     */
    @TableField(value = "room_id")
    @Schema(description="房间id")
    private Long roomId;

    /**
     * 房间设施id
     */
    @TableField(value = "facility_id")
    @Schema(description="房间设施id")
    private Long facilityId;

    /**
     * 是否删除
     */
    @TableField(value = "is_deleted")
    @Schema(description="是否删除")
    private Byte isDeleted;

    private static final long serialVersionUID = 1L;
}
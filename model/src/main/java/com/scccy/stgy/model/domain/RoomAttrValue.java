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
 * 房间&基本属性值关联表
 */
@Schema(description = "房间&基本属性值关联表")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "room_attr_value")
public class RoomAttrValue extends BaseModel implements Serializable {
    /**
     * 房间id
     */
    @TableField(value = "room_id")
    @Schema(description = "房间id")
    private Long roomId;

    /**
     * 属性值id
     */
    @TableField(value = "attr_value_id")
    @Schema(description = "属性值id")
    private Long attrValueId;

    private static final long serialVersionUID = 1L;
}
package com.scccy.stgy.model.domain;

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
 * 配套信息表
 */
@Schema(description = "配套信息表")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "facility_info")
public class FacilityInfo extends BaseModel implements Serializable {
    /**
     * 类型（1:公寓图片,2:房间图片）
     */
    @TableField(value = "`type`")
    @Schema(description = "类型（1:公寓图片,2:房间图片）")
    private Byte type;

    /**
     * 名称
     */
    @TableField(value = "`name`")
    @Schema(description = "名称")
    private String name;

    @TableField(value = "icon")
    @Schema(description = "")
    private String icon;

    private static final long serialVersionUID = 1L;
}
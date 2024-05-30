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
 * 岗位信息表
 */
@Schema(description = "岗位信息表")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "system_post")
public class SystemPost extends BaseModel implements Serializable {
    /**
     * 岗位编码
     */
    @TableField(value = "code")
    @Schema(description = "岗位编码")
    private String code;

    /**
     * 岗位名称
     */
    @TableField(value = "`name`")
    @Schema(description = "岗位名称")
    private String name;

    /**
     * 描述
     */
    @TableField(value = "description")
    @Schema(description = "描述")
    private String description;

    /**
     * 状态（1正常 0停用）
     */
    @TableField(value = "`status`")
    @Schema(description = "状态（1正常 0停用）")
    private Boolean status;

    private static final long serialVersionUID = 1L;
}
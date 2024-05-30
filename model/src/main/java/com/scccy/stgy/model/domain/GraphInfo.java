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
 * 图片信息表
 */
@Schema(description = "图片信息表")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "graph_info")
public class GraphInfo extends BaseModel implements Serializable {
    /**
     * 图片名称
     */
    @TableField(value = "`name`")
    @Schema(description = "图片名称")
    private String name;

    /**
     * 图片所属对象类型（1:apartment,2:room）
     */
    @TableField(value = "item_type")
    @Schema(description = "图片所属对象类型（1:apartment,2:room）")
    private Byte itemType;

    /**
     * 图片所有对象id
     */
    @TableField(value = "item_id")
    @Schema(description = "图片所有对象id")
    private Long itemId;

    /**
     * 图片地址
     */
    @TableField(value = "url")
    @Schema(description = "图片地址")
    private String url;

    private static final long serialVersionUID = 1L;
}
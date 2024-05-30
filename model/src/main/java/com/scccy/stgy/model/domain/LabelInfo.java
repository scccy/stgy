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
 * 标签信息表
 */
@Schema(description = "标签信息表")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "label_info")
public class LabelInfo extends BaseModel implements Serializable {
    /**
     * 类型（1:公寓标签,2:房间标签）
     */
    @TableField(value = "`type`")
    @Schema(description = "类型（1:公寓标签,2:房间标签）")
    private Integer type;

    /**
     * 标签名称
     */
    @TableField(value = "`name`")
    @Schema(description = "标签名称")
    private String name;

    private static final long serialVersionUID = 1L;
}
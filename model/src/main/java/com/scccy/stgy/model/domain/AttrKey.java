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
 * 房间基本属性表
 */
@Schema(description = "房间基本属性表")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "attr_key")
public class AttrKey extends BaseModel implements Serializable {
    /**
     * 属性key
     */
    @TableField(value = "`name`")
    @Schema(description = "属性key")
    private String name;

    private static final long serialVersionUID = 1L;
}
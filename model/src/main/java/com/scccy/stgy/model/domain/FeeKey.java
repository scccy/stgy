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
 * 杂项费用名称表
 */
@Schema(description = "杂项费用名称表")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "fee_key")
public class FeeKey extends BaseModel implements Serializable {
    /**
     * 付款项key
     */
    @TableField(value = "`name`")
    @Schema(description = "付款项key")
    private String name;

    private static final long serialVersionUID = 1L;
}
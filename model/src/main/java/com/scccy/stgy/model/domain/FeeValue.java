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
 * 杂项费用值表
 */
@Schema(description = "杂项费用值表")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "fee_value")
public class FeeValue extends BaseModel implements Serializable {
    /**
     * 费用value
     */
    @TableField(value = "`name`")
    @Schema(description = "费用value")
    private String name;

    /**
     * 收费单位
     */
    @TableField(value = "unit")
    @Schema(description = "收费单位")
    private String unit;

    /**
     * 费用所对的fee_key
     */
    @TableField(value = "fee_key_id")
    @Schema(description = "费用所对的fee_key")
    private Long feeKeyId;

    private static final long serialVersionUID = 1L;
}
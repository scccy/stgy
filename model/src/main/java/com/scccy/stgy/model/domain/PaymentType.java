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
 * 支付方式表
 */
@Schema(description = "支付方式表")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "payment_type")
public class PaymentType extends BaseModel implements Serializable {
    /**
     * 付款方式名称
     */
    @TableField(value = "`name`")
    @Schema(description = "付款方式名称")
    private String name;

    /**
     * 每次支付租期数
     */
    @TableField(value = "pay_month_count")
    @Schema(description = "每次支付租期数")
    private Integer payMonthCount;

    /**
     * 付费说明
     */
    @TableField(value = "additional_info")
    @Schema(description = "付费说明")
    private String additionalInfo;

    private static final long serialVersionUID = 1L;
}
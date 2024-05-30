package com.scccy.stgy.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 租约信息表
 */
@Schema(description = "租约信息表")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "lease_agreement")
public class LeaseAgreement extends BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 承租人手机号码
     */
    @TableField(value = "phone")
    @Schema(description = "承租人手机号码")
    private String phone;

    /**
     * 承租人姓名
     */
    @TableField(value = "`name`")
    @Schema(description = "承租人姓名")
    private String name;

    /**
     * 承租人身份证号码
     */
    @TableField(value = "identification_number")
    @Schema(description = "承租人身份证号码")
    private String identificationNumber;

    /**
     * 签约公寓id
     */
    @TableField(value = "apartment_id")
    @Schema(description = "签约公寓id")
    private Long apartmentId;

    /**
     * 签约房间id
     */
    @TableField(value = "room_id")
    @Schema(description = "签约房间id")
    private Long roomId;

    /**
     * 租约开始日期
     */
    @TableField(value = "lease_start_date")
    @Schema(description = "租约开始日期")
    private Date leaseStartDate;

    /**
     * 租约结束日期
     */
    @TableField(value = "lease_end_date")
    @Schema(description = "租约结束日期")
    private Date leaseEndDate;

    /**
     * 租期id
     */
    @TableField(value = "lease_term_id")
    @Schema(description = "租期id")
    private Long leaseTermId;

    /**
     * 租金（元/月）
     */
    @TableField(value = "rent")
    @Schema(description = "租金（元/月）")
    private BigDecimal rent;

    /**
     * 押金（元）
     */
    @TableField(value = "deposit")
    @Schema(description = "押金（元）")
    private BigDecimal deposit;

    /**
     * 支付类型id

     */
    @TableField(value = "payment_type_id")
    @Schema(description = "支付类型id")
            private Long paymentTypeId;

            /**
             * 租约状态（1:签约待确认，2:已签约，3:已取消，4:已到期，5:退租待确认，6:已退租，7:续约待确认）
            */
            @TableField(value = "`status`")
            @Schema(description = "租约状态（1:签约待确认，2:已签约，3:已取消，4:已到期，5:退租待确认，6:已退租，7:续约待确认）")
            private Byte status;

            /**
             * 租约来源（1:新签，2:续约）
            */
            @TableField(value = "source_type")
            @Schema(description = "租约来源（1:新签，2:续约）")
            private Byte sourceType;

            /**
             * 备注信息
            */
            @TableField(value = "additional_info")
            @Schema(description = "备注信息")
            private String additionalInfo;

}
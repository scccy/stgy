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
 * 房间&支付方式关联表
 */
@Schema(description = "房间&支付方式关联表")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "room_payment_type")
public class RoomPaymentType extends BaseModel implements Serializable {
    /**
     * 房间id
     */
    @TableField(value = "room_id")
    @Schema(description = "房间id")
    private Long roomId;

    /**
     * 支付类型id
     */
    @TableField(value = "payment_type_id")
    @Schema(description = "支付类型id")
    private Long paymentTypeId;

    private static final long serialVersionUID = 1L;
}
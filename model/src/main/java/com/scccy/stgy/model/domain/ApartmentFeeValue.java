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
 * 公寓&杂费关联表
 */
@Schema(description = "公寓&杂费关联表")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "apartment_fee_value")
public class ApartmentFeeValue extends BaseModel implements Serializable {
    /**
     * 公寓id
     */
    @TableField(value = "apartment_id")
    @Schema(description = "公寓id")
    private Long apartmentId;

    /**
     * 收费项value_id
     */
    @TableField(value = "fee_value_id")
    @Schema(description = "收费项value_id")
    private Long feeValueId;

    private static final long serialVersionUID = 1L;
}
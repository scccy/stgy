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
 * 租期
 */
@Schema(description = "租期")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "lease_term")
public class LeaseTerm extends BaseModel implements Serializable {
    /**
     * 租期
     */
    @TableField(value = "month_count")
    @Schema(description = "租期")
    private Integer monthCount;

    /**
     * 租期单位
     */
    @TableField(value = "unit")
    @Schema(description = "租期单位")
    private String unit;

    private static final long serialVersionUID = 1L;
}
package com.scccy.stgy.model;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
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
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    @Schema(description = "")
    private Long id;

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

    /**
     * 是否删除
     */
    private static final long serialVersionUID = 1L;
}
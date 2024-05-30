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

@Schema
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "district_info")
public class DistrictInfo extends BaseModel implements Serializable {
    /**
     * 区域名称
     */
    @TableField(value = "`name`")
    @Schema(description = "区域名称")
    private String name;

    /**
     * 所属城市id
     */
    @TableField(value = "city_id")
    @Schema(description = "所属城市id")
    private Integer cityId;

    private static final long serialVersionUID = 1L;
}
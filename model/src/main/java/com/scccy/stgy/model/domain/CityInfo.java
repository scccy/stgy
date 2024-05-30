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
@TableName(value = "city_info")
public class CityInfo extends BaseModel implements Serializable {
    /**
     * 城市名称
     */
    @TableField(value = "`name`")
    @Schema(description = "城市名称")
    private String name;

    /**
     * 所属省份id
     */
    @TableField(value = "province_id")
    @Schema(description = "所属省份id")
    private Integer provinceId;

    private static final long serialVersionUID = 1L;
}
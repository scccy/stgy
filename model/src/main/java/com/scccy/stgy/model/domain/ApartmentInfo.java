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
 * 公寓信息表
 */
@Schema(description = "公寓信息表")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "apartment_info")
public class ApartmentInfo extends BaseModel implements Serializable {
    /**
     * 公寓名称
     */
    @TableField(value = "`name`")
    @Schema(description = "公寓名称")
    private String name;

    /**
     * 公寓介绍
     */
    @TableField(value = "introduction")
    @Schema(description = "公寓介绍")
    private String introduction;

    /**
     * 所处区域id
     */
    @TableField(value = "district_id")
    @Schema(description = "所处区域id")
    private Long districtId;

    /**
     * 区域名称
     */
    @TableField(value = "district_name")
    @Schema(description = "区域名称")
    private String districtName;

    /**
     * 所处城市id
     */
    @TableField(value = "city_id")
    @Schema(description = "所处城市id")
    private Long cityId;

    /**
     * 城市名称
     */
    @TableField(value = "city_name")
    @Schema(description = "城市名称")
    private String cityName;

    /**
     * 所处省份id
     */
    @TableField(value = "province_id")
    @Schema(description = "所处省份id")
    private Long provinceId;

    /**
     * 省份名称
     */
    @TableField(value = "province_name")
    @Schema(description = "省份名称")
    private String provinceName;

    /**
     * 详细地址
     */
    @TableField(value = "address_detail")
    @Schema(description = "详细地址")
    private String addressDetail;

    /**
     * 经度
     */
    @TableField(value = "latitude")
    @Schema(description = "经度")
    private String latitude;

    /**
     * 纬度
     */
    @TableField(value = "longitude")
    @Schema(description = "纬度")
    private String longitude;

    /**
     * 公寓前台电话
     */
    @TableField(value = "phone")
    @Schema(description = "公寓前台电话")
    private String phone;

    /**
     * 是否发布（1:发布，0:未发布）
     */
    @TableField(value = "is_release")
    @Schema(description = "是否发布（1:发布，0:未发布）")
    private Byte release;

    private static final long serialVersionUID = 1L;
}
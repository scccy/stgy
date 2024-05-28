package com.scccy.stgy.model;

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
 * 公寓&配套关联表
 */
@Schema(description = "公寓&配套关联表")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "apartment_facility")
public class ApartmentFacility extends BaseModel implements Serializable {
    /**
     * 公寓id
     */
    @TableField(value = "apartment_id")
    @Schema(description = "公寓id")
    private Long apartmentId;

    /**
     * 设施id
     */
    @TableField(value = "facility_id")
    @Schema(description = "设施id")
    private Long facilityId;

    /**
     * 是否删除
     */
    @TableField(value = "is_deleted")
    @Schema(description = "是否删除")
    private Byte isDeleted;

    private static final long serialVersionUID = 1L;
}
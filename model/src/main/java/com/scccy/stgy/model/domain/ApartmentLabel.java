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
 * 公寓标签关联表
 */
@Schema(description = "公寓标签关联表")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "apartment_label")
public class ApartmentLabel extends BaseModel implements Serializable {
    /**
     * 公寓id
     */
    @TableField(value = "apartment_id")
    @Schema(description = "公寓id")
    private Long apartmentId;

    /**
     * 标签id
     */
    @TableField(value = "label_id")
    @Schema(description = "标签id")
    private Long labelId;

    private static final long serialVersionUID = 1L;
}
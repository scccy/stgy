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
 * 预约看房信息表
 */
@Schema(description = "预约看房信息表")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "view_appointment")
public class ViewAppointment extends BaseModel implements Serializable {
    /**
     * 用户id
     */
    @TableField(value = "user_id")
    @Schema(description = "用户id")
    private Long userId;

    /**
     * 用户姓名
     */
    @TableField(value = "`name`")
    @Schema(description = "用户姓名")
    private String name;

    /**
     * 用户手机号码
     */
    @TableField(value = "phone")
    @Schema(description = "用户手机号码")
    private String phone;

    /**
     * 公寓id
     */
    @TableField(value = "apartment_id")
    @Schema(description = "公寓id")
    private Integer apartmentId;

    /**
     * 预约时间
     */
    @TableField(value = "appointment_time")
    @Schema(description = "预约时间")
    private Date appointmentTime;

    /**
     * 备注信息
     */
    @TableField(value = "additional_info")
    @Schema(description = "备注信息")
    private String additionalInfo;

    /**
     * 预约状态（1:待看房，2:已取消，3已看房）
     */
    @TableField(value = "appointment_status")
    @Schema(description = "预约状态（1:待看房，2:已取消，3已看房）")
    private Byte appointmentStatus;

    private static final long serialVersionUID = 1L;
}
package com.scccy.stgy.model.domain;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 员工信息表
 */
@Schema(description = "员工信息表")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "`system_user`")
public class SystemUser extends BaseModel implements Serializable {
    /**
     * 用户名
     */
    @TableField(value = "username")
    @Schema(description = "用户名")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "`password`", updateStrategy = FieldStrategy.NOT_EMPTY)
    @Schema(description = "密码")
    private String password;

    /**
     * 姓名
     */
    @TableField(value = "`name`")
    @Schema(description = "姓名")
    private String name;

    /**
     * 用户类型
     */
    @TableField(value = "`type`")
    @Schema(description = "用户类型")
    private Byte type;

    /**
     * 手机号码
     */
    @TableField(value = "phone")
    @Schema(description = "手机号码")
    private String phone;

    /**
     * 头像地址
     */
    @TableField(value = "avatar_url")
    @Schema(description = "头像地址")
    private String avatarUrl;

    /**
     * 备注信息
     */
    @TableField(value = "additional_info")
    @Schema(description = "备注信息")
    private String additionalInfo;

    /**
     * 岗位id
     */
    @TableField(value = "post_id")
    @Schema(description = "岗位id")
    private Long postId;

    /**
     * 账号状态
     */
    @TableField(value = "`status`")
    @Schema(description = "账号状态")
    private Byte status;
    @TableField(value = "`salt`",updateStrategy = FieldStrategy.NOT_EMPTY)
    private String salt;

    private static final long serialVersionUID = 1L;
}
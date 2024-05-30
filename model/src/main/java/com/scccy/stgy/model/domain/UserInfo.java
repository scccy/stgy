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
 * 用户信息表
 */
@Schema(description = "用户信息表")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user_info")
public class UserInfo extends BaseModel implements Serializable {
    /**
     * 手机号码（用做登录用户名）
     */
    @TableField(value = "phone")
    @Schema(description = "手机号码（用做登录用户名）")
    private String phone;

    /**
     * 密码
     */
    @TableField(value = "`password`")
    @Schema(description = "密码")
    private String password;

    /**
     * 头像url
     */
    @TableField(value = "avatar_url")
    @Schema(description = "头像url")
    private String avatarUrl;

    /**
     * 昵称
     */
    @TableField(value = "nickname")
    @Schema(description = "昵称")
    private String nickname;

    /**
     * 账号状态
     */
    @TableField(value = "`status`")
    @Schema(description = "账号状态")
    private Byte status;

    private static final long serialVersionUID = 1L;
}
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
 * 浏览历史
 */
@Schema(description = "浏览历史")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "browsing_history")
public class BrowsingHistory extends BaseModel implements Serializable {
    /**
     * 用户id
     */
    @TableField(value = "user_id")
    @Schema(description = "用户id")
    private Long userId;

    /**
     * 浏览房间id
     */
    @TableField(value = "room_id")
    @Schema(description = "浏览房间id")
    private Long roomId;

    @TableField(value = "browse_time")
    @Schema(description = "")
    private Date browseTime;

    private static final long serialVersionUID = 1L;
}
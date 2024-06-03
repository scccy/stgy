package com.scccy.stgy.model.domain;

import com.alibaba.fastjson2.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseModel {
    @Schema(description = "主键值")
    @TableId
    private Long id;
    @Schema(description = "创建时间")
    @JSONField(serialize = false)
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @Schema(description = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    @JSONField(serialize = false)
    private Date updateTime;
    @Schema(description = "逻辑删除字段：0未删除，1已删除")
    @TableLogic
    @JSONField(serialize = false)
    @TableField(value = "is_deleted")
    private Byte deleted = 0;

}

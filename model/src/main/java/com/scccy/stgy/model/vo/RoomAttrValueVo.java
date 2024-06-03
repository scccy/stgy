package com.scccy.stgy.model.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class RoomAttrValueVo {

    private Long id;
    @TableField("`name`")
    private String name;
    private Long attrKeyId;
    private String attrKeyName;

}

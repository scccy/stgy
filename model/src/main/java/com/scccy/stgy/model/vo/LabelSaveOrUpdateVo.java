package com.scccy.stgy.model.vo;

import com.scccy.stgy.model.domain.LabelInfo;
import lombok.Data;

@Data
public class LabelSaveOrUpdateVo {
    private Long id;
    private String type;
    private String name;

//    public LabelInfo toLabelInfo(){
//        LabelInfo labelInfo = new LabelInfo();
//        labelInfo.setId(id);
//        labelInfo.setType();
//
//    }
}


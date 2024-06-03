package com.scccy.stgy.web.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.scccy.stgy.model.domain.RoomAttrValue;
import com.scccy.stgy.model.vo.RoomAttrValueVo;

import java.util.List;

public interface RoomAttrValueService extends IService<RoomAttrValue>{


    int updateBatch(List<RoomAttrValue> list);

    int batchInsert(List<RoomAttrValue> list);

    int insertOrUpdate(RoomAttrValue record);

    int insertOrUpdateSelective(RoomAttrValue record);

    List<RoomAttrValueVo> getAttrValueVos(Long id);
}

package com.scccy.stgy.web.admin.service;

import java.util.List;
import com.scccy.stgy.model.domain.RoomAttrValue;
import com.baomidou.mybatisplus.extension.service.IService;
import com.scccy.stgy.model.vo.AttrValueVo;

public interface RoomAttrValueService extends IService<RoomAttrValue>{


    int updateBatch(List<RoomAttrValue> list);

    int batchInsert(List<RoomAttrValue> list);

    int insertOrUpdate(RoomAttrValue record);

    int insertOrUpdateSelective(RoomAttrValue record);

    List<AttrValueVo> getAttrValueVos(Integer id);
}

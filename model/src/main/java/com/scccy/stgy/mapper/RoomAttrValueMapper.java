package com.scccy.stgy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.RoomAttrValue;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomAttrValueMapper extends BaseMapper<RoomAttrValue> {
    int updateBatch(List<RoomAttrValue> list);

    int batchInsert(@Param("list") List<RoomAttrValue> list);

    int insertOrUpdate(RoomAttrValue record);

    int insertOrUpdateSelective(RoomAttrValue record);
}
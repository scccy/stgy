package com.scccy.stgy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.RoomLabel;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomLabelMapper extends BaseMapper<RoomLabel> {
    int updateBatch(List<RoomLabel> list);

    int batchInsert(@Param("list") List<RoomLabel> list);

    int insertOrUpdate(RoomLabel record);

    int insertOrUpdateSelective(RoomLabel record);
}
package com.scccy.stgy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.RoomFacility;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomFacilityMapper extends BaseMapper<RoomFacility> {
    int updateBatch(List<RoomFacility> list);

    int batchInsert(@Param("list") List<RoomFacility> list);

    int insertOrUpdate(RoomFacility record);

    int insertOrUpdateSelective(RoomFacility record);
}
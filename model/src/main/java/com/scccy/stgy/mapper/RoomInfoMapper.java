package com.scccy.stgy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.RoomInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomInfoMapper extends BaseMapper<RoomInfo> {
    int updateBatch(List<RoomInfo> list);

    int batchInsert(@Param("list") List<RoomInfo> list);

    int insertOrUpdate(RoomInfo record);

    int insertOrUpdateSelective(RoomInfo record);
}
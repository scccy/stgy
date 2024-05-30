package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.RoomLeaseTerm;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RoomLeaseTermMapper extends BaseMapper<RoomLeaseTerm> {
    int updateBatch(List<RoomLeaseTerm> list);

    int batchInsert(@Param("list") List<RoomLeaseTerm> list);

    int insertOrUpdate(RoomLeaseTerm record);

    int insertOrUpdateSelective(RoomLeaseTerm record);
}
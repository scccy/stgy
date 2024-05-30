package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.GraphInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GraphInfoMapper extends BaseMapper<GraphInfo> {
    int updateBatch(List<GraphInfo> list);

    int batchInsert(@Param("list") List<GraphInfo> list);

    int insertOrUpdate(GraphInfo record);

    int insertOrUpdateSelective(GraphInfo record);
}
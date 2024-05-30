package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.FeeKey;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface FeeKeyMapper extends BaseMapper<FeeKey> {
    int updateBatch(List<FeeKey> list);

    int batchInsert(@Param("list") List<FeeKey> list);

    int insertOrUpdate(FeeKey record);

    int insertOrUpdateSelective(FeeKey record);
}
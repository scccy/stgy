package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.FeeValue;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface FeeValueMapper extends BaseMapper<FeeValue> {
    int updateBatch(List<FeeValue> list);

    int batchInsert(@Param("list") List<FeeValue> list);

    int insertOrUpdate(FeeValue record);

    int insertOrUpdateSelective(FeeValue record);
}
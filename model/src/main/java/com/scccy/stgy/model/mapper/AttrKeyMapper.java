package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.AttrKey;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AttrKeyMapper extends BaseMapper<AttrKey> {
    int updateBatch(List<AttrKey> list);

    int batchInsert(@Param("list") List<AttrKey> list);

    int insertOrUpdate(AttrKey record);

    int insertOrUpdateSelective(AttrKey record);
}
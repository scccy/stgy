package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.AttrValue;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AttrValueMapper extends BaseMapper<AttrValue> {
    int updateBatch(List<AttrValue> list);

    int batchInsert(@Param("list") List<AttrValue> list);

    int insertOrUpdate(AttrValue record);

    int insertOrUpdateSelective(AttrValue record);
}
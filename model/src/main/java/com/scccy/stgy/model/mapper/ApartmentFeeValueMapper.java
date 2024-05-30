package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.ApartmentFeeValue;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ApartmentFeeValueMapper extends BaseMapper<ApartmentFeeValue> {
    int updateBatch(List<ApartmentFeeValue> list);

    int batchInsert(@Param("list") List<ApartmentFeeValue> list);

    int insertOrUpdate(ApartmentFeeValue record);

    int insertOrUpdateSelective(ApartmentFeeValue record);
}
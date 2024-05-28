package com.scccy.stgy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.ApartmentFacility;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ApartmentFacilityMapper extends BaseMapper<ApartmentFacility> {
    int updateBatch(List<ApartmentFacility> list);

    int batchInsert(@Param("list") List<ApartmentFacility> list);

    int insertOrUpdate(ApartmentFacility record);

    int insertOrUpdateSelective(ApartmentFacility record);
}
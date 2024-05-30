package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.FacilityInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface FacilityInfoMapper extends BaseMapper<FacilityInfo> {
    int updateBatch(List<FacilityInfo> list);

    int batchInsert(@Param("list") List<FacilityInfo> list);

    int insertOrUpdate(FacilityInfo record);

    int insertOrUpdateSelective(FacilityInfo record);
}
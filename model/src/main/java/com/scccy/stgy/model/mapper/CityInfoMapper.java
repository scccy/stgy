package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.CityInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CityInfoMapper extends BaseMapper<CityInfo> {
    int updateBatch(List<CityInfo> list);

    int batchInsert(@Param("list") List<CityInfo> list);

    int insertOrUpdate(CityInfo record);

    int insertOrUpdateSelective(CityInfo record);
}
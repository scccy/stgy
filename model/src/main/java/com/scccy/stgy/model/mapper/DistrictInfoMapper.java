package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.DistrictInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DistrictInfoMapper extends BaseMapper<DistrictInfo> {
    int updateBatch(List<DistrictInfo> list);

    int batchInsert(@Param("list") List<DistrictInfo> list);

    int insertOrUpdate(DistrictInfo record);

    int insertOrUpdateSelective(DistrictInfo record);
}
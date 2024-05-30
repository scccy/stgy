package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.ProvinceInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ProvinceInfoMapper extends BaseMapper<ProvinceInfo> {
    int updateBatch(List<ProvinceInfo> list);

    int batchInsert(@Param("list") List<ProvinceInfo> list);

    int insertOrUpdate(ProvinceInfo record);

    int insertOrUpdateSelective(ProvinceInfo record);
}
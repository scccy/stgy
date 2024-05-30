package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.ApartmentInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ApartmentInfoMapper extends BaseMapper<ApartmentInfo> {
    int updateBatch(List<ApartmentInfo> list);

    int batchInsert(@Param("list") List<ApartmentInfo> list);

    int insertOrUpdate(ApartmentInfo record);

    int insertOrUpdateSelective(ApartmentInfo record);
}
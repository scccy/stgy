package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.ApartmentLabel;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ApartmentLabelMapper extends BaseMapper<ApartmentLabel> {
    int updateBatch(List<ApartmentLabel> list);

    int batchInsert(@Param("list") List<ApartmentLabel> list);

    int insertOrUpdate(ApartmentLabel record);

    int insertOrUpdateSelective(ApartmentLabel record);
}
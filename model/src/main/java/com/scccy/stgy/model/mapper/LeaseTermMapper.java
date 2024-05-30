package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.LeaseTerm;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface LeaseTermMapper extends BaseMapper<LeaseTerm> {
    int updateBatch(List<LeaseTerm> list);

    int batchInsert(@Param("list") List<LeaseTerm> list);

    int insertOrUpdate(LeaseTerm record);

    int insertOrUpdateSelective(LeaseTerm record);
}
package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.LabelInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface LabelInfoMapper extends BaseMapper<LabelInfo> {
    int updateBatch(List<LabelInfo> list);

    int batchInsert(@Param("list") List<LabelInfo> list);

    int insertOrUpdate(LabelInfo record);

    int insertOrUpdateSelective(LabelInfo record);
}
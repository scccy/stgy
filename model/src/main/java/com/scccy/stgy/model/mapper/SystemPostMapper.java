package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.SystemPost;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SystemPostMapper extends BaseMapper<SystemPost> {
    int updateBatch(List<SystemPost> list);

    int batchInsert(@Param("list") List<SystemPost> list);

    int insertOrUpdate(SystemPost record);

    int insertOrUpdateSelective(SystemPost record);
}
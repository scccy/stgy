package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.BrowsingHistory;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BrowsingHistoryMapper extends BaseMapper<BrowsingHistory> {
    int updateBatch(List<BrowsingHistory> list);

    int batchInsert(@Param("list") List<BrowsingHistory> list);

    int insertOrUpdate(BrowsingHistory record);

    int insertOrUpdateSelective(BrowsingHistory record);
}
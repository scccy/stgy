package com.scccy.stgy.web.admin.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.scccy.stgy.model.domain.BrowsingHistory;
import com.scccy.stgy.model.mapper.BrowsingHistoryMapper;
import com.scccy.stgy.web.admin.service.BrowsingHistoryService;
@Service
public class BrowsingHistoryServiceImpl extends ServiceImpl<BrowsingHistoryMapper, BrowsingHistory> implements BrowsingHistoryService{

    @Override
    public int updateBatch(List<BrowsingHistory> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<BrowsingHistory> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(BrowsingHistory record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(BrowsingHistory record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

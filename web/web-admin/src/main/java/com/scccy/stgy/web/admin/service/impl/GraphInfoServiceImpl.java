package com.scccy.stgy.web.admin.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.scccy.stgy.model.mapper.GraphInfoMapper;
import com.scccy.stgy.model.domain.GraphInfo;
import com.scccy.stgy.web.admin.service.GraphInfoService;
@Service
public class GraphInfoServiceImpl extends ServiceImpl<GraphInfoMapper, GraphInfo> implements GraphInfoService{

    @Override
    public int updateBatch(List<GraphInfo> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<GraphInfo> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(GraphInfo record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(GraphInfo record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

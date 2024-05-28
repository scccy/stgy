package com.scccy.stgy.admin.service;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.scccy.stgy.mapper.RoomLabelMapper;
import com.scccy.stgy.model.RoomLabel;
import com.scccy.stgy.admin.service.impl.RoomLabelService;
@Service
public class RoomLabelServiceImpl extends ServiceImpl<RoomLabelMapper, RoomLabel> implements RoomLabelService{

    @Override
    public int updateBatch(List<RoomLabel> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<RoomLabel> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(RoomLabel record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(RoomLabel record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

package com.scccy.stgy.web.admin.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scccy.stgy.model.mapper.RoomLabelMapper;
import java.util.List;
import com.scccy.stgy.model.domain.RoomLabel;
import com.scccy.stgy.web.admin.service.RoomLabelService;
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

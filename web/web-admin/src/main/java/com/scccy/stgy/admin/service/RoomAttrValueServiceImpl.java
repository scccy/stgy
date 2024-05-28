package com.scccy.stgy.admin.service;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.scccy.stgy.model.RoomAttrValue;
import com.scccy.stgy.mapper.RoomAttrValueMapper;
import com.scccy.stgy.admin.service.impl.RoomAttrValueService;
@Service
public class RoomAttrValueServiceImpl extends ServiceImpl<RoomAttrValueMapper, RoomAttrValue> implements RoomAttrValueService{

    @Override
    public int updateBatch(List<RoomAttrValue> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<RoomAttrValue> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(RoomAttrValue record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(RoomAttrValue record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

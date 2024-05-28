package com.scccy.stgy.admin.service;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.scccy.stgy.mapper.RoomInfoMapper;
import com.scccy.stgy.model.RoomInfo;
import com.scccy.stgy.admin.service.impl.RoomInfoService;
@Service
public class RoomInfoServiceImpl extends ServiceImpl<RoomInfoMapper, RoomInfo> implements RoomInfoService{

    @Override
    public int updateBatch(List<RoomInfo> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<RoomInfo> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(RoomInfo record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(RoomInfo record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

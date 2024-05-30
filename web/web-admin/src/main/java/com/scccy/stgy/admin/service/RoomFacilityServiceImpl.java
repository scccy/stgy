package com.scccy.stgy.admin.service;

import com.scccy.stgy.admin.service.impl.RoomFacilityService;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scccy.stgy.model.domain.RoomFacility;
import com.scccy.stgy.model.mapper.RoomFacilityMapper;

@Service
public class RoomFacilityServiceImpl extends ServiceImpl<RoomFacilityMapper, RoomFacility> implements RoomFacilityService {

    @Override
    public int updateBatch(List<RoomFacility> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<RoomFacility> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(RoomFacility record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(RoomFacility record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

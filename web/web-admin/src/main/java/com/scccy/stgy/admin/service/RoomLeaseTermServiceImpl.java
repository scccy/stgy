package com.scccy.stgy.admin.service;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.scccy.stgy.model.RoomLeaseTerm;
import com.scccy.stgy.mapper.RoomLeaseTermMapper;
import com.scccy.stgy.admin.service.impl.RoomLeaseTermService;
@Service
public class RoomLeaseTermServiceImpl extends ServiceImpl<RoomLeaseTermMapper, RoomLeaseTerm> implements RoomLeaseTermService{

    @Override
    public int updateBatch(List<RoomLeaseTerm> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<RoomLeaseTerm> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(RoomLeaseTerm record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(RoomLeaseTerm record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

package com.scccy.stgy.admin.service;

import com.scccy.stgy.admin.service.impl.RoomLeaseTermService;
import com.scccy.stgy.model.mapper.RoomLeaseTermMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scccy.stgy.model.domain.RoomLeaseTerm;

@Service
public class RoomLeaseTermServiceImpl extends ServiceImpl<RoomLeaseTermMapper, RoomLeaseTerm> implements RoomLeaseTermService {

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

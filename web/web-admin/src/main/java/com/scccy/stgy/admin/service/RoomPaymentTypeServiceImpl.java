package com.scccy.stgy.admin.service;

import com.scccy.stgy.admin.service.impl.RoomPaymentTypeService;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scccy.stgy.model.domain.RoomPaymentType;
import com.scccy.stgy.model.mapper.RoomPaymentTypeMapper;

@Service
public class RoomPaymentTypeServiceImpl extends ServiceImpl<RoomPaymentTypeMapper, RoomPaymentType> implements RoomPaymentTypeService {

    @Override
    public int updateBatch(List<RoomPaymentType> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<RoomPaymentType> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(RoomPaymentType record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(RoomPaymentType record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

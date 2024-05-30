package com.scccy.stgy.web.admin.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.scccy.stgy.model.domain.PaymentType;
import com.scccy.stgy.model.mapper.PaymentTypeMapper;
import com.scccy.stgy.web.admin.service.PaymentTypeService;
@Service
public class PaymentTypeServiceImpl extends ServiceImpl<PaymentTypeMapper, PaymentType> implements PaymentTypeService{

    @Override
    public int updateBatch(List<PaymentType> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<PaymentType> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(PaymentType record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(PaymentType record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

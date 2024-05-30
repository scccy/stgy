package com.scccy.stgy.web.admin.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scccy.stgy.model.mapper.LeaseAgreementMapper;
import java.util.List;
import com.scccy.stgy.model.domain.LeaseAgreement;
import com.scccy.stgy.web.admin.service.LeaseAgreementService;
@Service
public class LeaseAgreementServiceImpl extends ServiceImpl<LeaseAgreementMapper, LeaseAgreement> implements LeaseAgreementService{

    @Override
    public int updateBatch(List<LeaseAgreement> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<LeaseAgreement> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(LeaseAgreement record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(LeaseAgreement record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

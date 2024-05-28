package com.scccy.stgy.admin.service;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.scccy.stgy.mapper.LeaseTermMapper;
import com.scccy.stgy.model.LeaseTerm;
import com.scccy.stgy.admin.service.impl.LeaseTermService;
@Service
public class LeaseTermServiceImpl extends ServiceImpl<LeaseTermMapper, LeaseTerm> implements LeaseTermService{

    @Override
    public int updateBatch(List<LeaseTerm> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<LeaseTerm> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(LeaseTerm record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(LeaseTerm record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

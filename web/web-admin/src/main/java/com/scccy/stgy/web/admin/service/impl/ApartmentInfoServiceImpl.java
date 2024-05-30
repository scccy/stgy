package com.scccy.stgy.web.admin.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scccy.stgy.model.domain.ApartmentInfo;
import java.util.List;
import com.scccy.stgy.model.mapper.ApartmentInfoMapper;
import com.scccy.stgy.web.admin.service.ApartmentInfoService;
@Service
public class ApartmentInfoServiceImpl extends ServiceImpl<ApartmentInfoMapper, ApartmentInfo> implements ApartmentInfoService{

    @Override
    public int updateBatch(List<ApartmentInfo> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<ApartmentInfo> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(ApartmentInfo record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(ApartmentInfo record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

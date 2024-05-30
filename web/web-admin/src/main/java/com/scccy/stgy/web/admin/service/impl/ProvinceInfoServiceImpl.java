package com.scccy.stgy.web.admin.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.scccy.stgy.model.mapper.ProvinceInfoMapper;
import com.scccy.stgy.model.domain.ProvinceInfo;
import com.scccy.stgy.web.admin.service.ProvinceInfoService;
@Service
public class ProvinceInfoServiceImpl extends ServiceImpl<ProvinceInfoMapper, ProvinceInfo> implements ProvinceInfoService{

    @Override
    public int updateBatch(List<ProvinceInfo> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<ProvinceInfo> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(ProvinceInfo record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(ProvinceInfo record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

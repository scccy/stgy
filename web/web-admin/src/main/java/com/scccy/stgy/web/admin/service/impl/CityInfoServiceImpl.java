package com.scccy.stgy.web.admin.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scccy.stgy.model.domain.CityInfo;
import java.util.List;
import com.scccy.stgy.model.mapper.CityInfoMapper;
import com.scccy.stgy.web.admin.service.CityInfoService;
@Service
public class CityInfoServiceImpl extends ServiceImpl<CityInfoMapper, CityInfo> implements CityInfoService{

    @Override
    public int updateBatch(List<CityInfo> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<CityInfo> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(CityInfo record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(CityInfo record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

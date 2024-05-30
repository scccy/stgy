package com.scccy.stgy.web.admin.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.scccy.stgy.model.mapper.DistrictInfoMapper;
import com.scccy.stgy.model.domain.DistrictInfo;
import com.scccy.stgy.web.admin.service.DistrictInfoService;
@Service
public class DistrictInfoServiceImpl extends ServiceImpl<DistrictInfoMapper, DistrictInfo> implements DistrictInfoService{

    @Override
    public int updateBatch(List<DistrictInfo> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<DistrictInfo> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(DistrictInfo record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(DistrictInfo record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

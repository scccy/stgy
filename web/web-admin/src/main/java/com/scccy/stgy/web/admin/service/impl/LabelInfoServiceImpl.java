package com.scccy.stgy.web.admin.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scccy.stgy.model.domain.LabelInfo;
import java.util.List;
import com.scccy.stgy.model.mapper.LabelInfoMapper;
import com.scccy.stgy.web.admin.service.LabelInfoService;
@Service
public class LabelInfoServiceImpl extends ServiceImpl<LabelInfoMapper, LabelInfo> implements LabelInfoService{

    @Override
    public int updateBatch(List<LabelInfo> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<LabelInfo> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(LabelInfo record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(LabelInfo record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

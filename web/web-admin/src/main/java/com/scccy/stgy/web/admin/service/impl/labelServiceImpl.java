package com.scccy.stgy.web.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.scccy.stgy.model.domain.BaseModel;
import com.scccy.stgy.model.domain.LabelInfo;
import com.scccy.stgy.web.admin.service.LabelInfoService;
import com.scccy.stgy.web.admin.service.LabelService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class labelServiceImpl implements LabelService {
    @Resource
    LabelInfoService labelInfoService;
    @Override
    public boolean saveOrUpdate(LabelInfo labelInfo) {
        return  labelInfoService.saveOrUpdate(labelInfo);

    }

    @Override
    public List<LabelInfo> list(Integer type) {
        return labelInfoService.list(new LambdaQueryWrapper<LabelInfo>().eq(LabelInfo::getType,type));
    }

    @Override
    public boolean deleteById(Long id) {
        return labelInfoService.removeById(id);
    }
}
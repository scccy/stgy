package com.scccy.stgy.web.admin.service.impl;

import com.scccy.stgy.model.domain.LabelInfo;
import com.scccy.stgy.web.admin.service.LabelInfoService;
import com.scccy.stgy.web.admin.service.LabelService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class labelServiceImpl implements LabelService {
    @Resource
    LabelInfoService labelInfoService;
    @Override
    public boolean saveOrUpdate(LabelInfo labelInfo) {
        boolean flag = labelInfoService.saveOrUpdate(labelInfo);
        return flag;
    }
}
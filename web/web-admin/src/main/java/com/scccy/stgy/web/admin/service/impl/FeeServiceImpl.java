package com.scccy.stgy.web.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.scccy.stgy.model.domain.FeeKey;
import com.scccy.stgy.model.domain.FeeValue;
import com.scccy.stgy.model.vo.FeeListVo;
import com.scccy.stgy.web.admin.service.FeeKeyService;
import com.scccy.stgy.web.admin.service.FeeService;
import com.scccy.stgy.web.admin.service.FeeValueService;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeeServiceImpl implements FeeService {
    @Resource
    FeeValueService feeValueService;
    @Resource
    FeeKeyService feeKeyService;
    @Override
    public boolean valueSaveOrUpdate(FeeValue feeValue) {
        return feeValueService.saveOrUpdate(feeValue);
    }

    @Override
    public boolean keySaveOrUpdate(FeeKey feeKey) {
        return feeKeyService.saveOrUpdate(feeKey);
    }

    @Override
    public FeeListVo list(long id) {
        FeeKey feeKey = feeKeyService.getById(id);
        FeeListVo feeListVo = new FeeListVo();
        BeanUtils.copyProperties(feeKey,feeListVo);
        List<FeeValue> feeValueList = feeValueService.list(new LambdaQueryWrapper<FeeValue>().eq(FeeValue::getFeeKeyId, feeKey.getId()));
        feeListVo.setFeeValueList(feeValueList);
        return feeListVo;
    }

    @Override
    public boolean valueDeleteById(long id) {
//        return feeValueService.remove(new LambdaQueryWrapper<FeeValue>().eq(BaseModel::getId,id));
        return feeValueService.removeById(id);
    }

    @Override
    public boolean keyDeleteById(long id) {
        return feeKeyService.removeById(id);
    }
}

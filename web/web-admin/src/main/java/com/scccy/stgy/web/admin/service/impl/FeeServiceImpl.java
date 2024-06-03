package com.scccy.stgy.web.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    public List<FeeListVo> list() {
        List<FeeKey> feeKeyList = feeKeyService.list();
        List<FeeListVo> collect = feeKeyList.stream().map(feeKey -> {
            FeeListVo feeListVo = new FeeListVo();
            BeanUtils.copyProperties(feeKey, feeListVo);
            List<FeeValue> feeValueList = feeValueService.list(new LambdaQueryWrapper<FeeValue>().eq(FeeValue::getFeeKeyId, feeKey.getId()));
            feeListVo.setFeeValueList(feeValueList); // 将查询得到的 feeValueList 设置到 feeListVo 中
            return feeListVo;
        }).collect(Collectors.toList());
        return collect;
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

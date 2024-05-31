package com.scccy.stgy.web.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.scccy.stgy.model.domain.AttrKey;
import com.scccy.stgy.model.domain.AttrValue;
import com.scccy.stgy.model.domain.BaseModel;
import com.scccy.stgy.model.vo.AttrListVo;
import com.scccy.stgy.web.admin.service.AttrKeyService;
import com.scccy.stgy.web.admin.service.AttrService;
import com.scccy.stgy.web.admin.service.AttrValueService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttrServiceImpl implements AttrService {
    @Resource
    AttrValueService attrValueService;
    @Resource
    AttrKeyService attrKeyService;

    @Override
    public boolean valueSaveOrUpdate(AttrValue attrValue) {
        return attrValueService.saveOrUpdate(attrValue);
    }

    @Override
    public boolean keySaveOrUpdate(AttrKey attrKey) {
        return attrKeyService.saveOrUpdate(attrKey);
    }

    @Override
    public List<AttrListVo> attrList() {
        return attrKeyService.attrList();
    }

    @Override
    public boolean valueDeleteById(long id) {
        return attrValueService.remove(new LambdaQueryWrapper<AttrValue>().eq(BaseModel::getId,id));
    }

    @Override
    public boolean keyDeleteById(long id) {
        return attrKeyService.remove(new LambdaQueryWrapper<AttrKey>().eq(BaseModel::getId,id));
    }
}

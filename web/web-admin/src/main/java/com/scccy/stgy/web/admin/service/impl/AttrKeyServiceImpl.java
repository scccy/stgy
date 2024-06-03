package com.scccy.stgy.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scccy.stgy.model.domain.AttrKey;
import com.scccy.stgy.model.mapper.AttrKeyMapper;
import com.scccy.stgy.model.vo.AttrListVo;

import com.scccy.stgy.web.admin.service.AttrKeyService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AttrKeyServiceImpl extends ServiceImpl<AttrKeyMapper, AttrKey> implements AttrKeyService{
    @Resource
    AttrKeyMapper attrKeyMapper;

    @Override
    public int updateBatch(List<AttrKey> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<AttrKey> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(AttrKey record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(AttrKey record) {
        return baseMapper.insertOrUpdateSelective(record);
    }

    @Override
    public List<AttrListVo> attrList() {
        return attrKeyMapper.attrList();
    }




}

package com.scccy.stgy.web.admin.service.impl;

import com.scccy.stgy.model.vo.AttrValueVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.scccy.stgy.model.mapper.RoomAttrValueMapper;
import com.scccy.stgy.model.domain.RoomAttrValue;
import com.scccy.stgy.web.admin.service.RoomAttrValueService;
@Service
public class RoomAttrValueServiceImpl extends ServiceImpl<RoomAttrValueMapper, RoomAttrValue> implements RoomAttrValueService{
    @Autowired
    RoomAttrValueMapper roomAttrValueMapper;

    @Override
    public int updateBatch(List<RoomAttrValue> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<RoomAttrValue> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(RoomAttrValue record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(RoomAttrValue record) {
        return baseMapper.insertOrUpdateSelective(record);
    }

    @Override
    public List<AttrValueVo> getAttrValueVos(Integer id) {
       return roomAttrValueMapper.getAttrValueVos(id);
    }
}

package com.scccy.stgy.web.admin.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.scccy.stgy.model.dto.RoomGetDetailByIdVo;
import com.scccy.stgy.model.vo.RoomPageItemVo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scccy.stgy.model.mapper.RoomInfoMapper;
import com.scccy.stgy.model.domain.RoomInfo;
import com.scccy.stgy.web.admin.service.RoomInfoService;
@Service
public class RoomInfoServiceImpl extends ServiceImpl<RoomInfoMapper, RoomInfo> implements RoomInfoService{
    @Resource
    RoomInfoMapper roomInfoMapper;

    @Override
    public int updateBatch(List<RoomInfo> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<RoomInfo> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(RoomInfo record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(RoomInfo record) {
        return baseMapper.insertOrUpdateSelective(record);
    }

    @Override
    public Page<RoomPageItemVo> getRoomPageItem(Page<RoomPageItemVo> roomPageItemDtoPage, Long provinceId, Long cityId, Long districtId, Long apartmentId) {
        return roomInfoMapper.getRoomPageItem( roomPageItemDtoPage, provinceId,  cityId,  districtId,  apartmentId);
    }

    @Override
    public RoomGetDetailByIdVo getDetailById(Long id) {
        return roomInfoMapper.getDetailById(id);
    }
}

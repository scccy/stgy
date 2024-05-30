package com.scccy.stgy.admin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.scccy.stgy.admin.service.impl.RoomInfoService;
import com.scccy.stgy.model.dto.RoomGetDetailByIdDto;
import com.scccy.stgy.model.dto.RoomPageItemDto;
import com.scccy.stgy.model.mapper.RoomInfoMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scccy.stgy.model.domain.RoomInfo;

@Service
public class RoomInfoServiceImpl extends ServiceImpl<RoomInfoMapper, RoomInfo> implements RoomInfoService {
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
    public IPage<RoomPageItemDto> getRoomPageItem(IPage<RoomPageItemDto> roomPageItemDtoPage, Long provinceId, Long cityId, Long districtId, Long apartmentId) {
        return roomInfoMapper.getRoomPageItem( roomPageItemDtoPage,  provinceId,  cityId,  districtId,  apartmentId);
    }

    @Override
    public RoomGetDetailByIdDto getDetailById(Integer id) {
        roomInfoMapper.getDetailById(id);
        return null;
    }

}

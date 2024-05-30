package com.scccy.stgy.admin.service.impl;

import java.util.List;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.scccy.stgy.model.dto.RoomGetDetailByIdDto;
import com.scccy.stgy.model.dto.RoomPageItemDto;
import com.scccy.stgy.model.domain.RoomInfo;
import com.baomidou.mybatisplus.extension.service.IService;

public interface RoomInfoService extends IService<RoomInfo>{


    int updateBatch(List<RoomInfo> list);

    int batchInsert(List<RoomInfo> list);

    int insertOrUpdate(RoomInfo record);

    int insertOrUpdateSelective(RoomInfo record);

    IPage<RoomPageItemDto> getRoomPageItem(IPage<RoomPageItemDto> roomPageItemDtoPage, Long provinceId, Long cityId, Long districtId, Long apartmentId);

    RoomGetDetailByIdDto getDetailById(Integer id);
}

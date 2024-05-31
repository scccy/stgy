package com.scccy.stgy.web.admin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.scccy.stgy.model.domain.RoomInfo;
import com.scccy.stgy.model.dto.RoomGetDetailByIdDto;
import com.scccy.stgy.model.vo.RoomPageItemVo;
import com.scccy.stgy.model.dto.RoomSaveOrUpdateDto;


import java.util.List;


public interface RoomService {
    boolean saveOrUpdate(RoomSaveOrUpdateDto roomSaveOrUpdateDto);


    boolean updateReleaseStatusById(RoomInfo info);


    IPage<RoomPageItemVo> pageItem(IPage<RoomPageItemVo> roomPageItemDtoPage, Long provinceId, Long cityId, Long districtId, Long apartmentId);

    List<RoomInfo> listBasicByApartmentId(Integer id);

    RoomGetDetailByIdDto getDetailById(Integer id);

    boolean removeById(Integer id);
}
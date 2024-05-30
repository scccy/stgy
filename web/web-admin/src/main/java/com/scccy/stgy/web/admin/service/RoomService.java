package com.scccy.stgy.web.admin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.scccy.stgy.model.domain.RoomInfo;
import com.scccy.stgy.model.dto.RoomGetDetailByIdDto;
import com.scccy.stgy.model.dto.RoomPageItemDto;
import com.scccy.stgy.model.vo.SaveOrUpdateVo;


import java.util.List;


public interface RoomService {
    boolean saveOrUpdate(SaveOrUpdateVo saveOrUpdateVo);


    boolean updateReleaseStatusById(RoomInfo info);


    IPage<RoomPageItemDto> pageItem(IPage<RoomPageItemDto> roomPageItemDtoPage, Long provinceId, Long cityId, Long districtId, Long apartmentId);

    List<RoomInfo> listBasicByApartmentId(Integer id);

    RoomGetDetailByIdDto getDetailById(Integer id);

    boolean removeById(Integer id);
}
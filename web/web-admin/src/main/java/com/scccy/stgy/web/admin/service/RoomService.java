package com.scccy.stgy.web.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.scccy.stgy.model.domain.RoomInfo;
import com.scccy.stgy.model.dto.RoomGetDetailByIdVo;
import com.scccy.stgy.model.dto.RoomSaveOrUpdateDto;
import com.scccy.stgy.model.vo.RoomPageItemVo;

import java.util.List;


public interface RoomService {
    boolean saveOrUpdate(RoomSaveOrUpdateDto roomSaveOrUpdateDto);


    boolean updateReleaseStatusById(RoomInfo info);


    Page<RoomPageItemVo> pageItem(Page<RoomPageItemVo> roomPageItemDtoPage, Long provinceId, Long cityId, Long districtId, Long apartmentId);

    List<RoomInfo> listBasicByApartmentId(Integer id);

    RoomGetDetailByIdVo getDetailById(Long id);

    boolean removeById(Integer id);
}
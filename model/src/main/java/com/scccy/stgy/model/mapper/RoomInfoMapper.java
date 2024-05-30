package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.scccy.stgy.model.dto.RoomGetDetailByIdDto;
import com.scccy.stgy.model.dto.RoomPageItemDto;
import com.scccy.stgy.model.domain.RoomInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RoomInfoMapper extends BaseMapper<RoomInfo> {
    int updateBatch(List<RoomInfo> list);

    int batchInsert(@Param("list") List<RoomInfo> list);

    int insertOrUpdate(RoomInfo record);

    int insertOrUpdateSelective(RoomInfo record);

    IPage<RoomPageItemDto> getRoomPageItem(@Param("roomPageItemDtoPage") IPage<RoomPageItemDto> roomPageItemDtoPage, @Param("provinceId") Long provinceId, @Param("cityId") Long cityId, @Param("districtId") Long districtId, @Param("apartmentId") Long apartmentId);

    RoomGetDetailByIdDto getDetailById(Integer id);
}
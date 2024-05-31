package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.scccy.stgy.model.domain.RoomInfo;

import java.util.List;

import com.scccy.stgy.model.vo.RoomPageItemVo;
import org.apache.ibatis.annotations.Param;

public interface RoomInfoMapper extends BaseMapper<RoomInfo> {
    int updateBatch(List<RoomInfo> list);

    int batchInsert(@Param("list") List<RoomInfo> list);

    int insertOrUpdate(RoomInfo record);

    int insertOrUpdateSelective(RoomInfo record);

    IPage<RoomPageItemVo> getRoomPageItem(IPage<RoomPageItemVo> roomPageItemDtoPage, Long provinceId, Long cityId, Long districtId, Long apartmentId);
}
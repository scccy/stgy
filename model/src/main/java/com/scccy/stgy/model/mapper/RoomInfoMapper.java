package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.scccy.stgy.model.domain.RoomInfo;

import java.util.List;

import com.scccy.stgy.model.dto.RoomGetDetailByIdVo;
import com.scccy.stgy.model.vo.RoomPageItemVo;
import org.apache.ibatis.annotations.Param;

public interface RoomInfoMapper extends BaseMapper<RoomInfo> {
    int updateBatch(List<RoomInfo> list);

    int batchInsert(@Param("list") List<RoomInfo> list);

    int insertOrUpdate(RoomInfo record);

    int insertOrUpdateSelective(RoomInfo record);

    Page<RoomPageItemVo> getRoomPageItem(Page<RoomPageItemVo> roomPageItemDtoPage, @Param("provinceId") Long provinceId, @Param("cityId") Long cityId, @Param("districtId") Long districtId, @Param("apartmentId") Long apartmentId);

    RoomGetDetailByIdVo getDetailById(@Param("id") Long id);
}
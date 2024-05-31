package com.scccy.stgy.web.admin.service;

import java.util.List;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.scccy.stgy.model.domain.RoomInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.scccy.stgy.model.vo.RoomPageItemVo;

public interface RoomInfoService extends IService<RoomInfo>{


    int updateBatch(List<RoomInfo> list);

    int batchInsert(List<RoomInfo> list);

    int insertOrUpdate(RoomInfo record);

    int insertOrUpdateSelective(RoomInfo record);

    IPage<RoomPageItemVo> getRoomPageItem(IPage<RoomPageItemVo> roomPageItemDtoPage, Long provinceId, Long cityId, Long districtId, Long apartmentId);
}

package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.RoomPaymentType;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RoomPaymentTypeMapper extends BaseMapper<RoomPaymentType> {
    int updateBatch(List<RoomPaymentType> list);

    int batchInsert(@Param("list") List<RoomPaymentType> list);

    int insertOrUpdate(RoomPaymentType record);

    int insertOrUpdateSelective(RoomPaymentType record);
}
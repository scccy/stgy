package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.ViewAppointment;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ViewAppointmentMapper extends BaseMapper<ViewAppointment> {
    int updateBatch(List<ViewAppointment> list);

    int batchInsert(@Param("list") List<ViewAppointment> list);

    int insertOrUpdate(ViewAppointment record);

    int insertOrUpdateSelective(ViewAppointment record);
}
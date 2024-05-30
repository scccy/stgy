package com.scccy.stgy.web.admin.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.scccy.stgy.model.domain.ViewAppointment;
import com.scccy.stgy.model.mapper.ViewAppointmentMapper;
import com.scccy.stgy.web.admin.service.ViewAppointmentService;
@Service
public class ViewAppointmentServiceImpl extends ServiceImpl<ViewAppointmentMapper, ViewAppointment> implements ViewAppointmentService{

    @Override
    public int updateBatch(List<ViewAppointment> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<ViewAppointment> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(ViewAppointment record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(ViewAppointment record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

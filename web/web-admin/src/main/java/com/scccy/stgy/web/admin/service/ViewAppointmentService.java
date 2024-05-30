package com.scccy.stgy.web.admin.service;

import java.util.List;
import com.scccy.stgy.model.domain.ViewAppointment;
import com.baomidou.mybatisplus.extension.service.IService;
public interface ViewAppointmentService extends IService<ViewAppointment>{


    int updateBatch(List<ViewAppointment> list);

    int batchInsert(List<ViewAppointment> list);

    int insertOrUpdate(ViewAppointment record);

    int insertOrUpdateSelective(ViewAppointment record);

}

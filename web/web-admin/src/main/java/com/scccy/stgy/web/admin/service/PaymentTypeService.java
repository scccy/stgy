package com.scccy.stgy.web.admin.service;

import java.util.List;
import com.scccy.stgy.model.domain.PaymentType;
import com.baomidou.mybatisplus.extension.service.IService;
public interface PaymentTypeService extends IService<PaymentType>{


    int updateBatch(List<PaymentType> list);

    int batchInsert(List<PaymentType> list);

    int insertOrUpdate(PaymentType record);

    int insertOrUpdateSelective(PaymentType record);

}

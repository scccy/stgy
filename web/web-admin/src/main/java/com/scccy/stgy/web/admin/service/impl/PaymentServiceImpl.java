package com.scccy.stgy.web.admin.service.impl;


import com.scccy.stgy.model.domain.PaymentType;
import com.scccy.stgy.web.admin.service.PaymentService;
import com.scccy.stgy.web.admin.service.PaymentTypeService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    PaymentTypeService paymentTypeService;

    @Override
    public boolean saveOrUpdate(PaymentType paymentType) {
        return paymentTypeService.saveOrUpdate(paymentType);
    }

    @Override
    public List<PaymentType> list() {
        return paymentTypeService.list();
    }

    @Override
    public boolean deleteById(long id) {
        return paymentTypeService.removeById(id);
    }
}

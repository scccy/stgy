package com.scccy.stgy.web.admin.service;

import com.scccy.stgy.model.domain.PaymentType;

import java.util.List;

public interface PaymentService {
    boolean saveOrUpdate(PaymentType paymentType);

    List<PaymentType> list();

    boolean deleteById(long id);
}

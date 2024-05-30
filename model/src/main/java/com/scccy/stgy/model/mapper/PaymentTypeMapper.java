package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.PaymentType;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PaymentTypeMapper extends BaseMapper<PaymentType> {
    int updateBatch(List<PaymentType> list);

    int batchInsert(@Param("list") List<PaymentType> list);

    int insertOrUpdate(PaymentType record);

    int insertOrUpdateSelective(PaymentType record);

    int updateBatchSelective(List<PaymentType> list);
}
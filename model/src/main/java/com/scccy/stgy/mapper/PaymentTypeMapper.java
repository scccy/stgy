package com.scccy.stgy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.PaymentType;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentTypeMapper extends BaseMapper<PaymentType> {
    int updateBatch(List<PaymentType> list);

    int batchInsert(@Param("list") List<PaymentType> list);

    int insertOrUpdate(PaymentType record);

    int insertOrUpdateSelective(PaymentType record);

    int updateBatchSelective(List<PaymentType> list);
}
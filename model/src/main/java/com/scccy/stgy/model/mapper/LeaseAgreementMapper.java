package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.LeaseAgreement;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface LeaseAgreementMapper extends BaseMapper<LeaseAgreement> {
    int updateBatch(List<LeaseAgreement> list);

    int batchInsert(@Param("list") List<LeaseAgreement> list);

    int insertOrUpdate(LeaseAgreement record);

    int insertOrUpdateSelective(LeaseAgreement record);
}
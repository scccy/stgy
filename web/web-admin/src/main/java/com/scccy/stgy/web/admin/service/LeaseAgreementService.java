package com.scccy.stgy.web.admin.service;

import java.util.List;
import com.scccy.stgy.model.domain.LeaseAgreement;
import com.baomidou.mybatisplus.extension.service.IService;
public interface LeaseAgreementService extends IService<LeaseAgreement>{


    int updateBatch(List<LeaseAgreement> list);

    int batchInsert(List<LeaseAgreement> list);

    int insertOrUpdate(LeaseAgreement record);

    int insertOrUpdateSelective(LeaseAgreement record);

}

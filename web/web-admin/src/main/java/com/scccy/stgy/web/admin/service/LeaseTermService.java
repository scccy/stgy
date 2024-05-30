package com.scccy.stgy.web.admin.service;

import com.scccy.stgy.model.domain.LeaseTerm;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface LeaseTermService extends IService<LeaseTerm>{


    int updateBatch(List<LeaseTerm> list);

    int batchInsert(List<LeaseTerm> list);

    int insertOrUpdate(LeaseTerm record);

    int insertOrUpdateSelective(LeaseTerm record);

}

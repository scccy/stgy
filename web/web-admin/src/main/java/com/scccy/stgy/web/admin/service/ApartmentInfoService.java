package com.scccy.stgy.web.admin.service;

import com.scccy.stgy.model.domain.ApartmentInfo;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.scccy.stgy.model.dto.ApartmentPageItemDto;
import com.scccy.stgy.model.vo.ApartmentPageItemVo;

public interface ApartmentInfoService extends IService<ApartmentInfo>{


    int updateBatch(List<ApartmentInfo> list);

    int batchInsert(List<ApartmentInfo> list);

    int insertOrUpdate(ApartmentInfo record);

    int insertOrUpdateSelective(ApartmentInfo record);

    List<ApartmentPageItemVo> pageItem(ApartmentPageItemDto apartmentPageItemDto);
}

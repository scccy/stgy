package com.scccy.stgy.web.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.scccy.stgy.model.dto.ApartmentPageItemDto;
import com.scccy.stgy.model.dto.ApartmentSaveOrUpdateDto;
import com.scccy.stgy.model.vo.ApartmentPageItemVo;

public interface ApartmentService {
    boolean updateReleaseStatusById(Long id, Integer status);

    boolean saveOrUpdate(ApartmentSaveOrUpdateDto apartmentSaveOrUpdateDto);

    Page<ApartmentPageItemVo> pageItem(ApartmentPageItemDto apartmentPageItemDto);
}

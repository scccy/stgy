package com.scccy.stgy.web.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.scccy.stgy.model.domain.ApartmentInfo;
import com.scccy.stgy.model.domain.BaseModel;
import com.scccy.stgy.model.dto.ApartmentPageItemDto;
import com.scccy.stgy.model.dto.ApartmentSaveOrUpdateDto;
import com.scccy.stgy.model.vo.ApartmentPageItemVo;
import com.scccy.stgy.web.admin.service.*;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartmentServiceImpl implements ApartmentService {

    @Resource
    ApartmentInfoService apartmentInfoService;
    @Resource
    ApartmentFacilityService apartmentFacilityService;
    @Resource
    ApartmentLabelService apartmentLabelService;
    @Resource
    ApartmentFeeValueService apartmentFeeValueService;
    @Resource
    GraphInfoService graphInfoService;

    @Override
    public boolean updateReleaseStatusById(Long id, Integer status) {
        return apartmentInfoService.update(new LambdaQueryWrapper<ApartmentInfo>().eq(BaseModel::getId, id)
                .eq(ApartmentInfo::getIsRelease, status)
        );
    }

    @Override
    public boolean saveOrUpdate(ApartmentSaveOrUpdateDto apartmentSaveOrUpdateDto) {
        try {
            apartmentInfoService.saveOrUpdate(apartmentSaveOrUpdateDto);
            apartmentFacilityService.saveOrUpdateBatch(apartmentSaveOrUpdateDto.getFacilityInfoIds());
            apartmentLabelService.saveOrUpdateBatch(apartmentSaveOrUpdateDto.getLabelIds());
            apartmentFeeValueService.saveOrUpdateBatch(apartmentSaveOrUpdateDto.getFeeValueIds());
            graphInfoService.saveOrUpdateBatch(apartmentSaveOrUpdateDto.getGraphInfos());
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public Page<ApartmentPageItemVo> pageItem(ApartmentPageItemDto apartmentPageItemDto) {
        Page<ApartmentPageItemVo> apartmentPageItemVoIPage = new Page<>(apartmentPageItemDto.getCurrent(), apartmentPageItemDto.getSize());
        List<ApartmentPageItemVo> apartmentPageItemVoList = apartmentInfoService.pageItem(apartmentPageItemDto);
        apartmentPageItemVoIPage.setRecords(apartmentPageItemVoList);
        return apartmentPageItemVoIPage;
//        apartmentInfoService.page(apartmentPageItemVoIPage,)
//        new LambdaQueryWrapper<>()

    }
}

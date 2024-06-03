package com.scccy.stgy.web.admin.controller;

import com.scccy.stgy.common.pojo.ResultData;
import com.scccy.stgy.model.domain.CityInfo;
import com.scccy.stgy.model.domain.DistrictInfo;
import com.scccy.stgy.model.domain.ProvinceInfo;
import com.scccy.stgy.web.admin.service.RegionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "地区信息管理")
@RestController
@RequestMapping("/admin/region")
public class RegionController {

    @Resource
    RegionService regionService;

    @GetMapping("/province/list")
    @Operation(summary = "查询省份信息列表")
    public ResultData list(){
        List<ProvinceInfo> data= regionService.list();
        return ResultData.ok().setData(data);
    }
    @GetMapping("/city/listByProvinceId")
    @Operation(summary = "根据省份id查询城市信息列表")
    public ResultData listByProvinceId(Long id){
        List<CityInfo> data= regionService.listByProvinceId(id);
        return ResultData.ok().setData(data);
    }

    @GetMapping("/district/listByCityId")
    @Operation(summary = "根据城市id查询区县信息")
    public ResultData provinceList(Long id){
        List<DistrictInfo> data= regionService.provinceList(id);
        return ResultData.ok().setData(data);
    }

}
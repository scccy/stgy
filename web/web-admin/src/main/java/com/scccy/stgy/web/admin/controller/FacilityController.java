package com.scccy.stgy.web.admin.controller;

import com.scccy.stgy.common.pojo.ResultData;
import com.scccy.stgy.model.domain.FacilityInfo;
import com.scccy.stgy.web.admin.service.FacilityService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "配套管理")
@RestController
@RequestMapping("/admin/facility")
public class FacilityController {
    @Resource
    FacilityService facilityService;

    @Operation(summary = "新增或修改配套信息")
    @PostMapping("/saveOrUpdate")
    public ResultData saveOrUpdate(@RequestBody FacilityInfo facilityInfo) {
        boolean b = facilityService.saveOrUpdate(facilityInfo);
        return b ? ResultData.ok() : ResultData.fail();
    }

    @Operation(summary = "查询配套信息列表")
    @GetMapping("/list")
    public ResultData list( ) {
        List<FacilityInfo> facilityInfos = facilityService.List();
        return ResultData.ok().setData(facilityInfos);
    }

    @Operation(summary = "根据id删除配套信息")
    @DeleteMapping("/deleteById")
    public ResultData deleteById(long id) {
        boolean b = facilityService.deleteById(id);
        return b ? ResultData.ok() : ResultData.fail();
    }

}

package com.scccy.stgy.web.admin.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.scccy.stgy.common.pojo.ResultData;
import com.scccy.stgy.model.dto.ApartmentPageItemDto;
import com.scccy.stgy.model.dto.ApartmentSaveOrUpdateDto;
import com.scccy.stgy.model.vo.ApartmentPageItemVo;
import com.scccy.stgy.web.admin.service.ApartmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "公寓信息管理")
@RestController
@RequestMapping("/admin/apartment")
public class    ApartmentController {
    @Resource
    ApartmentService apartmentService;
    @Operation(summary = "根据id修改公寓发布状态")
    @PostMapping("/updateReleaseStatusById")
    public ResultData updateReleaseStatusById(@RequestParam Long id, @RequestParam Integer status){
        boolean b = apartmentService.updateReleaseStatusById(id, status);
        return b ? ResultData.ok() : ResultData.fail();
    }
    @Operation(summary = "保存或更新公寓信息")
    @PostMapping("/saveOrUpdate")
    public ResultData saveOrUpdate(@RequestBody ApartmentSaveOrUpdateDto apartmentSaveOrUpdateDto){
        boolean b = apartmentService.saveOrUpdate(apartmentSaveOrUpdateDto);
        return b ? ResultData.ok() : ResultData.fail();
    }
    @Operation(summary = "根据条件分页查询公寓列表")
    @PostMapping("pageItem")
    public ResultData pageItem(@RequestBody ApartmentPageItemDto apartmentPageItemDto){
        Page<ApartmentPageItemVo> apartmentPageItemVo = apartmentService.pageItem(apartmentPageItemDto);
        return ResultData.ok().setData(apartmentPageItemVo);

    }

}
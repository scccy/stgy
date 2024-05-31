package com.scccy.stgy.web.admin.controller;

import com.scccy.stgy.common.pojo.ResultData;
import com.scccy.stgy.model.domain.LabelInfo;
import com.scccy.stgy.web.admin.service.LabelService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/label")
@Tag(name = "标签管理")
public class LabelController {
    @Resource
    LabelService labelService;

    @Operation(summary = "新增或修改标签信息")
    @PostMapping("/saveOrUpdate")
    public ResultData saveOrUpdate(@RequestBody LabelInfo labelInfo){
        boolean b = labelService.saveOrUpdate(labelInfo);
        return b?ResultData.ok():ResultData.fail();
    }

    @Operation(summary = "查询标签列表")
    @GetMapping("/list")
    public ResultData list(Integer type){
        List<LabelInfo> labelInfos = labelService.list(type);
        return ResultData.ok().setData(labelInfos);
    }

    @Operation(summary = "根据id删除标签信息")
    @DeleteMapping("/deleteById")
    public ResultData deleteById(Long id){
       boolean b =  labelService.deleteById(id);
       return b?ResultData.ok():ResultData.fail();
    }
}
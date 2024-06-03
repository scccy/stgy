package com.scccy.stgy.web.admin.controller;

import com.scccy.stgy.common.pojo.ResultData;
import com.scccy.stgy.model.domain.FeeKey;
import com.scccy.stgy.model.domain.FeeValue;
import com.scccy.stgy.model.vo.FeeListVo;
import com.scccy.stgy.web.admin.service.FeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "房间杂费管理")
@RestController
@RequestMapping("/admin/fee")
public class FeeController {
    @Resource
    FeeService feeService;

    @Operation(summary = "保存或更新杂费值")
    @PostMapping("value/saveOrUpdate")
    public ResultData valueSaveOrUpdate(@RequestBody FeeValue feeValue) {
        boolean b = feeService.valueSaveOrUpdate(feeValue);
        return b ? ResultData.ok() : ResultData.fail();
    }

    @Operation(summary = "保存或更新杂费名称")
    @PostMapping("/key/saveOrUpdate")
    public ResultData keySaveOrUpdate(@RequestBody FeeKey feeKey) {
        boolean b = feeService.keySaveOrUpdate(feeKey);
        return b ? ResultData.ok() : ResultData.fail();
    }
    @Operation(summary = "查询全部杂费名称和杂费值列表")
    @GetMapping("/list")
    public ResultData list() {
        List<FeeListVo> data = feeService.list();
        return  ResultData.ok().setData(data) ;
    }

    @Operation(summary = "根据id删除杂费值")
    @DeleteMapping("/value/deleteById")
    public ResultData valueDeleteById(long id) {
        boolean b = feeService.valueDeleteById(id);
        return b ? ResultData.ok() : ResultData.fail();
    }

    @Operation(summary = "根据id删除杂费名称")
    @DeleteMapping("/key/deleteById")
    public ResultData keyDeleteById(@RequestParam("feeKeyId")   long id) {
        boolean b = feeService.keyDeleteById(id);
        return b ? ResultData.ok() : ResultData.fail();
    }




}

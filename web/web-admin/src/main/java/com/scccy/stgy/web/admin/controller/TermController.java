package com.scccy.stgy.web.admin.controller;

import com.scccy.stgy.common.pojo.ResultData;
import com.scccy.stgy.model.domain.LeaseTerm;
import com.scccy.stgy.web.admin.service.LeaseTermService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/term")
@Tag(name = "租期管理模块")
public class TermController {

    @Resource
    LeaseTermService leaseTermService;
    @Operation(summary = "保存或更新租期信息")
    @PostMapping("/saveOrUpdate")
    public ResultData saveOrUpdate(@RequestBody LeaseTerm leaseTerm) {
        boolean b = leaseTermService.saveOrUpdate(leaseTerm);
        return b?ResultData.ok():ResultData.fail();
    }
    @Operation(summary = "查询所有租期列表")
    @GetMapping("/list")
    public ResultData list() {
        List<LeaseTerm> leaseTermList = leaseTermService.list();
        return ResultData.ok().setData(leaseTermList);
    }
    @Operation(summary = "根据ID删除租期")
    @DeleteMapping("deleteById")
    public ResultData deleteById(Long id){
        boolean b = leaseTermService.removeById(id);
        return b?ResultData.ok():ResultData.fail();
    }
}

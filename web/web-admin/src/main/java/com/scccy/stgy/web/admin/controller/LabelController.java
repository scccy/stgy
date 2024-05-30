package com.scccy.stgy.web.admin.controller;

import com.scccy.stgy.common.pojo.ResultData;
import com.scccy.stgy.model.domain.LabelInfo;
import com.scccy.stgy.model.vo.LabelSaveOrUpdateVo;
import com.scccy.stgy.web.admin.service.LabelService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/label")
@Tag(name = "标签管理")
public class LabelController {
    @Resource
    LabelService labelService;

    @Operation(summary = "新增或修改标签信息")
    @PostMapping("/saveOrUpdate")
    public ResultData saveOrUpdate(@RequestBody LabelInfo labelInfo){
        System.out.println(labelInfo);
        boolean b = labelService.saveOrUpdate(labelInfo);
        return b?ResultData.ok():ResultData.fail();
    }
}
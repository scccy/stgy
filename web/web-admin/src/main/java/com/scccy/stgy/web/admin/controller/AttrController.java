package com.scccy.stgy.web.admin.controller;

import com.scccy.stgy.common.pojo.ResultData;
import com.scccy.stgy.model.domain.AttrKey;
import com.scccy.stgy.model.domain.AttrValue;
import com.scccy.stgy.model.vo.AttrListVo;
import com.scccy.stgy.web.admin.service.AttrService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="房间属性管理")
@RestController
@RequestMapping("/admin/attr")
public  class AttrController {
    @Resource
    AttrService attrService;

    @Operation(summary = "新增或更新属性值")
    @PostMapping("/value/saveOrUpdate")
    public ResultData valueSaveOrUpdate(@RequestBody AttrValue attrValue){
      boolean b =   attrService.valueSaveOrUpdate(attrValue);
        return b ? ResultData.ok() : ResultData.fail();
    }

    @Operation(summary = "新增或更新属性名称")
    @PostMapping("/key/saveOrUpdate")
    public ResultData keySaveOrUpdate(@RequestBody AttrKey attrKey){
        boolean b =   attrService.keySaveOrUpdate(attrKey);
        return b ? ResultData.ok() : ResultData.fail();
    }


    @Operation(summary = "查询全部属性名称和属性值列表")
    @GetMapping("/list")
    public ResultData attrList(){
        List<AttrListVo> data =   attrService.attrList();
        return  ResultData.ok().setData(data) ;
    }

    @Operation(summary = "根据id删除属性值")
    @DeleteMapping("/value/deleteById")
    public ResultData valueDeleteById(long id) {
        boolean b = attrService.valueDeleteById(id);
        return b ? ResultData.ok() : ResultData.fail();
    }

    @Operation(summary = "根据id删除属性名称")
    @DeleteMapping("/key/deleteById")
    public ResultData keyDeleteById(@RequestParam("attrKeyId") long id) {
        boolean b = attrService.keyDeleteById(id);
        return b ? ResultData.ok() : ResultData.fail();
    }

}
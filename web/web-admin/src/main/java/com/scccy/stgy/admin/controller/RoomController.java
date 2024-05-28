package com.scccy.stgy.admin.controller;

import com.scccy.stgy.admin.service.impl.RoomService;
import com.scccy.stgy.model.RoomInfo;
import com.scccy.stgy.pojo.ResultData;
import com.scccy.stgy.vo.SaveOrUpdateVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/room")
@Tag(name = "公寓信息管理")
public class RoomController {

    @Resource
    RoomService roomService;

    @Operation(summary = "根据id修改房间发布状态")
    @PostMapping("updateReleaseStatusById")
    public ResultData updateReleaseStatusById(@RequestBody RoomInfo info   ){
        boolean b = roomService.updateReleaseStatusById(info);
        return b?ResultData.ok():ResultData.fail();
    }

    @Operation(summary = "保存或更新房间信息")
    @PostMapping("/saveOrUpdate")
    public ResultData saveOrUpdate(@RequestBody SaveOrUpdateVo saveOrUpdateVo){
        boolean b = roomService.saveOrUpdate(saveOrUpdateVo);
        return b?ResultData.ok():ResultData.fail();
    }


    @Operation("根据条件分页查询房间列表")
    @GetMapping("/pageItem")
    public  ResultData pageItem(){

        return null;
    }
}

package com.scccy.stgy.web.admin.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.scccy.stgy.common.pojo.ResultData;
import com.scccy.stgy.model.domain.RoomInfo;
import com.scccy.stgy.model.dto.RoomGetDetailByIdDto;
import com.scccy.stgy.model.dto.RoomPageItemDto;
import com.scccy.stgy.model.vo.SaveOrUpdateVo;

import com.scccy.stgy.web.admin.service.RoomService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/room")
@Tag(name = "公寓信息管理")
public class RoomController {

    @Autowired
    RoomService roomService;

    @Operation(summary = "根据id修改房间发布状态")
    @PostMapping("/updateReleaseStatusById")
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


    @Operation(summary = "根据条件分页查询房间列表")
    @GetMapping("/pageItem")
    public ResultData pageItem(
            @RequestParam("current") Integer current,
            @RequestParam("size") Integer size,
            @RequestParam(value = "provinceId", required = false) Long provinceId,
            @RequestParam(value = "cityId", required = false) Long cityId,
            @RequestParam(value = "districtId", required = false) Long districtId,
            @RequestParam(value = "apartmentId", required = false) Long apartmentId) {

        // 根据参数查询房间列表，并返回分页结果
        // 这里需要根据具体业务逻辑完成查询操作
        IPage<RoomPageItemDto> roomPageItemDtoPage = new Page<>(current,size);
        IPage<RoomPageItemDto> data = roomService.pageItem(roomPageItemDtoPage, provinceId, cityId, districtId, apartmentId);
        return ResultData.ok().setData(data); // 返回查询结果
    }
    @Operation(summary = "根据公寓id查询房间列表")
    @GetMapping("/listBasicByApartmentId")
    public ResultData listBasicByApartmentId(Integer id){
        List<RoomInfo> roomInfos=roomService.listBasicByApartmentId(id);
        return ResultData.ok().setData(roomInfos);
    }
    @Operation(summary = "根据id获取房间详细信息")
    @GetMapping("/getDetailById")
    public ResultData getDetailById(Integer id){
        RoomGetDetailByIdDto roomDetailDto =roomService.getDetailById(id);
        return ResultData.ok().setData(roomDetailDto);
    }

    @Operation(summary = "根据id删除房间信息")
    @DeleteMapping("/removeById")
    public ResultData removeById(Integer id){
        boolean b = roomService.removeById(id);
        return b?ResultData.ok():ResultData.fail();
    }
}

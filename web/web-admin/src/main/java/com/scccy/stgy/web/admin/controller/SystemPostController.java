package com.scccy.stgy.web.admin.controller;

import com.scccy.stgy.common.pojo.ResultData;
import com.scccy.stgy.model.domain.SystemPost;
import com.scccy.stgy.web.admin.service.UserPostService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="后台用户岗位管理")
@RestController
@RequestMapping("/admin/system/post")
public class SystemPostController {
    @Resource
    UserPostService userPostService;
    @Operation(summary = "根据岗位id修改状态")
    @PostMapping("/updateStatusByPostId")
    public ResultData updateStatusByPostId(@RequestParam("id") Long id,@RequestParam("status") String status){
        userPostService.updateStatusByPostId(id,status);
        return ResultData.ok();
    }
    @Operation(summary = "获取全部岗位列表")
    @GetMapping("/list")
    public ResultData list(){
        List<SystemPost> listData =userPostService.list();
        return ResultData.ok().setData(listData);
    }

}

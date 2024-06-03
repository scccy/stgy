package com.scccy.stgy.web.admin.controller;

import com.scccy.stgy.common.pojo.ResultData;
import com.scccy.stgy.web.admin.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.locks.ReadWriteLock;

@Tag(name = "用户信息管理")
@RestController
@RequestMapping("/admin/user")
public class UserController {
    @Resource
    UserService userService;

    @PostMapping("updateStatusById")
    @Operation(summary = "根据用户id更新账号状态")
    public ResultData updateStatusById(@RequestParam("id") Integer id, @RequestParam("status") String status) {
        userService.updateStatusById(id,status);
        return ResultData.ok();
    }


}
package com.scccy.stgy.web.admin.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.scccy.stgy.common.pojo.ResultData;
import com.scccy.stgy.model.domain.SystemUser;
import com.scccy.stgy.model.dto.UserPageDto;
import com.scccy.stgy.model.vo.UserPageVo;
import com.scccy.stgy.web.admin.service.SystemUserService;
import com.scccy.stgy.web.admin.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@Tag(name = "后台用户信息管理")
@RestController
@RequestMapping("/admin/system/user")
public class SystemUserController {
    @Resource
    UserService userService;


    @Operation(summary = "根据ID修改后台用户状态")
    @PostMapping("/updateStatusByUserId")
    public ResultData updateStatusById(@RequestParam("id") Integer id, @RequestParam("status") String status) {
        userService.updateStatusById(id,status);
        return ResultData.ok();
    }

    @Operation(summary = "保存或更新后台用户信息")
    @PostMapping("/saveOrUpdate")
    public ResultData saveOrUpdate(@RequestBody SystemUser systemUser){
        userService.saveOrUpdate(systemUser);
        return ResultData.ok();
    }
    @Operation(summary = "判断后台用户名是否可用")
    @GetMapping("/isUserNameAvailable")
    public ResultData isUserNameAvailable(@RequestParam("username") String username ){
        boolean userNameAvailable = userService.isUserNameAvailable(username);
        return ResultData.ok().setData(userNameAvailable);
    }

    @Operation(summary = "根据条件分页查询后台用户列表")
    @GetMapping("/page")
    public ResultData page( UserPageDto userPageDto){
        Page<SystemUser> systemUserPage = new Page<>(userPageDto.getCurrent(),userPageDto.getSize());
        UserPageVo userPageVo = new UserPageVo();
        Page<UserPageVo> data = userService.page(systemUserPage,userPageDto);
        return ResultData.ok().setData(data);
    }
    @Operation(summary = "根据ID查询后台用户信息")
    @GetMapping("/getById")
    public ResultData getById( @RequestParam("id") long id){
        UserPageVo data = userService.getById(id);
        return ResultData.ok().setData(data);
    }

    @Operation(summary = "根据ID删除后台用户信息")
    @DeleteMapping("/deleteById")
    public ResultData  deleteById( @RequestParam("id") long id){
        userService.deleteById(id);
        return ResultData.ok();
    }

}

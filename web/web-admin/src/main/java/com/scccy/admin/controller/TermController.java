package com.scccy.admin.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.scccy.pojo.ResultData;

@RestController
@RequestMapping("/admin/term")
public class TermController {

    @PostMapping("saveOrUpdate")
    public ResultData saveOrUpdate() {
        return ResultData.ok();
    }
}

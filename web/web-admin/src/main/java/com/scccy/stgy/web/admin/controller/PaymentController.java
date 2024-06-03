package com.scccy.stgy.web.admin.controller;

import com.scccy.stgy.common.pojo.ResultData;
import com.scccy.stgy.model.domain.PaymentType;
import com.scccy.stgy.web.admin.service.PaymentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "支付方式管理")
@RestController
@RequestMapping("/admin/payment")
public class PaymentController {
    @Resource
    PaymentService paymentService;

    @PostMapping("/saveOrUpdate")
    @Operation(summary = "保存或更新支付方式")
    public ResultData saveOrUpdate(@RequestBody PaymentType paymentType) {
        boolean b = paymentService.saveOrUpdate(paymentType);
        return b ? ResultData.ok() : ResultData.fail();
    }

    @GetMapping("/list")
    @Operation(summary = "查询全部支付方式列表")
    public ResultData list() {
        List<PaymentType> data = paymentService.list();
        return ResultData.ok().setData(data) ;
    }
    @DeleteMapping("/deleteById")
    @Operation(summary = "根据ID删除支付方式")
    public ResultData deleteById(long id) {
        boolean b = paymentService.deleteById(id);
        return b ? ResultData.ok() : ResultData.fail();
    }

}

package com.scccy.stgy.common.handlerExption;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.scccy.stgy.common.pojo.ResultData;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestControllerAdvice()
public class ControllerExceptionHandler {
    // 处理缺少请求参数的异常
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResultData handleMissingServletRequestParameter(MissingServletRequestParameterException ex) {
        // 构建错误信息，说明哪个必需参数缺失
        String message = String.format("Required parameter '%s' is not present", ex.getParameterName());

        // 返回一个BAD_REQUEST(400)响应，并通知客户端哪个参数是必需的
        log.error(ex.getMessage());
        return  ResultData.fail().setCode(400).setMessage(message);
    }

    // 处理请求数据字段验证失败的异常
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultData handleValidationExceptions(MethodArgumentNotValidException ex) {
        // 创建一个错误信息的集合
        Map<String, String> errors = new HashMap<>();
        // 循环所有的错误，将它们加入到错误信息的集合中
        ex.getBindingResult().getAllErrors().forEach(error -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        // 返回一个BAD_REQUEST(400)响应，并提供具体的字段错误信息
        log.error(ex.getMessage());
        return  ResultData.fail().setMessage("Validation failed").setData(errors);
    }
}

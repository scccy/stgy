package com.scccy.stgy.common.handlerExption;


import com.scccy.stgy.common.enums.ResultCodeEnum;
import com.scccy.stgy.common.pojo.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    //        针对数据库异常处理
    @ExceptionHandler(DataAccessException.class)
    public ResultData handleSQLException(SQLException ex) {
        String errorMessage = "Database error: SQL integrity constraint violation.";
        log.error(errorMessage, ex);
        return ResultData.fail().setMessage(errorMessage).setData(ex.getMessage());
    }

    // 处理所有未被前面特定异常处理器捕获的异常
    // 处理所有未被前面特定异常处理器捕获的异常
    @ExceptionHandler(Exception.class)
    public ResultData handleGlobalException(Exception ex) {
        log.error("An unexpected error occurred: ", ex);
        return ResultData.fail().setMessage("An unexpected error occurred, please contact support.")
                .setData(ex.getMessage());
    }


    // 自定义的异常类
    public static class CustomException extends RuntimeException {
        private ResultCodeEnum codeEnum;
        private Throwable e;
        public CustomException(ResultCodeEnum codeEnum,Exception e){
            super(codeEnum.getMessage());
            this.codeEnum = codeEnum;
            //接受发生异常时的原生异常对象(包含了堆栈日志)
            this.e = e;
        }
        public CustomException(ResultCodeEnum codeEnum){
            super(codeEnum.getMessage());
            this.codeEnum = codeEnum;
        }
    }
    // 处理自定义异常，通常用于业务逻辑错误，例如无效的用户操作等
    @ExceptionHandler(GlobalExceptionHandler.CustomException.class)
    public ResultData handleCustomException(GlobalExceptionHandler.CustomException ex) {
        log.error(ex.getMessage());
        // 返回客户端一个BAD_REQUEST(400)响应，以及异常信息
        return  ResultData.fail().setData(400).setMessage(ex.getMessage());
    }

}
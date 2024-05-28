package com.scccy.stgy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ResultData {
    private Integer code;
    private String message;
    private Object data;
    private boolean ok;

    public static ResultData ok() {
        ResultData resultData = new ResultData();
        resultData.setCode(200);
        resultData.setMessage("");
        resultData.setOk(true);
        return resultData;
    }


    public static ResultData fail() {
        ResultData resultData = new ResultData();
        resultData.setCode(500);
        resultData.setMessage("");
        resultData.setOk(false);
        return resultData;
    }



}

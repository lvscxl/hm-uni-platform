package com.zp.uni.hmall.common;

import lombok.Data;

@Data
public class ResponseResult<T> {

    private long success_code;
    private String msg;
    private T Data;
    private Boolean success;
    private T message;

    public ResponseResult(long success_code, String msg, T data, Boolean success, T message) {
        this.success_code = success_code;
        this.msg = msg;
        this.Data = data;
        this.success = success;
        this.message = data;
    }

    public ResponseResult(String msg, T data, Boolean success, T message) {
        this.msg = msg;
        this.Data = data;
        this.success = success;
        this.message = message;
    }
    public ResponseResult( ){

    }
    public ResponseResult(T data, Boolean success, T message) {
        this.Data = data;
        this.success = success;
        this.message = message;
    }


    public ResponseResult(long success_code, String msg) {
        this.success_code = success_code;
        this.msg = msg;
    }

    public static <T> ResponseResult<T> success(T data) {
        return new ResponseResult<T>(ResultCode.SUCCESS.getCode(), "",data,true, data);
    }


    public static <T> ResponseResult<T> failed(String msg) {
        return new ResponseResult<T>(ResultCode.FAILED.getCode(), msg);
    }
}

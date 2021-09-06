package com.zp.uni.hmall.common;


import lombok.Data;

/**
 * 通用返回对象
 * Created by duanjingjing on 2021/1/6.
 */
@Data
public class CommonResult<T> {
    private long status;
    private String msg;
    private T results;

    protected CommonResult() {
    }

    protected CommonResult(long status, String msg, T results) {
        this.status = status;
        this.msg = msg;
        this.results = results;
    }

    /**
     * 成功返回结果
     *
     * @param results 获取的数据
     */
    public static <T> CommonResult<T> success(T results) {
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), results);
    }

    /**
     * 成功返回结果
     *
     * @param results    获取的数据
     * @param msg 提示信息
     */
    public static <T> CommonResult<T> success(T results, String msg) {
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), msg, results);
    }

    /**
     * 失败返回结果
     *
     * @param errorCode 错误码
     */
    public static <T> CommonResult<T> failed(ResultCode errorCode) {
        return new CommonResult<T>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    /**
     * 失败返回结果
     *
     * @param errorCode 错误码
     * @param msg   错误信息
     */
    public static <T> CommonResult<T> failed(ResultCode errorCode, String msg) {
        return new CommonResult<T>(errorCode.getCode(), msg, null);
    }

    /**
     * 失败返回结果
     *
     * @param msg 提示信息
     */
    public static <T> CommonResult<T> failed(String msg) {
        return new CommonResult<T>(ResultCode.FAILED.getCode(), msg, null);
    }

    /**
     * 失败返回结果
     */
    public static <T> CommonResult<T> failed() {
        return failed(ResultCode.FAILED);
    }

    /**
     * 参数验证失败返回结果
     */
    public static <T> CommonResult<T> validateFailed() {
        return failed(ResultCode.VALIDATE_FAILED);
    }

    /**
     * 参数验证失败返回结果
     *
     * @param msg 提示信息
     */
    public static <T> CommonResult<T> validateFailed(String msg) {
        return new CommonResult<T>(ResultCode.VALIDATE_FAILED.getCode(), msg, null);
    }

    public static <T> CommonResult<T> validateFailed(T results) {
        return new CommonResult<T>(ResultCode.VALIDATE_FAILED.getCode(), ResultCode.VALIDATE_FAILED.getMessage(), results);
    }

    /**
     * 未登录返回结果
     */
    public static <T> CommonResult<T> unauthorized(T results) {
        return new CommonResult<T>(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMessage(), results);
    }

    /**
     * 未授权返回结果
     */
    public static <T> CommonResult<T> forbidden(T results) {
        return new CommonResult<T>(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMessage(), results);
    }
}

package com.chenyuan.starter.web.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.PrintWriter;
import java.io.StringWriter;

@Getter
@Setter
public class ResultJson {
    public static final Integer SUCCESS = 0;
    public static final Integer ERROR = 500;
    public static final Integer UNAUTHORIZED = 401;
    public static final Integer FORBIDDEN = 403;

    /**
     * 请求状态码
     */
    private Integer code = 0;

    /**
     * 请求结果
     */
    private Object data;

    /**
     * 请求异常信息
     */
    private String error;

    private ResultJson(Integer code, Object data, Throwable throwable) {
        this.code = code;
        this.data = data;
        if( throwable != null ) {
            this.error = throwable.getMessage();
        }
    }

    /**
     * 请求成功
     * @return
     */
    public static ResultJson success() {
        return success("请求成功!");
    }

    /**
     * 请求成功
     * @param data
     * @return
     */
    public static ResultJson success(Object data) {
        return new ResultJson(SUCCESS, data, null);
    }

    /**
     * 请求失败
     * @param error
     * @return
     */
    public static ResultJson error(String error) {
        return error(error, new Exception(error));
    }

    /**
     * 请求失败
     * @param error
     * @return
     */
    public static ResultJson error(Throwable error) {
        return error(error.getMessage(), error);
    }

    /**
     * 请求失败
     * @param error
     * @return
     */
    public static ResultJson error(String error, Throwable throwable) {
        return new ResultJson(ERROR, error, throwable);
    }

    /**
     * 未登录
     * @return
     */
    public static ResultJson unauthorized() {
        return unauthorized("您还未登录或登录超时!");
    }

    /**
     * 未登录
     * @param message
     * @return
     */
    public static ResultJson unauthorized(String message) {
        return new ResultJson(UNAUTHORIZED, message, new Exception(message));
    }

    /**
     * 无权限访问
     * @return
     */
    public static ResultJson forbidden() {
        return forbidden("无权限访问!");
    }

    /**
     * 无权限访问
     * @param message
     * @return
     */
    public static ResultJson forbidden(String message) {
        return new ResultJson(FORBIDDEN, message, new Exception(message));
    }

}

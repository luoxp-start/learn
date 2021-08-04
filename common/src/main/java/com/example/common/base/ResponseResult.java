package com.example.common.base;

/**
 * @author: lxp
 * @date: 2021/8/4 13:24
 */
public class ResponseResult {

    private static final long serialVersionUID = -5443719680165946100L;

    private Integer code;
    private String message;
    private Object data;

    public ResponseResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseResult(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static ResponseResult success() {
        return new ResponseResult(0, "success");
    }

    public static ResponseResult error() {
        return new ResponseResult(1, "error");
    }

    public static ResponseResult success(String message) {
        return new ResponseResult(0, message);
    }

    public static ResponseResult error(String message) {
        return new ResponseResult(1, message);
    }

    public static ResponseResult success(Object data) {
        return new ResponseResult(0, "success", data);
    }

    public static ResponseResult error(Object data) {
        return new ResponseResult(1, "error", data);
    }

    public static ResponseResult success(String message, Object data) {
        return new ResponseResult(0, message, data);
    }

    public static ResponseResult error(String message, Object data) {
        return new ResponseResult(1, message, data);
    }

    public static ResponseResult custom(Integer code, String message, Object data) {
        return new ResponseResult(code, message, data);
    }
}

package com.example.dubbo.dto;

import java.io.Serializable;

/**
 * @author wangyang
 * @date 2020/05/29
 */
public class ResultDTO implements Serializable {

    private Integer code;
    private String message;
    private Object data;

    public ResultDTO() {
    }

    public ResultDTO(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public static ResultDTO success(Integer code, String message, Object data) {
        return result(code, message, data);
    }

    public static ResultDTO success(String message, Object data) {
        return result(200, message, data);
    }

    public static ResultDTO success(Object data) {
        return result(200, "成功", data);
    }

    public static ResultDTO failed(Integer code, String message) {
        return result(code, message, null);
    }

    public static ResultDTO failed(Object data) {
        return result(500, "失败", data);
    }

    public static ResultDTO failed(String message) {
        return result(500, message, null);
    }

    private static ResultDTO result(Integer code, String message, Object data) {
        return new ResultDTO(code, message, data);
    }

    @Override
    public String toString() {
        return "ReslutDTO{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

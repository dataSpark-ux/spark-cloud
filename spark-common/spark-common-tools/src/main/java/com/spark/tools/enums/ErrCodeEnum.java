package com.spark.tools.enums;

import lombok.Getter;

/**
 * @author wy
 * @Description 错误码枚举
 * @createTime 2021/08/16
 */
@Getter
public enum ErrCodeEnum {

    PARAMETER_ERROR(400, "参数异常"),

    NOT_FOUND(404, "未找到数据"),

    ERROR(500, "未知异常");


    private int code;

    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    ErrCodeEnum() {
    }

    public static String getMsg(int code) {
        for (ErrCodeEnum errCodeEnum : ErrCodeEnum.values()) {
            if (code == errCodeEnum.getCode()) {
                return errCodeEnum.msg;
            }
        }
        return null;
    }

    ErrCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

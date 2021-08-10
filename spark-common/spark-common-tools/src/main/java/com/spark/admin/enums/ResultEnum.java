package com.spark.admin.enums;

import lombok.Getter;

/**
 * @author wy
 * @Description 返回枚举
 * @createTime 2021/08/09
 */
@Getter
public enum  ResultEnum {

    /**
     * 成功
     */
    SUCCESS(0),

    /**
     * 失败
     */
    ERROR(1);

    private Integer code;

    ResultEnum(Integer code) {
        this.code = code;
    }

}

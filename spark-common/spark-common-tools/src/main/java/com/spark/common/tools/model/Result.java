package com.spark.common.tools.model;

import com.spark.common.tools.enums.ResultEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wy
 * @Description 统一返回对象
 * @createTime 2021/08/09
 */

/**
 * 返回结果
 * @author wangyi
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -4850336901189559589L;
    /**
     * 响应数据
     */
    @ApiModelProperty(value = "响应数据")
    private T data;

    /**
     * 编码：0表示成功，其他值表示失败
     */
    @ApiModelProperty(value = "编码：0表示成功，其他值表示失败")
    private Integer code;
    /**
     * 消息内容
     */
    @ApiModelProperty(value = "消息内容")
    private String msg;

    public static <T> Result<T> success(String msg) {
        return of(null, ResultEnum.SUCCESS.getCode(), msg);
    }

    public static <T> Result<T> success() {
        return of(null, ResultEnum.SUCCESS.getCode(), null);
    }

    public static <T> Result<T> success(T data, String msg) {

        return of(data, ResultEnum.SUCCESS.getCode(), msg);
    }

    public static <T> Result<T> success(T data) {
        return of(data, ResultEnum.SUCCESS.getCode(), "");
    }

    public static <T> Result<T> of(T data, Integer code, String msg) {
        return new Result<>(data, code, msg);
    }

    public static <T> Result<T> failed(String msg) {

        return of(null, ResultEnum.ERROR.getCode(), msg);
    }

    public static <T> Result<T> failed(T data, String msg) {

        return of(data, ResultEnum.ERROR.getCode(), msg);
    }
}


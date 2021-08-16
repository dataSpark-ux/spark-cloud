package com.spark.tools.exception;

import com.spark.tools.enums.ErrCodeEnum;
import com.spark.tools.enums.ResultEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;


/**
 * @author wy
 * @Description 业务
 * @createTime 2021/08/16
 */
@AllArgsConstructor
@Slf4j
@NoArgsConstructor
@Data
public class BusinessException extends RuntimeException {

    /**
     * 异常编码
     */
    private Integer errorCode;
    /**
     * 异常消息
     */
    private String message;

    /**
     * getMessage
     *
     * @return
     */
    @Override
    public String getMessage() {
        return message;
    }


    /**
     * BizServiceException
     *
     * @param resultCodeEnum sb
     */
    public BusinessException(ErrCodeEnum ErrCodeEnum) {
        this.errorCode = ErrCodeEnum.getCode();
        this.message = ErrCodeEnum.getMsg();
    }
}

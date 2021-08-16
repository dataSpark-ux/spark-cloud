package com.spark.tools.exception;

import com.spark.tools.model.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.nio.file.AccessDeniedException;

/**
 * 异常通用处理
 *
 * @author wangyi
 */
@ResponseBody
@Slf4j
public class ExceptionAdvice {
    /**
     * IllegalArgumentException异常处理返回json
     * 返回状态码:400
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({IllegalArgumentException.class})
    public Result badRequestException(IllegalArgumentException e) {
        return defHandler("参数解析失败", e);
    }

    /**
     * AccessDeniedException异常处理返回json
     * 返回状态码:403
     */
    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler({AccessDeniedException.class})
    public Result badMethodExpressException(AccessDeniedException e) {
        return defHandler("没有权限请求当前方法", e);
    }

    /**
     * 不支持当前请求方法
     * 返回状态码:405
     */
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
    public Result handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        return defHandler("不支持当前请求方法", e);
    }

    /**
     * 不支持当前媒体类型
     * 返回状态码:415
     */
    @ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
    @ExceptionHandler({HttpMediaTypeNotSupportedException.class})
    public Result handleHttpMediaTypeNotSupportedException(HttpMediaTypeNotSupportedException e) {
        return defHandler("不支持当前媒体类型", e);
    }
    /**
     * BusinessException 业务异常处理
     * 返回状态码:500
     */
    @ExceptionHandler(BusinessException.class)
    public Result handleException(BusinessException e) {
        return defHandler(e.getErrorCode(), e.getMessage(), e);
    }


    /**
     * 所有异常统一处理
     * 返回状态码:500
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e) {
        return defHandler("未知异常", e);
    }

    /**
     * 组装返回错误对象
     *
     * @param msg
     * @param e
     * @return
     */
    private Result defHandler(String msg, Exception e) {
        log.error(msg, e);
        return Result.failed(msg);
    }

    /**
     * 组装返回错误对象
     *
     * @param msg
     * @param e
     * @return
     */
    private Result defHandler(Integer code, String msg, Exception e) {
        log.error(msg, e);
        return Result.failed(code, msg);
    }
}
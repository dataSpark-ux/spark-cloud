package com.spark.tools.util;

import cn.hutool.core.bean.BeanUtil;
import com.spark.tools.enums.ErrCodeEnum;
import com.spark.tools.enums.ResultEnum;
import com.spark.tools.exception.BusinessException;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author wy
 * @Description
 * @createTime 2021/08/16
 */
@Data
@Slf4j
public class BeanUtils {
    /**
     * copyProperties
     *
     * @param from s
     * @param toClass s
     * @param <T> s
     * @return s
     */
    public static <T> T copyProperties(Object from, Class<T> toClass) {
        if (from == null) {
            return null;
        }
        T to;
        try {
            to = toClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            log.error("属性copy 异常");
            throw new BusinessException(ErrCodeEnum.ERROR);
        }
       BeanUtil.copyProperties(from, to);
        return to;

    }

    /**
     * copyListProperties
     *
     * @param fromList s
     * @param to s
     * @param <T> s
     * @return s
     */
    public static <T> List<T> copyListProperties(Collection<? extends Object> fromList, Class<T> to) {
        if (fromList == null) {
            return null;
        }
        List<T> result = new ArrayList<T>(fromList.size());
        for (Object from : fromList) {
            T t = copyProperties(from, to);
            result.add(t);
        }
        return result;
    }

}

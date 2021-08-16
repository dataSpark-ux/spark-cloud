package com.spark.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.spark.sys.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wy
 * @Description
 * @createTime 2021/08/16
 */
@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {
}

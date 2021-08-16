package com.spark.sys.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spark.sys.client.request.QuerySysUserRequest;
import com.spark.sys.client.response.SysUserResponse;
import com.spark.sys.dao.SysUserDao;
import com.spark.sys.entity.SysUserEntity;
import com.spark.sys.service.ISysUserService;
import com.spark.tools.enums.ErrCodeEnum;
import com.spark.tools.exception.BusinessException;
import com.spark.tools.util.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wy
 * @Description
 * @createTime 2021/08/16
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUserEntity> implements ISysUserService {

    @Override
    public List<SysUserResponse> list(QuerySysUserRequest request) {
        QueryWrapper<SysUserEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(SysUserEntity::getUsername, request.getUsername());
        List<SysUserEntity> list = this.list(queryWrapper);
        return BeanUtils.copyListProperties(list, SysUserResponse.class);
    }

    @Override
    public SysUserResponse getUsername(String username) {
        LambdaQueryWrapper<SysUserEntity> queryWrapper = new QueryWrapper<SysUserEntity>()
                .lambda().eq(SysUserEntity::getUsername, username);
        SysUserEntity sysUserEntity = this.getOne(queryWrapper);
        if (sysUserEntity == null) {
            throw new BusinessException(ErrCodeEnum.NOT_FOUND);
        }
        return BeanUtils.copyProperties(sysUserEntity, SysUserResponse.class);
    }
}

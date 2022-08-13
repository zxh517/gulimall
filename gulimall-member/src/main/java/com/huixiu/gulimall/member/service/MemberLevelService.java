package com.huixiu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huixiu.gulimall.common.utils.PageUtils;
import com.huixiu.gulimall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author zhangxiaohui
 * @email zxh517@126.com
 * @date 2022-08-13 09:56:56
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


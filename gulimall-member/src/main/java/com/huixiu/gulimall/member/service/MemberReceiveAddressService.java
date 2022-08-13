package com.huixiu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huixiu.gulimall.common.utils.PageUtils;
import com.huixiu.gulimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author zhangxiaohui
 * @email zxh517@126.com
 * @date 2022-08-13 09:56:56
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


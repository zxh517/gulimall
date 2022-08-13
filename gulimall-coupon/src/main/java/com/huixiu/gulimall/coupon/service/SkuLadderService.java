package com.huixiu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huixiu.gulimall.common.utils.PageUtils;
import com.huixiu.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author zhangxiaohui
 * @email zxh517@126.com
 * @date 2022-08-13 09:09:18
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.huixiu.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huixiu.gulimall.common.utils.PageUtils;
import com.huixiu.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author zhangxiaohui
 * @email zxh517@126.com
 * @date 2022-08-13 09:46:40
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.huixiu.gulimall.order.dao;

import com.huixiu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhangxiaohui
 * @email zxh517@126.com
 * @date 2022-08-13 09:46:40
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

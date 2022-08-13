package com.huixiu.gulimall.product.dao;

import com.huixiu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhangxiaohui
 * @email zxh517@126.com
 * @date 2022-08-12 16:35:52
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

package com.huixiu.gulimall.member.dao;

import com.huixiu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhangxiaohui
 * @email zxh517@126.com
 * @date 2022-08-13 09:56:56
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

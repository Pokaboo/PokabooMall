package com.pokaboo.mall.member.dao;

import com.pokaboo.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author pokaboo
 * @email pokaboo@163.com
 * @date 2023-02-14 19:57:14
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

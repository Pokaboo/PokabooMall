package com.pokaboo.mall.coupon.dao;

import com.pokaboo.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author pokaboo
 * @email pokaboo@163.com
 * @date 2023-02-14 19:52:37
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

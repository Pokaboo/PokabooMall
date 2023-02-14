package com.pokaboo.mall.order.dao;

import com.pokaboo.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author pokaboo
 * @email pokaboo@163.com
 * @date 2023-02-14 19:58:22
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

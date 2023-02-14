package com.pokaboo.mall.order.dao;

import com.pokaboo.mall.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author pokaboo
 * @email pokaboo@163.com
 * @date 2023-02-14 19:58:22
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}

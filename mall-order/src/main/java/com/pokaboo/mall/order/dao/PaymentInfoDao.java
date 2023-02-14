package com.pokaboo.mall.order.dao;

import com.pokaboo.mall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author pokaboo
 * @email pokaboo@163.com
 * @date 2023-02-14 19:58:22
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}

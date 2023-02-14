package com.pokaboo.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pokaboo.common.utils.PageUtils;
import com.pokaboo.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author pokaboo
 * @email pokaboo@163.com
 * @date 2023-02-14 19:58:22
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


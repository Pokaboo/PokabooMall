package com.pokaboo.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pokaboo.common.utils.PageUtils;
import com.pokaboo.mall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author pokaboo
 * @email pokaboo@163.com
 * @date 2023-02-14 19:52:37
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


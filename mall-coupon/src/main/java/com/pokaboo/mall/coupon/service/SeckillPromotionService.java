package com.pokaboo.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pokaboo.common.utils.PageUtils;
import com.pokaboo.mall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author pokaboo
 * @email pokaboo@163.com
 * @date 2023-02-14 19:52:37
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


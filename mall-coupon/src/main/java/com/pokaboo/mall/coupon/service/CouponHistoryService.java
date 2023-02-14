package com.pokaboo.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pokaboo.common.utils.PageUtils;
import com.pokaboo.mall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author pokaboo
 * @email pokaboo@163.com
 * @date 2023-02-14 19:52:37
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.pokaboo.mall.member.feign;

import com.pokaboo.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-coupon")
public interface CouponFenginService {

    @RequestMapping("coupon/coupon/coupons")
    public R coupons();
}

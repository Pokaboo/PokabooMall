package com.pokaboo.mall.coupon;

import com.pokaboo.common.utils.PageUtils;
import com.pokaboo.mall.coupon.entity.CouponEntity;
import com.pokaboo.mall.coupon.service.CouponService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MallCouponApplicationTests {

    @Autowired
    CouponService couponService;
    @Test
    public void contextLoads() {
        List<CouponEntity> list = couponService.list();
        System.out.println(" Coupon:" + list.toString());
    }

}

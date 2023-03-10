package com.pokaboo.mall.order;

import com.pokaboo.mall.order.entity.OrderEntity;
import com.pokaboo.mall.order.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MallOrderApplicationTests {

    @Autowired
    OrderService orderService;
    @Test
    public  void contextLoads() {
        List<OrderEntity> list = orderService.list();
        System.out.println("order :" + list.toString());
    }

}

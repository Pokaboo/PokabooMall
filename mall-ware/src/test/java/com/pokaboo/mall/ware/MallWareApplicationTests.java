package com.pokaboo.mall.ware;

import com.pokaboo.mall.ware.entity.WareInfoEntity;
import com.pokaboo.mall.ware.service.WareInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MallWareApplicationTests {

    @Autowired
    WareInfoService wareInfoService;
    @Test
    public void contextLoads() {
        List<WareInfoEntity> list = wareInfoService.list();
        System.out.println("ware : " +list.toString());
    }

}

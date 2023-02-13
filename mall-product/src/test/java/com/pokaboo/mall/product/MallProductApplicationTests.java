package com.pokaboo.mall.product;

import com.pokaboo.mall.product.entity.BrandEntity;
import com.pokaboo.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public  class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        System.out.println("测试。。。");
        //List<BrandEntity> list = brandService.list();
        boolean remove = brandService.removeById(1L);
        System.out.println("查询结果："+remove);
    }

}

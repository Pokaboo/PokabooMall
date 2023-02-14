package com.pokaboo.mall.member;

import com.pokaboo.mall.member.entity.MemberEntity;
import com.pokaboo.mall.member.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public  class MallMemberApplicationTests {

    @Autowired
    MemberService memberService;
    @Test
    public  void contextLoads() {
        List<MemberEntity> list = memberService.list();
        System.out.println("member ：" +list.toString() );
    }

}

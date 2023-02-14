package com.pokaboo.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pokaboo.common.utils.PageUtils;
import com.pokaboo.mall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author pokaboo
 * @email pokaboo@163.com
 * @date 2023-02-14 19:57:14
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


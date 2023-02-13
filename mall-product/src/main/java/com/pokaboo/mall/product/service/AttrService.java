package com.pokaboo.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pokaboo.common.utils.PageUtils;
import com.pokaboo.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author pokaboo
 * @email pokaboo@163.com
 * @date 2023-02-13 21:02:56
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.pokaboo.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pokaboo.common.utils.PageUtils;
import com.pokaboo.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author pokaboo
 * @email pokaboo@163.com
 * @date 2023-02-13 21:02:56
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


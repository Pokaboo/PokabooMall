package com.pokaboo.mall.product.dao;

import com.pokaboo.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author pokaboo
 * @email pokaboo@163.com
 * @date 2023-02-13 21:02:57
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

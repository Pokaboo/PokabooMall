package com.pokaboo.mall.ware.dao;

import com.pokaboo.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author pokaboo
 * @email pokaboo@163.com
 * @date 2023-02-14 19:59:19
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}

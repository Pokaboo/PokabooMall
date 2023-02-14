package com.pokaboo.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pokaboo.common.utils.PageUtils;
import com.pokaboo.mall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author pokaboo
 * @email pokaboo@163.com
 * @date 2023-02-14 19:57:14
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


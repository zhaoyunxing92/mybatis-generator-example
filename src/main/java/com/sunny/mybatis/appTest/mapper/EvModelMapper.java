/**
 * Copyright(C) 2018 Hangzhou ccclubs Technology Co., Ltd. All rights reserved.
 */
package com.sunny.mybatis.appTest.mapper;

import com.sunny.mybatis.appTest.model.EvModel;
import com.sunny.mybatis.common.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface EvModelMapper extends BaseMapper<EvModel, Long> {
}
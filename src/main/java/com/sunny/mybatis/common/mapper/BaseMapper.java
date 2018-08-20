package com.sunny.mybatis.common.mapper;




import com.sunny.mybatis.common.model.BaseModel;

import java.io.Serializable;

/**
 * @author sunny
 * @class: com.sunny.workflow.user.common.mapper.BaseMapper
 * @date: 2018-05-18 17:07
 * @des:
 */
public interface BaseMapper<T extends BaseModel<ID>, ID extends Serializable> {
    int deleteByPrimaryKey(ID id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(ID id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}

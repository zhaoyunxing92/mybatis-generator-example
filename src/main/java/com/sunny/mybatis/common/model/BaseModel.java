package com.sunny.mybatis.common.model;


import java.io.Serializable;
import java.util.Date;

/**
 * @author sunny
 * @class: com.sunny.workflow.user.common.model.BaseModel
 * @date: 2018-05-18 17:00
 * @des: 父模型
 */
public class BaseModel<ID extends Serializable> implements Serializable {

    private static final long serialVersionUID = 720013901235423189L;

    private ID id;

    /**
     * 用户状态(1=正常，8=冻结)
     */
    private Byte status;

    /**
     * 版本
     */
    private Integer versions;

    /**
     * 创建人
     */
    private String creator;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 修改人
     */
    private String modifier;
    /**
     * 修改时间
     */
    private Date modifyDate;
}

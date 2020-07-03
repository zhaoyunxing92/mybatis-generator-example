/**
 * Copyright(C) 2020 Hangzhou zhaoyunxing Technology Co., Ltd. All rights reserved.
 */
package com.sunny.mybatis.sdata.model;

import com.sunny.mybatis.common.model.BaseModel;
import java.util.Date;

public class SdataOwhScore extends BaseModel<Long> {
    /**
     * 主键
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 打分对象
     */
    private Long targetId;

    /**
     * 分数
     */
    private Integer score;

    /**
     * 员工工号
     */
    private String ownerId;

    /**
     * 员工花名
     */
    private String ownerName;

    /**
     * 员工头像
     */
    private String avatarUrl;

    /**
     * 员工部门
     */
    private String depName;

    /**
     * sdata_owh_score
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * @return id 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 创建时间
     * @return gmtCreate 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 创建时间
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 修改时间
     * @return gmtModified 修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 修改时间
     * @param gmtModified 修改时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 打分对象
     * @return targetId 打分对象
     */
    public Long getTargetId() {
        return targetId;
    }

    /**
     * 打分对象
     * @param targetId 打分对象
     */
    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    /**
     * 分数
     * @return score 分数
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 分数
     * @param score 分数
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 员工工号
     * @return ownerId 员工工号
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * 员工工号
     * @param ownerId 员工工号
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId == null ? null : ownerId.trim();
    }

    /**
     * 员工花名
     * @return ownerName 员工花名
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * 员工花名
     * @param ownerName 员工花名
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName == null ? null : ownerName.trim();
    }

    /**
     * 员工头像
     * @return avatarUrl 员工头像
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * 员工头像
     * @param avatarUrl 员工头像
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    /**
     * 员工部门
     * @return depName 员工部门
     */
    public String getDepName() {
        return depName;
    }

    /**
     * 员工部门
     * @param depName 员工部门
     */
    public void setDepName(String depName) {
        this.depName = depName == null ? null : depName.trim();
    }
}
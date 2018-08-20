/**
 * Copyright(C) 2018 Hangzhou ccclubs Technology Co., Ltd. All rights reserved.
 */
package com.sunny.mybatis.appTest.model;

import com.sunny.mybatis.common.model.BaseModel;
import java.math.BigDecimal;
import java.util.Date;

public class EvModel extends BaseModel<Long> {
    /**
     * 编号
     */
    private Long id;

    /**
     * 车型名称
     */
    private String name;

    /**
     * 车型销售名称
     */
    private String saleName;

    /**
     * 车型备案品牌
     */
    private Long brandId;

    /**
     * 车型公告号(车型备案型号)
     */
    private String cxggNo;

    /**
     * 车型符合性报告编号
     */
    private String reportNo;

    /**
     * 车型公告批次号
     */
    private String cxggBatchNo;

    /**
     * 车机适配车型
     */
    private Integer tboxSuit;

    /**
     * 动力类型
     */
    private Byte powerType;

    /**
     * 车辆种类
     */
    private Byte vehicleType;

    /**
     * 变速箱类型
     */
    private Byte gearBoxType;

    /**
     * 充电方式
     */
    private String chargeMode;

    /**
     * 驱动电机布置型式/位置
     */
    private String powerDevicePlace;

    /**
     * 车载充电机
     */
    private String charger;

    /**
     * 生产企业
     */
    private Long companyId;

    /**
     * 储能装置
     */
    private Long powerDeviceId;

    /**
     * 驱动电机
     */
    private Long driveMotorId;

    /**
     * 纯电工况法续航里程(KM)
     */
    private Integer electricEndurance;

    /**
     * 匀速法续航里程(KM)
     */
    private Integer uniformSpeedEndurance;

    /**
     * 整车质保期(万公里)
     */
    private Integer guaranteeMileage;

    /**
     * 整车质保期(年)
     */
    private Integer guaranteeYear;

    /**
     * 准载人数(人)
     */
    private Integer carrierCount;

    /**
     * 总质量(KG)
     */
    private Integer totalWeight;

    /**
     * 整备质量(KG)
     */
    private Integer curbWeight;

    /**
     * 最高车速(KM/H)
     */
    private Integer maxSpeed;

    /**
     * 各档位传动比
     */
    private BigDecimal transmitRatio;

    /**
     * 能量回收装置类型
     */
    private Byte energyRecoveryType;

    /**
     * 上市时间
     */
    private Date listingTime;

    /**
     * 长(mm)
     */
    private Integer sizeLength;

    /**
     * 宽(mm)
     */
    private Integer sizeWidth;

    /**
     * 高(mm)
     */
    private Integer sizeHeight;

    /**
     * 轴距
     */
    private Integer wheelBase;

    /**
     * 百公里加速时间
     */
    private Integer hundredKmAcceleration;

    /**
     * 百公里电耗
     */
    private Integer hundredKmPowerconsump;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 添加时间
     */
    private Date addTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * ev_model
     */
    private static final long serialVersionUID = 1L;

    /**
     * 编号
     * @return id 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 编号
     * @param id 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 车型名称
     * @return name 车型名称
     */
    public String getName() {
        return name;
    }

    /**
     * 车型名称
     * @param name 车型名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 车型销售名称
     * @return saleName 车型销售名称
     */
    public String getSaleName() {
        return saleName;
    }

    /**
     * 车型销售名称
     * @param saleName 车型销售名称
     */
    public void setSaleName(String saleName) {
        this.saleName = saleName == null ? null : saleName.trim();
    }

    /**
     * 车型备案品牌
     * @return brandId 车型备案品牌
     */
    public Long getBrandId() {
        return brandId;
    }

    /**
     * 车型备案品牌
     * @param brandId 车型备案品牌
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    /**
     * 车型公告号(车型备案型号)
     * @return cxggNo 车型公告号(车型备案型号)
     */
    public String getCxggNo() {
        return cxggNo;
    }

    /**
     * 车型公告号(车型备案型号)
     * @param cxggNo 车型公告号(车型备案型号)
     */
    public void setCxggNo(String cxggNo) {
        this.cxggNo = cxggNo == null ? null : cxggNo.trim();
    }

    /**
     * 车型符合性报告编号
     * @return reportNo 车型符合性报告编号
     */
    public String getReportNo() {
        return reportNo;
    }

    /**
     * 车型符合性报告编号
     * @param reportNo 车型符合性报告编号
     */
    public void setReportNo(String reportNo) {
        this.reportNo = reportNo == null ? null : reportNo.trim();
    }

    /**
     * 车型公告批次号
     * @return cxggBatchNo 车型公告批次号
     */
    public String getCxggBatchNo() {
        return cxggBatchNo;
    }

    /**
     * 车型公告批次号
     * @param cxggBatchNo 车型公告批次号
     */
    public void setCxggBatchNo(String cxggBatchNo) {
        this.cxggBatchNo = cxggBatchNo == null ? null : cxggBatchNo.trim();
    }

    /**
     * 车机适配车型
     * @return tboxSuit 车机适配车型
     */
    public Integer getTboxSuit() {
        return tboxSuit;
    }

    /**
     * 车机适配车型
     * @param tboxSuit 车机适配车型
     */
    public void setTboxSuit(Integer tboxSuit) {
        this.tboxSuit = tboxSuit;
    }

    /**
     * 动力类型
     * @return powerType 动力类型
     */
    public Byte getPowerType() {
        return powerType;
    }

    /**
     * 动力类型
     * @param powerType 动力类型
     */
    public void setPowerType(Byte powerType) {
        this.powerType = powerType;
    }

    /**
     * 车辆种类
     * @return vehicleType 车辆种类
     */
    public Byte getVehicleType() {
        return vehicleType;
    }

    /**
     * 车辆种类
     * @param vehicleType 车辆种类
     */
    public void setVehicleType(Byte vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * 变速箱类型
     * @return gearBoxType 变速箱类型
     */
    public Byte getGearBoxType() {
        return gearBoxType;
    }

    /**
     * 变速箱类型
     * @param gearBoxType 变速箱类型
     */
    public void setGearBoxType(Byte gearBoxType) {
        this.gearBoxType = gearBoxType;
    }

    /**
     * 充电方式
     * @return chargeMode 充电方式
     */
    public String getChargeMode() {
        return chargeMode;
    }

    /**
     * 充电方式
     * @param chargeMode 充电方式
     */
    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode == null ? null : chargeMode.trim();
    }

    /**
     * 驱动电机布置型式/位置
     * @return powerDevicePlace 驱动电机布置型式/位置
     */
    public String getPowerDevicePlace() {
        return powerDevicePlace;
    }

    /**
     * 驱动电机布置型式/位置
     * @param powerDevicePlace 驱动电机布置型式/位置
     */
    public void setPowerDevicePlace(String powerDevicePlace) {
        this.powerDevicePlace = powerDevicePlace == null ? null : powerDevicePlace.trim();
    }

    /**
     * 车载充电机
     * @return charger 车载充电机
     */
    public String getCharger() {
        return charger;
    }

    /**
     * 车载充电机
     * @param charger 车载充电机
     */
    public void setCharger(String charger) {
        this.charger = charger == null ? null : charger.trim();
    }

    /**
     * 生产企业
     * @return companyId 生产企业
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * 生产企业
     * @param companyId 生产企业
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * 储能装置
     * @return powerDeviceId 储能装置
     */
    public Long getPowerDeviceId() {
        return powerDeviceId;
    }

    /**
     * 储能装置
     * @param powerDeviceId 储能装置
     */
    public void setPowerDeviceId(Long powerDeviceId) {
        this.powerDeviceId = powerDeviceId;
    }

    /**
     * 驱动电机
     * @return driveMotorId 驱动电机
     */
    public Long getDriveMotorId() {
        return driveMotorId;
    }

    /**
     * 驱动电机
     * @param driveMotorId 驱动电机
     */
    public void setDriveMotorId(Long driveMotorId) {
        this.driveMotorId = driveMotorId;
    }

    /**
     * 纯电工况法续航里程(KM)
     * @return electricEndurance 纯电工况法续航里程(KM)
     */
    public Integer getElectricEndurance() {
        return electricEndurance;
    }

    /**
     * 纯电工况法续航里程(KM)
     * @param electricEndurance 纯电工况法续航里程(KM)
     */
    public void setElectricEndurance(Integer electricEndurance) {
        this.electricEndurance = electricEndurance;
    }

    /**
     * 匀速法续航里程(KM)
     * @return uniformSpeedEndurance 匀速法续航里程(KM)
     */
    public Integer getUniformSpeedEndurance() {
        return uniformSpeedEndurance;
    }

    /**
     * 匀速法续航里程(KM)
     * @param uniformSpeedEndurance 匀速法续航里程(KM)
     */
    public void setUniformSpeedEndurance(Integer uniformSpeedEndurance) {
        this.uniformSpeedEndurance = uniformSpeedEndurance;
    }

    /**
     * 整车质保期(万公里)
     * @return guaranteeMileage 整车质保期(万公里)
     */
    public Integer getGuaranteeMileage() {
        return guaranteeMileage;
    }

    /**
     * 整车质保期(万公里)
     * @param guaranteeMileage 整车质保期(万公里)
     */
    public void setGuaranteeMileage(Integer guaranteeMileage) {
        this.guaranteeMileage = guaranteeMileage;
    }

    /**
     * 整车质保期(年)
     * @return guaranteeYear 整车质保期(年)
     */
    public Integer getGuaranteeYear() {
        return guaranteeYear;
    }

    /**
     * 整车质保期(年)
     * @param guaranteeYear 整车质保期(年)
     */
    public void setGuaranteeYear(Integer guaranteeYear) {
        this.guaranteeYear = guaranteeYear;
    }

    /**
     * 准载人数(人)
     * @return carrierCount 准载人数(人)
     */
    public Integer getCarrierCount() {
        return carrierCount;
    }

    /**
     * 准载人数(人)
     * @param carrierCount 准载人数(人)
     */
    public void setCarrierCount(Integer carrierCount) {
        this.carrierCount = carrierCount;
    }

    /**
     * 总质量(KG)
     * @return totalWeight 总质量(KG)
     */
    public Integer getTotalWeight() {
        return totalWeight;
    }

    /**
     * 总质量(KG)
     * @param totalWeight 总质量(KG)
     */
    public void setTotalWeight(Integer totalWeight) {
        this.totalWeight = totalWeight;
    }

    /**
     * 整备质量(KG)
     * @return curbWeight 整备质量(KG)
     */
    public Integer getCurbWeight() {
        return curbWeight;
    }

    /**
     * 整备质量(KG)
     * @param curbWeight 整备质量(KG)
     */
    public void setCurbWeight(Integer curbWeight) {
        this.curbWeight = curbWeight;
    }

    /**
     * 最高车速(KM/H)
     * @return maxSpeed 最高车速(KM/H)
     */
    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * 最高车速(KM/H)
     * @param maxSpeed 最高车速(KM/H)
     */
    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * 各档位传动比
     * @return transmitRatio 各档位传动比
     */
    public BigDecimal getTransmitRatio() {
        return transmitRatio;
    }

    /**
     * 各档位传动比
     * @param transmitRatio 各档位传动比
     */
    public void setTransmitRatio(BigDecimal transmitRatio) {
        this.transmitRatio = transmitRatio;
    }

    /**
     * 能量回收装置类型
     * @return energyRecoveryType 能量回收装置类型
     */
    public Byte getEnergyRecoveryType() {
        return energyRecoveryType;
    }

    /**
     * 能量回收装置类型
     * @param energyRecoveryType 能量回收装置类型
     */
    public void setEnergyRecoveryType(Byte energyRecoveryType) {
        this.energyRecoveryType = energyRecoveryType;
    }

    /**
     * 上市时间
     * @return listingTime 上市时间
     */
    public Date getListingTime() {
        return listingTime;
    }

    /**
     * 上市时间
     * @param listingTime 上市时间
     */
    public void setListingTime(Date listingTime) {
        this.listingTime = listingTime;
    }

    /**
     * 长(mm)
     * @return sizeLength 长(mm)
     */
    public Integer getSizeLength() {
        return sizeLength;
    }

    /**
     * 长(mm)
     * @param sizeLength 长(mm)
     */
    public void setSizeLength(Integer sizeLength) {
        this.sizeLength = sizeLength;
    }

    /**
     * 宽(mm)
     * @return sizeWidth 宽(mm)
     */
    public Integer getSizeWidth() {
        return sizeWidth;
    }

    /**
     * 宽(mm)
     * @param sizeWidth 宽(mm)
     */
    public void setSizeWidth(Integer sizeWidth) {
        this.sizeWidth = sizeWidth;
    }

    /**
     * 高(mm)
     * @return sizeHeight 高(mm)
     */
    public Integer getSizeHeight() {
        return sizeHeight;
    }

    /**
     * 高(mm)
     * @param sizeHeight 高(mm)
     */
    public void setSizeHeight(Integer sizeHeight) {
        this.sizeHeight = sizeHeight;
    }

    /**
     * 轴距
     * @return wheelBase 轴距
     */
    public Integer getWheelBase() {
        return wheelBase;
    }

    /**
     * 轴距
     * @param wheelBase 轴距
     */
    public void setWheelBase(Integer wheelBase) {
        this.wheelBase = wheelBase;
    }

    /**
     * 百公里加速时间
     * @return hundredKmAcceleration 百公里加速时间
     */
    public Integer getHundredKmAcceleration() {
        return hundredKmAcceleration;
    }

    /**
     * 百公里加速时间
     * @param hundredKmAcceleration 百公里加速时间
     */
    public void setHundredKmAcceleration(Integer hundredKmAcceleration) {
        this.hundredKmAcceleration = hundredKmAcceleration;
    }

    /**
     * 百公里电耗
     * @return hundredKmPowerconsump 百公里电耗
     */
    public Integer getHundredKmPowerconsump() {
        return hundredKmPowerconsump;
    }

    /**
     * 百公里电耗
     * @param hundredKmPowerconsump 百公里电耗
     */
    public void setHundredKmPowerconsump(Integer hundredKmPowerconsump) {
        this.hundredKmPowerconsump = hundredKmPowerconsump;
    }

    /**
     * 状态
     * @return status 状态
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 添加时间
     * @return addTime 添加时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 添加时间
     * @param addTime 添加时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 修改时间
     * @return updateTime 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
package com.qy.entity;

import java.util.Date;

public class QmCmDef {
    private Long id;

    private Long cmId;

    private Long defId;

    private String executionGb;

    private String stType;

    private String stDes;

    private Date stStartTime;

    private Date stEndTime;

    private Long ver;

    private String stValue1;

    private String stValue2;

    private String stValue3;

    private String stValue4;

    private String stMethod;

    private Short isExamine;

    private String remark;

    private Long createUserId;

    private Date createTime;

    private Long modifyUserId;

    private Date modifyTime;

    private Short isDel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCmId() {
        return cmId;
    }

    public void setCmId(Long cmId) {
        this.cmId = cmId;
    }

    public Long getDefId() {
        return defId;
    }

    public void setDefId(Long defId) {
        this.defId = defId;
    }

    public String getExecutionGb() {
        return executionGb;
    }

    public void setExecutionGb(String executionGb) {
        this.executionGb = executionGb == null ? null : executionGb.trim();
    }

    public String getStType() {
        return stType;
    }

    public void setStType(String stType) {
        this.stType = stType == null ? null : stType.trim();
    }

    public String getStDes() {
        return stDes;
    }

    public void setStDes(String stDes) {
        this.stDes = stDes == null ? null : stDes.trim();
    }

    public Date getStStartTime() {
        return stStartTime;
    }

    public void setStStartTime(Date stStartTime) {
        this.stStartTime = stStartTime;
    }

    public Date getStEndTime() {
        return stEndTime;
    }

    public void setStEndTime(Date stEndTime) {
        this.stEndTime = stEndTime;
    }

    public Long getVer() {
        return ver;
    }

    public void setVer(Long ver) {
        this.ver = ver;
    }

    public String getStValue1() {
        return stValue1;
    }

    public void setStValue1(String stValue1) {
        this.stValue1 = stValue1 == null ? null : stValue1.trim();
    }

    public String getStValue2() {
        return stValue2;
    }

    public void setStValue2(String stValue2) {
        this.stValue2 = stValue2 == null ? null : stValue2.trim();
    }

    public String getStValue3() {
        return stValue3;
    }

    public void setStValue3(String stValue3) {
        this.stValue3 = stValue3 == null ? null : stValue3.trim();
    }

    public String getStValue4() {
        return stValue4;
    }

    public void setStValue4(String stValue4) {
        this.stValue4 = stValue4 == null ? null : stValue4.trim();
    }

    public String getStMethod() {
        return stMethod;
    }

    public void setStMethod(String stMethod) {
        this.stMethod = stMethod == null ? null : stMethod.trim();
    }

    public Short getIsExamine() {
        return isExamine;
    }

    public void setIsExamine(Short isExamine) {
        this.isExamine = isExamine;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(Long modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Short getIsDel() {
        return isDel;
    }

    public void setIsDel(Short isDel) {
        this.isDel = isDel;
    }
}
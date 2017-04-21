package com.drpeng.domain;

import java.io.Serializable;
import java.util.Date;

public class SecOperator implements Serializable {
    private Integer operatorId;

    private Integer staffId;

    private String code;

    private String password;

    private Integer securityId;

    private String recentPassword;

    private Integer recentPassTimes;

    private String allowChangePassword;

    private Date acctEffectDate;

    private Date acctExpireDate;

    private Integer lastLoginLogId;

    private Integer tryTimes;

    private String lockFlag;

    private Short loginChannel;

    private Date passwordValidDate;

    private Integer chgPasswdAlarmDays;

    private String ipmacFlag;

    private Long isVpnLoginFlag;

    private Integer chgPasswdFlag;

    private String isLogin;

    private String notes;

    private Integer cancelDays;

    private Integer state;

    private Integer doneCode;

    private Date createDate;

    private Date doneDate;

    private Date validDate;

    private Date expireDate;

    private Integer opId;

    private Integer orgId;

    private String isAdmin;

    private static final long serialVersionUID = 1L;

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getSecurityId() {
        return securityId;
    }

    public void setSecurityId(Integer securityId) {
        this.securityId = securityId;
    }

    public String getRecentPassword() {
        return recentPassword;
    }

    public void setRecentPassword(String recentPassword) {
        this.recentPassword = recentPassword == null ? null : recentPassword.trim();
    }

    public Integer getRecentPassTimes() {
        return recentPassTimes;
    }

    public void setRecentPassTimes(Integer recentPassTimes) {
        this.recentPassTimes = recentPassTimes;
    }

    public String getAllowChangePassword() {
        return allowChangePassword;
    }

    public void setAllowChangePassword(String allowChangePassword) {
        this.allowChangePassword = allowChangePassword == null ? null : allowChangePassword.trim();
    }

    public Date getAcctEffectDate() {
        return acctEffectDate;
    }

    public void setAcctEffectDate(Date acctEffectDate) {
        this.acctEffectDate = acctEffectDate;
    }

    public Date getAcctExpireDate() {
        return acctExpireDate;
    }

    public void setAcctExpireDate(Date acctExpireDate) {
        this.acctExpireDate = acctExpireDate;
    }

    public Integer getLastLoginLogId() {
        return lastLoginLogId;
    }

    public void setLastLoginLogId(Integer lastLoginLogId) {
        this.lastLoginLogId = lastLoginLogId;
    }

    public Integer getTryTimes() {
        return tryTimes;
    }

    public void setTryTimes(Integer tryTimes) {
        this.tryTimes = tryTimes;
    }

    public String getLockFlag() {
        return lockFlag;
    }

    public void setLockFlag(String lockFlag) {
        this.lockFlag = lockFlag == null ? null : lockFlag.trim();
    }

    public Short getLoginChannel() {
        return loginChannel;
    }

    public void setLoginChannel(Short loginChannel) {
        this.loginChannel = loginChannel;
    }

    public Date getPasswordValidDate() {
        return passwordValidDate;
    }

    public void setPasswordValidDate(Date passwordValidDate) {
        this.passwordValidDate = passwordValidDate;
    }

    public Integer getChgPasswdAlarmDays() {
        return chgPasswdAlarmDays;
    }

    public void setChgPasswdAlarmDays(Integer chgPasswdAlarmDays) {
        this.chgPasswdAlarmDays = chgPasswdAlarmDays;
    }

    public String getIpmacFlag() {
        return ipmacFlag;
    }

    public void setIpmacFlag(String ipmacFlag) {
        this.ipmacFlag = ipmacFlag == null ? null : ipmacFlag.trim();
    }

    public Long getIsVpnLoginFlag() {
        return isVpnLoginFlag;
    }

    public void setIsVpnLoginFlag(Long isVpnLoginFlag) {
        this.isVpnLoginFlag = isVpnLoginFlag;
    }

    public Integer getChgPasswdFlag() {
        return chgPasswdFlag;
    }

    public void setChgPasswdFlag(Integer chgPasswdFlag) {
        this.chgPasswdFlag = chgPasswdFlag;
    }

    public String getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(String isLogin) {
        this.isLogin = isLogin == null ? null : isLogin.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Integer getCancelDays() {
        return cancelDays;
    }

    public void setCancelDays(Integer cancelDays) {
        this.cancelDays = cancelDays;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDoneCode() {
        return doneCode;
    }

    public void setDoneCode(Integer doneCode) {
        this.doneCode = doneCode;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getDoneDate() {
        return doneDate;
    }

    public void setDoneDate(Date doneDate) {
        this.doneDate = doneDate;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Integer getOpId() {
        return opId;
    }

    public void setOpId(Integer opId) {
        this.opId = opId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin == null ? null : isAdmin.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SecOperator other = (SecOperator) that;
        return (this.getOperatorId() == null ? other.getOperatorId() == null : this.getOperatorId().equals(other.getOperatorId()))
            && (this.getStaffId() == null ? other.getStaffId() == null : this.getStaffId().equals(other.getStaffId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getSecurityId() == null ? other.getSecurityId() == null : this.getSecurityId().equals(other.getSecurityId()))
            && (this.getRecentPassword() == null ? other.getRecentPassword() == null : this.getRecentPassword().equals(other.getRecentPassword()))
            && (this.getRecentPassTimes() == null ? other.getRecentPassTimes() == null : this.getRecentPassTimes().equals(other.getRecentPassTimes()))
            && (this.getAllowChangePassword() == null ? other.getAllowChangePassword() == null : this.getAllowChangePassword().equals(other.getAllowChangePassword()))
            && (this.getAcctEffectDate() == null ? other.getAcctEffectDate() == null : this.getAcctEffectDate().equals(other.getAcctEffectDate()))
            && (this.getAcctExpireDate() == null ? other.getAcctExpireDate() == null : this.getAcctExpireDate().equals(other.getAcctExpireDate()))
            && (this.getLastLoginLogId() == null ? other.getLastLoginLogId() == null : this.getLastLoginLogId().equals(other.getLastLoginLogId()))
            && (this.getTryTimes() == null ? other.getTryTimes() == null : this.getTryTimes().equals(other.getTryTimes()))
            && (this.getLockFlag() == null ? other.getLockFlag() == null : this.getLockFlag().equals(other.getLockFlag()))
            && (this.getLoginChannel() == null ? other.getLoginChannel() == null : this.getLoginChannel().equals(other.getLoginChannel()))
            && (this.getPasswordValidDate() == null ? other.getPasswordValidDate() == null : this.getPasswordValidDate().equals(other.getPasswordValidDate()))
            && (this.getChgPasswdAlarmDays() == null ? other.getChgPasswdAlarmDays() == null : this.getChgPasswdAlarmDays().equals(other.getChgPasswdAlarmDays()))
            && (this.getIpmacFlag() == null ? other.getIpmacFlag() == null : this.getIpmacFlag().equals(other.getIpmacFlag()))
            && (this.getIsVpnLoginFlag() == null ? other.getIsVpnLoginFlag() == null : this.getIsVpnLoginFlag().equals(other.getIsVpnLoginFlag()))
            && (this.getChgPasswdFlag() == null ? other.getChgPasswdFlag() == null : this.getChgPasswdFlag().equals(other.getChgPasswdFlag()))
            && (this.getIsLogin() == null ? other.getIsLogin() == null : this.getIsLogin().equals(other.getIsLogin()))
            && (this.getNotes() == null ? other.getNotes() == null : this.getNotes().equals(other.getNotes()))
            && (this.getCancelDays() == null ? other.getCancelDays() == null : this.getCancelDays().equals(other.getCancelDays()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getDoneCode() == null ? other.getDoneCode() == null : this.getDoneCode().equals(other.getDoneCode()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getDoneDate() == null ? other.getDoneDate() == null : this.getDoneDate().equals(other.getDoneDate()))
            && (this.getValidDate() == null ? other.getValidDate() == null : this.getValidDate().equals(other.getValidDate()))
            && (this.getExpireDate() == null ? other.getExpireDate() == null : this.getExpireDate().equals(other.getExpireDate()))
            && (this.getOpId() == null ? other.getOpId() == null : this.getOpId().equals(other.getOpId()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getIsAdmin() == null ? other.getIsAdmin() == null : this.getIsAdmin().equals(other.getIsAdmin()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOperatorId() == null) ? 0 : getOperatorId().hashCode());
        result = prime * result + ((getStaffId() == null) ? 0 : getStaffId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getSecurityId() == null) ? 0 : getSecurityId().hashCode());
        result = prime * result + ((getRecentPassword() == null) ? 0 : getRecentPassword().hashCode());
        result = prime * result + ((getRecentPassTimes() == null) ? 0 : getRecentPassTimes().hashCode());
        result = prime * result + ((getAllowChangePassword() == null) ? 0 : getAllowChangePassword().hashCode());
        result = prime * result + ((getAcctEffectDate() == null) ? 0 : getAcctEffectDate().hashCode());
        result = prime * result + ((getAcctExpireDate() == null) ? 0 : getAcctExpireDate().hashCode());
        result = prime * result + ((getLastLoginLogId() == null) ? 0 : getLastLoginLogId().hashCode());
        result = prime * result + ((getTryTimes() == null) ? 0 : getTryTimes().hashCode());
        result = prime * result + ((getLockFlag() == null) ? 0 : getLockFlag().hashCode());
        result = prime * result + ((getLoginChannel() == null) ? 0 : getLoginChannel().hashCode());
        result = prime * result + ((getPasswordValidDate() == null) ? 0 : getPasswordValidDate().hashCode());
        result = prime * result + ((getChgPasswdAlarmDays() == null) ? 0 : getChgPasswdAlarmDays().hashCode());
        result = prime * result + ((getIpmacFlag() == null) ? 0 : getIpmacFlag().hashCode());
        result = prime * result + ((getIsVpnLoginFlag() == null) ? 0 : getIsVpnLoginFlag().hashCode());
        result = prime * result + ((getChgPasswdFlag() == null) ? 0 : getChgPasswdFlag().hashCode());
        result = prime * result + ((getIsLogin() == null) ? 0 : getIsLogin().hashCode());
        result = prime * result + ((getNotes() == null) ? 0 : getNotes().hashCode());
        result = prime * result + ((getCancelDays() == null) ? 0 : getCancelDays().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getDoneCode() == null) ? 0 : getDoneCode().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getDoneDate() == null) ? 0 : getDoneDate().hashCode());
        result = prime * result + ((getValidDate() == null) ? 0 : getValidDate().hashCode());
        result = prime * result + ((getExpireDate() == null) ? 0 : getExpireDate().hashCode());
        result = prime * result + ((getOpId() == null) ? 0 : getOpId().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getIsAdmin() == null) ? 0 : getIsAdmin().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", operatorId=").append(operatorId);
        sb.append(", staffId=").append(staffId);
        sb.append(", code=").append(code);
        sb.append(", password=").append(password);
        sb.append(", securityId=").append(securityId);
        sb.append(", recentPassword=").append(recentPassword);
        sb.append(", recentPassTimes=").append(recentPassTimes);
        sb.append(", allowChangePassword=").append(allowChangePassword);
        sb.append(", acctEffectDate=").append(acctEffectDate);
        sb.append(", acctExpireDate=").append(acctExpireDate);
        sb.append(", lastLoginLogId=").append(lastLoginLogId);
        sb.append(", tryTimes=").append(tryTimes);
        sb.append(", lockFlag=").append(lockFlag);
        sb.append(", loginChannel=").append(loginChannel);
        sb.append(", passwordValidDate=").append(passwordValidDate);
        sb.append(", chgPasswdAlarmDays=").append(chgPasswdAlarmDays);
        sb.append(", ipmacFlag=").append(ipmacFlag);
        sb.append(", isVpnLoginFlag=").append(isVpnLoginFlag);
        sb.append(", chgPasswdFlag=").append(chgPasswdFlag);
        sb.append(", isLogin=").append(isLogin);
        sb.append(", notes=").append(notes);
        sb.append(", cancelDays=").append(cancelDays);
        sb.append(", state=").append(state);
        sb.append(", doneCode=").append(doneCode);
        sb.append(", createDate=").append(createDate);
        sb.append(", doneDate=").append(doneDate);
        sb.append(", validDate=").append(validDate);
        sb.append(", expireDate=").append(expireDate);
        sb.append(", opId=").append(opId);
        sb.append(", orgId=").append(orgId);
        sb.append(", isAdmin=").append(isAdmin);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
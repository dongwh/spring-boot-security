package com.drpeng.domain;

import java.io.Serializable;
import java.util.Date;

public class SecFunction implements Serializable {
    private Integer funcId;

    private Integer entClassId;

    private String funcCode;

    private String name;

    private String notes;

    private Integer parentId;

    private Integer funSeq;

    private String viewname;

    private String dllPathdll;

    private String funcImg;

    private String funcArg;

    private String funcType;

    private Integer state;

    private Integer doneCode;

    private Date createDate;

    private Date doneDate;

    private Date validDate;

    private Date expireDate;

    private Integer opId;

    private Integer orgId;

    private static final long serialVersionUID = 1L;

    public Integer getFuncId() {
        return funcId;
    }

    public void setFuncId(Integer funcId) {
        this.funcId = funcId;
    }

    public Integer getEntClassId() {
        return entClassId;
    }

    public void setEntClassId(Integer entClassId) {
        this.entClassId = entClassId;
    }

    public String getFuncCode() {
        return funcCode;
    }

    public void setFuncCode(String funcCode) {
        this.funcCode = funcCode == null ? null : funcCode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getFunSeq() {
        return funSeq;
    }

    public void setFunSeq(Integer funSeq) {
        this.funSeq = funSeq;
    }

    public String getViewname() {
        return viewname;
    }

    public void setViewname(String viewname) {
        this.viewname = viewname == null ? null : viewname.trim();
    }

    public String getDllPathdll() {
        return dllPathdll;
    }

    public void setDllPathdll(String dllPathdll) {
        this.dllPathdll = dllPathdll == null ? null : dllPathdll.trim();
    }

    public String getFuncImg() {
        return funcImg;
    }

    public void setFuncImg(String funcImg) {
        this.funcImg = funcImg == null ? null : funcImg.trim();
    }

    public String getFuncArg() {
        return funcArg;
    }

    public void setFuncArg(String funcArg) {
        this.funcArg = funcArg == null ? null : funcArg.trim();
    }

    public String getFuncType() {
        return funcType;
    }

    public void setFuncType(String funcType) {
        this.funcType = funcType == null ? null : funcType.trim();
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
        SecFunction other = (SecFunction) that;
        return (this.getFuncId() == null ? other.getFuncId() == null : this.getFuncId().equals(other.getFuncId()))
            && (this.getEntClassId() == null ? other.getEntClassId() == null : this.getEntClassId().equals(other.getEntClassId()))
            && (this.getFuncCode() == null ? other.getFuncCode() == null : this.getFuncCode().equals(other.getFuncCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getNotes() == null ? other.getNotes() == null : this.getNotes().equals(other.getNotes()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getFunSeq() == null ? other.getFunSeq() == null : this.getFunSeq().equals(other.getFunSeq()))
            && (this.getViewname() == null ? other.getViewname() == null : this.getViewname().equals(other.getViewname()))
            && (this.getDllPathdll() == null ? other.getDllPathdll() == null : this.getDllPathdll().equals(other.getDllPathdll()))
            && (this.getFuncImg() == null ? other.getFuncImg() == null : this.getFuncImg().equals(other.getFuncImg()))
            && (this.getFuncArg() == null ? other.getFuncArg() == null : this.getFuncArg().equals(other.getFuncArg()))
            && (this.getFuncType() == null ? other.getFuncType() == null : this.getFuncType().equals(other.getFuncType()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getDoneCode() == null ? other.getDoneCode() == null : this.getDoneCode().equals(other.getDoneCode()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getDoneDate() == null ? other.getDoneDate() == null : this.getDoneDate().equals(other.getDoneDate()))
            && (this.getValidDate() == null ? other.getValidDate() == null : this.getValidDate().equals(other.getValidDate()))
            && (this.getExpireDate() == null ? other.getExpireDate() == null : this.getExpireDate().equals(other.getExpireDate()))
            && (this.getOpId() == null ? other.getOpId() == null : this.getOpId().equals(other.getOpId()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFuncId() == null) ? 0 : getFuncId().hashCode());
        result = prime * result + ((getEntClassId() == null) ? 0 : getEntClassId().hashCode());
        result = prime * result + ((getFuncCode() == null) ? 0 : getFuncCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getNotes() == null) ? 0 : getNotes().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getFunSeq() == null) ? 0 : getFunSeq().hashCode());
        result = prime * result + ((getViewname() == null) ? 0 : getViewname().hashCode());
        result = prime * result + ((getDllPathdll() == null) ? 0 : getDllPathdll().hashCode());
        result = prime * result + ((getFuncImg() == null) ? 0 : getFuncImg().hashCode());
        result = prime * result + ((getFuncArg() == null) ? 0 : getFuncArg().hashCode());
        result = prime * result + ((getFuncType() == null) ? 0 : getFuncType().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getDoneCode() == null) ? 0 : getDoneCode().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getDoneDate() == null) ? 0 : getDoneDate().hashCode());
        result = prime * result + ((getValidDate() == null) ? 0 : getValidDate().hashCode());
        result = prime * result + ((getExpireDate() == null) ? 0 : getExpireDate().hashCode());
        result = prime * result + ((getOpId() == null) ? 0 : getOpId().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", funcId=").append(funcId);
        sb.append(", entClassId=").append(entClassId);
        sb.append(", funcCode=").append(funcCode);
        sb.append(", name=").append(name);
        sb.append(", notes=").append(notes);
        sb.append(", parentId=").append(parentId);
        sb.append(", funSeq=").append(funSeq);
        sb.append(", viewname=").append(viewname);
        sb.append(", dllPathdll=").append(dllPathdll);
        sb.append(", funcImg=").append(funcImg);
        sb.append(", funcArg=").append(funcArg);
        sb.append(", funcType=").append(funcType);
        sb.append(", state=").append(state);
        sb.append(", doneCode=").append(doneCode);
        sb.append(", createDate=").append(createDate);
        sb.append(", doneDate=").append(doneDate);
        sb.append(", validDate=").append(validDate);
        sb.append(", expireDate=").append(expireDate);
        sb.append(", opId=").append(opId);
        sb.append(", orgId=").append(orgId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
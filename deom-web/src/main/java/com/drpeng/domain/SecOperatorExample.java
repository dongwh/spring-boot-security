package com.drpeng.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SecOperatorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SecOperatorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("OPERATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("OPERATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(Integer value) {
            addCriterion("OPERATOR_ID =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(Integer value) {
            addCriterion("OPERATOR_ID <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(Integer value) {
            addCriterion("OPERATOR_ID >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OPERATOR_ID >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(Integer value) {
            addCriterion("OPERATOR_ID <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("OPERATOR_ID <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<Integer> values) {
            addCriterion("OPERATOR_ID in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<Integer> values) {
            addCriterion("OPERATOR_ID not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(Integer value1, Integer value2) {
            addCriterion("OPERATOR_ID between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OPERATOR_ID not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("STAFF_ID is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("STAFF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("STAFF_ID =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("STAFF_ID <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("STAFF_ID >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STAFF_ID >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("STAFF_ID <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("STAFF_ID <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("STAFF_ID in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("STAFF_ID not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("STAFF_ID between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STAFF_ID not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSecurityIdIsNull() {
            addCriterion("SECURITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andSecurityIdIsNotNull() {
            addCriterion("SECURITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityIdEqualTo(Integer value) {
            addCriterion("SECURITY_ID =", value, "securityId");
            return (Criteria) this;
        }

        public Criteria andSecurityIdNotEqualTo(Integer value) {
            addCriterion("SECURITY_ID <>", value, "securityId");
            return (Criteria) this;
        }

        public Criteria andSecurityIdGreaterThan(Integer value) {
            addCriterion("SECURITY_ID >", value, "securityId");
            return (Criteria) this;
        }

        public Criteria andSecurityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SECURITY_ID >=", value, "securityId");
            return (Criteria) this;
        }

        public Criteria andSecurityIdLessThan(Integer value) {
            addCriterion("SECURITY_ID <", value, "securityId");
            return (Criteria) this;
        }

        public Criteria andSecurityIdLessThanOrEqualTo(Integer value) {
            addCriterion("SECURITY_ID <=", value, "securityId");
            return (Criteria) this;
        }

        public Criteria andSecurityIdIn(List<Integer> values) {
            addCriterion("SECURITY_ID in", values, "securityId");
            return (Criteria) this;
        }

        public Criteria andSecurityIdNotIn(List<Integer> values) {
            addCriterion("SECURITY_ID not in", values, "securityId");
            return (Criteria) this;
        }

        public Criteria andSecurityIdBetween(Integer value1, Integer value2) {
            addCriterion("SECURITY_ID between", value1, value2, "securityId");
            return (Criteria) this;
        }

        public Criteria andSecurityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SECURITY_ID not between", value1, value2, "securityId");
            return (Criteria) this;
        }

        public Criteria andRecentPasswordIsNull() {
            addCriterion("RECENT_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andRecentPasswordIsNotNull() {
            addCriterion("RECENT_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andRecentPasswordEqualTo(String value) {
            addCriterion("RECENT_PASSWORD =", value, "recentPassword");
            return (Criteria) this;
        }

        public Criteria andRecentPasswordNotEqualTo(String value) {
            addCriterion("RECENT_PASSWORD <>", value, "recentPassword");
            return (Criteria) this;
        }

        public Criteria andRecentPasswordGreaterThan(String value) {
            addCriterion("RECENT_PASSWORD >", value, "recentPassword");
            return (Criteria) this;
        }

        public Criteria andRecentPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("RECENT_PASSWORD >=", value, "recentPassword");
            return (Criteria) this;
        }

        public Criteria andRecentPasswordLessThan(String value) {
            addCriterion("RECENT_PASSWORD <", value, "recentPassword");
            return (Criteria) this;
        }

        public Criteria andRecentPasswordLessThanOrEqualTo(String value) {
            addCriterion("RECENT_PASSWORD <=", value, "recentPassword");
            return (Criteria) this;
        }

        public Criteria andRecentPasswordLike(String value) {
            addCriterion("RECENT_PASSWORD like", value, "recentPassword");
            return (Criteria) this;
        }

        public Criteria andRecentPasswordNotLike(String value) {
            addCriterion("RECENT_PASSWORD not like", value, "recentPassword");
            return (Criteria) this;
        }

        public Criteria andRecentPasswordIn(List<String> values) {
            addCriterion("RECENT_PASSWORD in", values, "recentPassword");
            return (Criteria) this;
        }

        public Criteria andRecentPasswordNotIn(List<String> values) {
            addCriterion("RECENT_PASSWORD not in", values, "recentPassword");
            return (Criteria) this;
        }

        public Criteria andRecentPasswordBetween(String value1, String value2) {
            addCriterion("RECENT_PASSWORD between", value1, value2, "recentPassword");
            return (Criteria) this;
        }

        public Criteria andRecentPasswordNotBetween(String value1, String value2) {
            addCriterion("RECENT_PASSWORD not between", value1, value2, "recentPassword");
            return (Criteria) this;
        }

        public Criteria andRecentPassTimesIsNull() {
            addCriterion("RECENT_PASS_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andRecentPassTimesIsNotNull() {
            addCriterion("RECENT_PASS_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andRecentPassTimesEqualTo(Integer value) {
            addCriterion("RECENT_PASS_TIMES =", value, "recentPassTimes");
            return (Criteria) this;
        }

        public Criteria andRecentPassTimesNotEqualTo(Integer value) {
            addCriterion("RECENT_PASS_TIMES <>", value, "recentPassTimes");
            return (Criteria) this;
        }

        public Criteria andRecentPassTimesGreaterThan(Integer value) {
            addCriterion("RECENT_PASS_TIMES >", value, "recentPassTimes");
            return (Criteria) this;
        }

        public Criteria andRecentPassTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("RECENT_PASS_TIMES >=", value, "recentPassTimes");
            return (Criteria) this;
        }

        public Criteria andRecentPassTimesLessThan(Integer value) {
            addCriterion("RECENT_PASS_TIMES <", value, "recentPassTimes");
            return (Criteria) this;
        }

        public Criteria andRecentPassTimesLessThanOrEqualTo(Integer value) {
            addCriterion("RECENT_PASS_TIMES <=", value, "recentPassTimes");
            return (Criteria) this;
        }

        public Criteria andRecentPassTimesIn(List<Integer> values) {
            addCriterion("RECENT_PASS_TIMES in", values, "recentPassTimes");
            return (Criteria) this;
        }

        public Criteria andRecentPassTimesNotIn(List<Integer> values) {
            addCriterion("RECENT_PASS_TIMES not in", values, "recentPassTimes");
            return (Criteria) this;
        }

        public Criteria andRecentPassTimesBetween(Integer value1, Integer value2) {
            addCriterion("RECENT_PASS_TIMES between", value1, value2, "recentPassTimes");
            return (Criteria) this;
        }

        public Criteria andRecentPassTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("RECENT_PASS_TIMES not between", value1, value2, "recentPassTimes");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswordIsNull() {
            addCriterion("ALLOW_CHANGE_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswordIsNotNull() {
            addCriterion("ALLOW_CHANGE_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswordEqualTo(String value) {
            addCriterion("ALLOW_CHANGE_PASSWORD =", value, "allowChangePassword");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswordNotEqualTo(String value) {
            addCriterion("ALLOW_CHANGE_PASSWORD <>", value, "allowChangePassword");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswordGreaterThan(String value) {
            addCriterion("ALLOW_CHANGE_PASSWORD >", value, "allowChangePassword");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOW_CHANGE_PASSWORD >=", value, "allowChangePassword");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswordLessThan(String value) {
            addCriterion("ALLOW_CHANGE_PASSWORD <", value, "allowChangePassword");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswordLessThanOrEqualTo(String value) {
            addCriterion("ALLOW_CHANGE_PASSWORD <=", value, "allowChangePassword");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswordLike(String value) {
            addCriterion("ALLOW_CHANGE_PASSWORD like", value, "allowChangePassword");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswordNotLike(String value) {
            addCriterion("ALLOW_CHANGE_PASSWORD not like", value, "allowChangePassword");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswordIn(List<String> values) {
            addCriterion("ALLOW_CHANGE_PASSWORD in", values, "allowChangePassword");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswordNotIn(List<String> values) {
            addCriterion("ALLOW_CHANGE_PASSWORD not in", values, "allowChangePassword");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswordBetween(String value1, String value2) {
            addCriterion("ALLOW_CHANGE_PASSWORD between", value1, value2, "allowChangePassword");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswordNotBetween(String value1, String value2) {
            addCriterion("ALLOW_CHANGE_PASSWORD not between", value1, value2, "allowChangePassword");
            return (Criteria) this;
        }

        public Criteria andAcctEffectDateIsNull() {
            addCriterion("ACCT_EFFECT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAcctEffectDateIsNotNull() {
            addCriterion("ACCT_EFFECT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAcctEffectDateEqualTo(Date value) {
            addCriterion("ACCT_EFFECT_DATE =", value, "acctEffectDate");
            return (Criteria) this;
        }

        public Criteria andAcctEffectDateNotEqualTo(Date value) {
            addCriterion("ACCT_EFFECT_DATE <>", value, "acctEffectDate");
            return (Criteria) this;
        }

        public Criteria andAcctEffectDateGreaterThan(Date value) {
            addCriterion("ACCT_EFFECT_DATE >", value, "acctEffectDate");
            return (Criteria) this;
        }

        public Criteria andAcctEffectDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ACCT_EFFECT_DATE >=", value, "acctEffectDate");
            return (Criteria) this;
        }

        public Criteria andAcctEffectDateLessThan(Date value) {
            addCriterion("ACCT_EFFECT_DATE <", value, "acctEffectDate");
            return (Criteria) this;
        }

        public Criteria andAcctEffectDateLessThanOrEqualTo(Date value) {
            addCriterion("ACCT_EFFECT_DATE <=", value, "acctEffectDate");
            return (Criteria) this;
        }

        public Criteria andAcctEffectDateIn(List<Date> values) {
            addCriterion("ACCT_EFFECT_DATE in", values, "acctEffectDate");
            return (Criteria) this;
        }

        public Criteria andAcctEffectDateNotIn(List<Date> values) {
            addCriterion("ACCT_EFFECT_DATE not in", values, "acctEffectDate");
            return (Criteria) this;
        }

        public Criteria andAcctEffectDateBetween(Date value1, Date value2) {
            addCriterion("ACCT_EFFECT_DATE between", value1, value2, "acctEffectDate");
            return (Criteria) this;
        }

        public Criteria andAcctEffectDateNotBetween(Date value1, Date value2) {
            addCriterion("ACCT_EFFECT_DATE not between", value1, value2, "acctEffectDate");
            return (Criteria) this;
        }

        public Criteria andAcctExpireDateIsNull() {
            addCriterion("ACCT_EXPIRE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAcctExpireDateIsNotNull() {
            addCriterion("ACCT_EXPIRE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAcctExpireDateEqualTo(Date value) {
            addCriterion("ACCT_EXPIRE_DATE =", value, "acctExpireDate");
            return (Criteria) this;
        }

        public Criteria andAcctExpireDateNotEqualTo(Date value) {
            addCriterion("ACCT_EXPIRE_DATE <>", value, "acctExpireDate");
            return (Criteria) this;
        }

        public Criteria andAcctExpireDateGreaterThan(Date value) {
            addCriterion("ACCT_EXPIRE_DATE >", value, "acctExpireDate");
            return (Criteria) this;
        }

        public Criteria andAcctExpireDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ACCT_EXPIRE_DATE >=", value, "acctExpireDate");
            return (Criteria) this;
        }

        public Criteria andAcctExpireDateLessThan(Date value) {
            addCriterion("ACCT_EXPIRE_DATE <", value, "acctExpireDate");
            return (Criteria) this;
        }

        public Criteria andAcctExpireDateLessThanOrEqualTo(Date value) {
            addCriterion("ACCT_EXPIRE_DATE <=", value, "acctExpireDate");
            return (Criteria) this;
        }

        public Criteria andAcctExpireDateIn(List<Date> values) {
            addCriterion("ACCT_EXPIRE_DATE in", values, "acctExpireDate");
            return (Criteria) this;
        }

        public Criteria andAcctExpireDateNotIn(List<Date> values) {
            addCriterion("ACCT_EXPIRE_DATE not in", values, "acctExpireDate");
            return (Criteria) this;
        }

        public Criteria andAcctExpireDateBetween(Date value1, Date value2) {
            addCriterion("ACCT_EXPIRE_DATE between", value1, value2, "acctExpireDate");
            return (Criteria) this;
        }

        public Criteria andAcctExpireDateNotBetween(Date value1, Date value2) {
            addCriterion("ACCT_EXPIRE_DATE not between", value1, value2, "acctExpireDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdIsNull() {
            addCriterion("LAST_LOGIN_LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdIsNotNull() {
            addCriterion("LAST_LOGIN_LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdEqualTo(Integer value) {
            addCriterion("LAST_LOGIN_LOG_ID =", value, "lastLoginLogId");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdNotEqualTo(Integer value) {
            addCriterion("LAST_LOGIN_LOG_ID <>", value, "lastLoginLogId");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdGreaterThan(Integer value) {
            addCriterion("LAST_LOGIN_LOG_ID >", value, "lastLoginLogId");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LAST_LOGIN_LOG_ID >=", value, "lastLoginLogId");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdLessThan(Integer value) {
            addCriterion("LAST_LOGIN_LOG_ID <", value, "lastLoginLogId");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("LAST_LOGIN_LOG_ID <=", value, "lastLoginLogId");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdIn(List<Integer> values) {
            addCriterion("LAST_LOGIN_LOG_ID in", values, "lastLoginLogId");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdNotIn(List<Integer> values) {
            addCriterion("LAST_LOGIN_LOG_ID not in", values, "lastLoginLogId");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdBetween(Integer value1, Integer value2) {
            addCriterion("LAST_LOGIN_LOG_ID between", value1, value2, "lastLoginLogId");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LAST_LOGIN_LOG_ID not between", value1, value2, "lastLoginLogId");
            return (Criteria) this;
        }

        public Criteria andTryTimesIsNull() {
            addCriterion("TRY_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andTryTimesIsNotNull() {
            addCriterion("TRY_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andTryTimesEqualTo(Integer value) {
            addCriterion("TRY_TIMES =", value, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesNotEqualTo(Integer value) {
            addCriterion("TRY_TIMES <>", value, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesGreaterThan(Integer value) {
            addCriterion("TRY_TIMES >", value, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRY_TIMES >=", value, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesLessThan(Integer value) {
            addCriterion("TRY_TIMES <", value, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesLessThanOrEqualTo(Integer value) {
            addCriterion("TRY_TIMES <=", value, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesIn(List<Integer> values) {
            addCriterion("TRY_TIMES in", values, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesNotIn(List<Integer> values) {
            addCriterion("TRY_TIMES not in", values, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesBetween(Integer value1, Integer value2) {
            addCriterion("TRY_TIMES between", value1, value2, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("TRY_TIMES not between", value1, value2, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andLockFlagIsNull() {
            addCriterion("LOCK_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andLockFlagIsNotNull() {
            addCriterion("LOCK_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andLockFlagEqualTo(String value) {
            addCriterion("LOCK_FLAG =", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagNotEqualTo(String value) {
            addCriterion("LOCK_FLAG <>", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagGreaterThan(String value) {
            addCriterion("LOCK_FLAG >", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagGreaterThanOrEqualTo(String value) {
            addCriterion("LOCK_FLAG >=", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagLessThan(String value) {
            addCriterion("LOCK_FLAG <", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagLessThanOrEqualTo(String value) {
            addCriterion("LOCK_FLAG <=", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagLike(String value) {
            addCriterion("LOCK_FLAG like", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagNotLike(String value) {
            addCriterion("LOCK_FLAG not like", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagIn(List<String> values) {
            addCriterion("LOCK_FLAG in", values, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagNotIn(List<String> values) {
            addCriterion("LOCK_FLAG not in", values, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagBetween(String value1, String value2) {
            addCriterion("LOCK_FLAG between", value1, value2, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagNotBetween(String value1, String value2) {
            addCriterion("LOCK_FLAG not between", value1, value2, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLoginChannelIsNull() {
            addCriterion("LOGIN_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andLoginChannelIsNotNull() {
            addCriterion("LOGIN_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andLoginChannelEqualTo(Short value) {
            addCriterion("LOGIN_CHANNEL =", value, "loginChannel");
            return (Criteria) this;
        }

        public Criteria andLoginChannelNotEqualTo(Short value) {
            addCriterion("LOGIN_CHANNEL <>", value, "loginChannel");
            return (Criteria) this;
        }

        public Criteria andLoginChannelGreaterThan(Short value) {
            addCriterion("LOGIN_CHANNEL >", value, "loginChannel");
            return (Criteria) this;
        }

        public Criteria andLoginChannelGreaterThanOrEqualTo(Short value) {
            addCriterion("LOGIN_CHANNEL >=", value, "loginChannel");
            return (Criteria) this;
        }

        public Criteria andLoginChannelLessThan(Short value) {
            addCriterion("LOGIN_CHANNEL <", value, "loginChannel");
            return (Criteria) this;
        }

        public Criteria andLoginChannelLessThanOrEqualTo(Short value) {
            addCriterion("LOGIN_CHANNEL <=", value, "loginChannel");
            return (Criteria) this;
        }

        public Criteria andLoginChannelIn(List<Short> values) {
            addCriterion("LOGIN_CHANNEL in", values, "loginChannel");
            return (Criteria) this;
        }

        public Criteria andLoginChannelNotIn(List<Short> values) {
            addCriterion("LOGIN_CHANNEL not in", values, "loginChannel");
            return (Criteria) this;
        }

        public Criteria andLoginChannelBetween(Short value1, Short value2) {
            addCriterion("LOGIN_CHANNEL between", value1, value2, "loginChannel");
            return (Criteria) this;
        }

        public Criteria andLoginChannelNotBetween(Short value1, Short value2) {
            addCriterion("LOGIN_CHANNEL not between", value1, value2, "loginChannel");
            return (Criteria) this;
        }

        public Criteria andPasswordValidDateIsNull() {
            addCriterion("PASSWORD_VALID_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPasswordValidDateIsNotNull() {
            addCriterion("PASSWORD_VALID_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordValidDateEqualTo(Date value) {
            addCriterion("PASSWORD_VALID_DATE =", value, "passwordValidDate");
            return (Criteria) this;
        }

        public Criteria andPasswordValidDateNotEqualTo(Date value) {
            addCriterion("PASSWORD_VALID_DATE <>", value, "passwordValidDate");
            return (Criteria) this;
        }

        public Criteria andPasswordValidDateGreaterThan(Date value) {
            addCriterion("PASSWORD_VALID_DATE >", value, "passwordValidDate");
            return (Criteria) this;
        }

        public Criteria andPasswordValidDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PASSWORD_VALID_DATE >=", value, "passwordValidDate");
            return (Criteria) this;
        }

        public Criteria andPasswordValidDateLessThan(Date value) {
            addCriterion("PASSWORD_VALID_DATE <", value, "passwordValidDate");
            return (Criteria) this;
        }

        public Criteria andPasswordValidDateLessThanOrEqualTo(Date value) {
            addCriterion("PASSWORD_VALID_DATE <=", value, "passwordValidDate");
            return (Criteria) this;
        }

        public Criteria andPasswordValidDateIn(List<Date> values) {
            addCriterion("PASSWORD_VALID_DATE in", values, "passwordValidDate");
            return (Criteria) this;
        }

        public Criteria andPasswordValidDateNotIn(List<Date> values) {
            addCriterion("PASSWORD_VALID_DATE not in", values, "passwordValidDate");
            return (Criteria) this;
        }

        public Criteria andPasswordValidDateBetween(Date value1, Date value2) {
            addCriterion("PASSWORD_VALID_DATE between", value1, value2, "passwordValidDate");
            return (Criteria) this;
        }

        public Criteria andPasswordValidDateNotBetween(Date value1, Date value2) {
            addCriterion("PASSWORD_VALID_DATE not between", value1, value2, "passwordValidDate");
            return (Criteria) this;
        }

        public Criteria andChgPasswdAlarmDaysIsNull() {
            addCriterion("CHG_PASSWD_ALARM_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andChgPasswdAlarmDaysIsNotNull() {
            addCriterion("CHG_PASSWD_ALARM_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andChgPasswdAlarmDaysEqualTo(Integer value) {
            addCriterion("CHG_PASSWD_ALARM_DAYS =", value, "chgPasswdAlarmDays");
            return (Criteria) this;
        }

        public Criteria andChgPasswdAlarmDaysNotEqualTo(Integer value) {
            addCriterion("CHG_PASSWD_ALARM_DAYS <>", value, "chgPasswdAlarmDays");
            return (Criteria) this;
        }

        public Criteria andChgPasswdAlarmDaysGreaterThan(Integer value) {
            addCriterion("CHG_PASSWD_ALARM_DAYS >", value, "chgPasswdAlarmDays");
            return (Criteria) this;
        }

        public Criteria andChgPasswdAlarmDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHG_PASSWD_ALARM_DAYS >=", value, "chgPasswdAlarmDays");
            return (Criteria) this;
        }

        public Criteria andChgPasswdAlarmDaysLessThan(Integer value) {
            addCriterion("CHG_PASSWD_ALARM_DAYS <", value, "chgPasswdAlarmDays");
            return (Criteria) this;
        }

        public Criteria andChgPasswdAlarmDaysLessThanOrEqualTo(Integer value) {
            addCriterion("CHG_PASSWD_ALARM_DAYS <=", value, "chgPasswdAlarmDays");
            return (Criteria) this;
        }

        public Criteria andChgPasswdAlarmDaysIn(List<Integer> values) {
            addCriterion("CHG_PASSWD_ALARM_DAYS in", values, "chgPasswdAlarmDays");
            return (Criteria) this;
        }

        public Criteria andChgPasswdAlarmDaysNotIn(List<Integer> values) {
            addCriterion("CHG_PASSWD_ALARM_DAYS not in", values, "chgPasswdAlarmDays");
            return (Criteria) this;
        }

        public Criteria andChgPasswdAlarmDaysBetween(Integer value1, Integer value2) {
            addCriterion("CHG_PASSWD_ALARM_DAYS between", value1, value2, "chgPasswdAlarmDays");
            return (Criteria) this;
        }

        public Criteria andChgPasswdAlarmDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("CHG_PASSWD_ALARM_DAYS not between", value1, value2, "chgPasswdAlarmDays");
            return (Criteria) this;
        }

        public Criteria andIpmacFlagIsNull() {
            addCriterion("IPMAC_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andIpmacFlagIsNotNull() {
            addCriterion("IPMAC_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIpmacFlagEqualTo(String value) {
            addCriterion("IPMAC_FLAG =", value, "ipmacFlag");
            return (Criteria) this;
        }

        public Criteria andIpmacFlagNotEqualTo(String value) {
            addCriterion("IPMAC_FLAG <>", value, "ipmacFlag");
            return (Criteria) this;
        }

        public Criteria andIpmacFlagGreaterThan(String value) {
            addCriterion("IPMAC_FLAG >", value, "ipmacFlag");
            return (Criteria) this;
        }

        public Criteria andIpmacFlagGreaterThanOrEqualTo(String value) {
            addCriterion("IPMAC_FLAG >=", value, "ipmacFlag");
            return (Criteria) this;
        }

        public Criteria andIpmacFlagLessThan(String value) {
            addCriterion("IPMAC_FLAG <", value, "ipmacFlag");
            return (Criteria) this;
        }

        public Criteria andIpmacFlagLessThanOrEqualTo(String value) {
            addCriterion("IPMAC_FLAG <=", value, "ipmacFlag");
            return (Criteria) this;
        }

        public Criteria andIpmacFlagLike(String value) {
            addCriterion("IPMAC_FLAG like", value, "ipmacFlag");
            return (Criteria) this;
        }

        public Criteria andIpmacFlagNotLike(String value) {
            addCriterion("IPMAC_FLAG not like", value, "ipmacFlag");
            return (Criteria) this;
        }

        public Criteria andIpmacFlagIn(List<String> values) {
            addCriterion("IPMAC_FLAG in", values, "ipmacFlag");
            return (Criteria) this;
        }

        public Criteria andIpmacFlagNotIn(List<String> values) {
            addCriterion("IPMAC_FLAG not in", values, "ipmacFlag");
            return (Criteria) this;
        }

        public Criteria andIpmacFlagBetween(String value1, String value2) {
            addCriterion("IPMAC_FLAG between", value1, value2, "ipmacFlag");
            return (Criteria) this;
        }

        public Criteria andIpmacFlagNotBetween(String value1, String value2) {
            addCriterion("IPMAC_FLAG not between", value1, value2, "ipmacFlag");
            return (Criteria) this;
        }

        public Criteria andIsVpnLoginFlagIsNull() {
            addCriterion("IS_VPN_LOGIN_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andIsVpnLoginFlagIsNotNull() {
            addCriterion("IS_VPN_LOGIN_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIsVpnLoginFlagEqualTo(Long value) {
            addCriterion("IS_VPN_LOGIN_FLAG =", value, "isVpnLoginFlag");
            return (Criteria) this;
        }

        public Criteria andIsVpnLoginFlagNotEqualTo(Long value) {
            addCriterion("IS_VPN_LOGIN_FLAG <>", value, "isVpnLoginFlag");
            return (Criteria) this;
        }

        public Criteria andIsVpnLoginFlagGreaterThan(Long value) {
            addCriterion("IS_VPN_LOGIN_FLAG >", value, "isVpnLoginFlag");
            return (Criteria) this;
        }

        public Criteria andIsVpnLoginFlagGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_VPN_LOGIN_FLAG >=", value, "isVpnLoginFlag");
            return (Criteria) this;
        }

        public Criteria andIsVpnLoginFlagLessThan(Long value) {
            addCriterion("IS_VPN_LOGIN_FLAG <", value, "isVpnLoginFlag");
            return (Criteria) this;
        }

        public Criteria andIsVpnLoginFlagLessThanOrEqualTo(Long value) {
            addCriterion("IS_VPN_LOGIN_FLAG <=", value, "isVpnLoginFlag");
            return (Criteria) this;
        }

        public Criteria andIsVpnLoginFlagIn(List<Long> values) {
            addCriterion("IS_VPN_LOGIN_FLAG in", values, "isVpnLoginFlag");
            return (Criteria) this;
        }

        public Criteria andIsVpnLoginFlagNotIn(List<Long> values) {
            addCriterion("IS_VPN_LOGIN_FLAG not in", values, "isVpnLoginFlag");
            return (Criteria) this;
        }

        public Criteria andIsVpnLoginFlagBetween(Long value1, Long value2) {
            addCriterion("IS_VPN_LOGIN_FLAG between", value1, value2, "isVpnLoginFlag");
            return (Criteria) this;
        }

        public Criteria andIsVpnLoginFlagNotBetween(Long value1, Long value2) {
            addCriterion("IS_VPN_LOGIN_FLAG not between", value1, value2, "isVpnLoginFlag");
            return (Criteria) this;
        }

        public Criteria andChgPasswdFlagIsNull() {
            addCriterion("CHG_PASSWD_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andChgPasswdFlagIsNotNull() {
            addCriterion("CHG_PASSWD_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andChgPasswdFlagEqualTo(Integer value) {
            addCriterion("CHG_PASSWD_FLAG =", value, "chgPasswdFlag");
            return (Criteria) this;
        }

        public Criteria andChgPasswdFlagNotEqualTo(Integer value) {
            addCriterion("CHG_PASSWD_FLAG <>", value, "chgPasswdFlag");
            return (Criteria) this;
        }

        public Criteria andChgPasswdFlagGreaterThan(Integer value) {
            addCriterion("CHG_PASSWD_FLAG >", value, "chgPasswdFlag");
            return (Criteria) this;
        }

        public Criteria andChgPasswdFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHG_PASSWD_FLAG >=", value, "chgPasswdFlag");
            return (Criteria) this;
        }

        public Criteria andChgPasswdFlagLessThan(Integer value) {
            addCriterion("CHG_PASSWD_FLAG <", value, "chgPasswdFlag");
            return (Criteria) this;
        }

        public Criteria andChgPasswdFlagLessThanOrEqualTo(Integer value) {
            addCriterion("CHG_PASSWD_FLAG <=", value, "chgPasswdFlag");
            return (Criteria) this;
        }

        public Criteria andChgPasswdFlagIn(List<Integer> values) {
            addCriterion("CHG_PASSWD_FLAG in", values, "chgPasswdFlag");
            return (Criteria) this;
        }

        public Criteria andChgPasswdFlagNotIn(List<Integer> values) {
            addCriterion("CHG_PASSWD_FLAG not in", values, "chgPasswdFlag");
            return (Criteria) this;
        }

        public Criteria andChgPasswdFlagBetween(Integer value1, Integer value2) {
            addCriterion("CHG_PASSWD_FLAG between", value1, value2, "chgPasswdFlag");
            return (Criteria) this;
        }

        public Criteria andChgPasswdFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("CHG_PASSWD_FLAG not between", value1, value2, "chgPasswdFlag");
            return (Criteria) this;
        }

        public Criteria andIsLoginIsNull() {
            addCriterion("IS_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andIsLoginIsNotNull() {
            addCriterion("IS_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andIsLoginEqualTo(String value) {
            addCriterion("IS_LOGIN =", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginNotEqualTo(String value) {
            addCriterion("IS_LOGIN <>", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginGreaterThan(String value) {
            addCriterion("IS_LOGIN >", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginGreaterThanOrEqualTo(String value) {
            addCriterion("IS_LOGIN >=", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginLessThan(String value) {
            addCriterion("IS_LOGIN <", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginLessThanOrEqualTo(String value) {
            addCriterion("IS_LOGIN <=", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginLike(String value) {
            addCriterion("IS_LOGIN like", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginNotLike(String value) {
            addCriterion("IS_LOGIN not like", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginIn(List<String> values) {
            addCriterion("IS_LOGIN in", values, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginNotIn(List<String> values) {
            addCriterion("IS_LOGIN not in", values, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginBetween(String value1, String value2) {
            addCriterion("IS_LOGIN between", value1, value2, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginNotBetween(String value1, String value2) {
            addCriterion("IS_LOGIN not between", value1, value2, "isLogin");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("NOTES is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("NOTES is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("NOTES =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("NOTES <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("NOTES >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("NOTES >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("NOTES <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("NOTES <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("NOTES like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("NOTES not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("NOTES in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("NOTES not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("NOTES between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("NOTES not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andCancelDaysIsNull() {
            addCriterion("CANCEL_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andCancelDaysIsNotNull() {
            addCriterion("CANCEL_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andCancelDaysEqualTo(Integer value) {
            addCriterion("CANCEL_DAYS =", value, "cancelDays");
            return (Criteria) this;
        }

        public Criteria andCancelDaysNotEqualTo(Integer value) {
            addCriterion("CANCEL_DAYS <>", value, "cancelDays");
            return (Criteria) this;
        }

        public Criteria andCancelDaysGreaterThan(Integer value) {
            addCriterion("CANCEL_DAYS >", value, "cancelDays");
            return (Criteria) this;
        }

        public Criteria andCancelDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("CANCEL_DAYS >=", value, "cancelDays");
            return (Criteria) this;
        }

        public Criteria andCancelDaysLessThan(Integer value) {
            addCriterion("CANCEL_DAYS <", value, "cancelDays");
            return (Criteria) this;
        }

        public Criteria andCancelDaysLessThanOrEqualTo(Integer value) {
            addCriterion("CANCEL_DAYS <=", value, "cancelDays");
            return (Criteria) this;
        }

        public Criteria andCancelDaysIn(List<Integer> values) {
            addCriterion("CANCEL_DAYS in", values, "cancelDays");
            return (Criteria) this;
        }

        public Criteria andCancelDaysNotIn(List<Integer> values) {
            addCriterion("CANCEL_DAYS not in", values, "cancelDays");
            return (Criteria) this;
        }

        public Criteria andCancelDaysBetween(Integer value1, Integer value2) {
            addCriterion("CANCEL_DAYS between", value1, value2, "cancelDays");
            return (Criteria) this;
        }

        public Criteria andCancelDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("CANCEL_DAYS not between", value1, value2, "cancelDays");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andDoneCodeIsNull() {
            addCriterion("DONE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDoneCodeIsNotNull() {
            addCriterion("DONE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDoneCodeEqualTo(Integer value) {
            addCriterion("DONE_CODE =", value, "doneCode");
            return (Criteria) this;
        }

        public Criteria andDoneCodeNotEqualTo(Integer value) {
            addCriterion("DONE_CODE <>", value, "doneCode");
            return (Criteria) this;
        }

        public Criteria andDoneCodeGreaterThan(Integer value) {
            addCriterion("DONE_CODE >", value, "doneCode");
            return (Criteria) this;
        }

        public Criteria andDoneCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DONE_CODE >=", value, "doneCode");
            return (Criteria) this;
        }

        public Criteria andDoneCodeLessThan(Integer value) {
            addCriterion("DONE_CODE <", value, "doneCode");
            return (Criteria) this;
        }

        public Criteria andDoneCodeLessThanOrEqualTo(Integer value) {
            addCriterion("DONE_CODE <=", value, "doneCode");
            return (Criteria) this;
        }

        public Criteria andDoneCodeIn(List<Integer> values) {
            addCriterion("DONE_CODE in", values, "doneCode");
            return (Criteria) this;
        }

        public Criteria andDoneCodeNotIn(List<Integer> values) {
            addCriterion("DONE_CODE not in", values, "doneCode");
            return (Criteria) this;
        }

        public Criteria andDoneCodeBetween(Integer value1, Integer value2) {
            addCriterion("DONE_CODE between", value1, value2, "doneCode");
            return (Criteria) this;
        }

        public Criteria andDoneCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("DONE_CODE not between", value1, value2, "doneCode");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andDoneDateIsNull() {
            addCriterion("DONE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDoneDateIsNotNull() {
            addCriterion("DONE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDoneDateEqualTo(Date value) {
            addCriterion("DONE_DATE =", value, "doneDate");
            return (Criteria) this;
        }

        public Criteria andDoneDateNotEqualTo(Date value) {
            addCriterion("DONE_DATE <>", value, "doneDate");
            return (Criteria) this;
        }

        public Criteria andDoneDateGreaterThan(Date value) {
            addCriterion("DONE_DATE >", value, "doneDate");
            return (Criteria) this;
        }

        public Criteria andDoneDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DONE_DATE >=", value, "doneDate");
            return (Criteria) this;
        }

        public Criteria andDoneDateLessThan(Date value) {
            addCriterion("DONE_DATE <", value, "doneDate");
            return (Criteria) this;
        }

        public Criteria andDoneDateLessThanOrEqualTo(Date value) {
            addCriterion("DONE_DATE <=", value, "doneDate");
            return (Criteria) this;
        }

        public Criteria andDoneDateIn(List<Date> values) {
            addCriterion("DONE_DATE in", values, "doneDate");
            return (Criteria) this;
        }

        public Criteria andDoneDateNotIn(List<Date> values) {
            addCriterion("DONE_DATE not in", values, "doneDate");
            return (Criteria) this;
        }

        public Criteria andDoneDateBetween(Date value1, Date value2) {
            addCriterion("DONE_DATE between", value1, value2, "doneDate");
            return (Criteria) this;
        }

        public Criteria andDoneDateNotBetween(Date value1, Date value2) {
            addCriterion("DONE_DATE not between", value1, value2, "doneDate");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNull() {
            addCriterion("VALID_DATE is null");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNotNull() {
            addCriterion("VALID_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andValidDateEqualTo(Date value) {
            addCriterion("VALID_DATE =", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotEqualTo(Date value) {
            addCriterion("VALID_DATE <>", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThan(Date value) {
            addCriterion("VALID_DATE >", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThanOrEqualTo(Date value) {
            addCriterion("VALID_DATE >=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThan(Date value) {
            addCriterion("VALID_DATE <", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThanOrEqualTo(Date value) {
            addCriterion("VALID_DATE <=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateIn(List<Date> values) {
            addCriterion("VALID_DATE in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotIn(List<Date> values) {
            addCriterion("VALID_DATE not in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateBetween(Date value1, Date value2) {
            addCriterion("VALID_DATE between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotBetween(Date value1, Date value2) {
            addCriterion("VALID_DATE not between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNull() {
            addCriterion("EXPIRE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNotNull() {
            addCriterion("EXPIRE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpireDateEqualTo(Date value) {
            addCriterion("EXPIRE_DATE =", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotEqualTo(Date value) {
            addCriterion("EXPIRE_DATE <>", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThan(Date value) {
            addCriterion("EXPIRE_DATE >", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPIRE_DATE >=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThan(Date value) {
            addCriterion("EXPIRE_DATE <", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThanOrEqualTo(Date value) {
            addCriterion("EXPIRE_DATE <=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIn(List<Date> values) {
            addCriterion("EXPIRE_DATE in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotIn(List<Date> values) {
            addCriterion("EXPIRE_DATE not in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateBetween(Date value1, Date value2) {
            addCriterion("EXPIRE_DATE between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotBetween(Date value1, Date value2) {
            addCriterion("EXPIRE_DATE not between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andOpIdIsNull() {
            addCriterion("OP_ID is null");
            return (Criteria) this;
        }

        public Criteria andOpIdIsNotNull() {
            addCriterion("OP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOpIdEqualTo(Integer value) {
            addCriterion("OP_ID =", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotEqualTo(Integer value) {
            addCriterion("OP_ID <>", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdGreaterThan(Integer value) {
            addCriterion("OP_ID >", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OP_ID >=", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdLessThan(Integer value) {
            addCriterion("OP_ID <", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdLessThanOrEqualTo(Integer value) {
            addCriterion("OP_ID <=", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdIn(List<Integer> values) {
            addCriterion("OP_ID in", values, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotIn(List<Integer> values) {
            addCriterion("OP_ID not in", values, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdBetween(Integer value1, Integer value2) {
            addCriterion("OP_ID between", value1, value2, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OP_ID not between", value1, value2, "opId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Integer value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Integer value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Integer value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Integer value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Integer> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Integer> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andIsAdminIsNull() {
            addCriterion("IS_ADMIN is null");
            return (Criteria) this;
        }

        public Criteria andIsAdminIsNotNull() {
            addCriterion("IS_ADMIN is not null");
            return (Criteria) this;
        }

        public Criteria andIsAdminEqualTo(String value) {
            addCriterion("IS_ADMIN =", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotEqualTo(String value) {
            addCriterion("IS_ADMIN <>", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThan(String value) {
            addCriterion("IS_ADMIN >", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ADMIN >=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThan(String value) {
            addCriterion("IS_ADMIN <", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThanOrEqualTo(String value) {
            addCriterion("IS_ADMIN <=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLike(String value) {
            addCriterion("IS_ADMIN like", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotLike(String value) {
            addCriterion("IS_ADMIN not like", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminIn(List<String> values) {
            addCriterion("IS_ADMIN in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotIn(List<String> values) {
            addCriterion("IS_ADMIN not in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminBetween(String value1, String value2) {
            addCriterion("IS_ADMIN between", value1, value2, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotBetween(String value1, String value2) {
            addCriterion("IS_ADMIN not between", value1, value2, "isAdmin");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
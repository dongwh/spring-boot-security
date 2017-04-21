package com.drpeng.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SecFunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SecFunctionExample() {
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

        public Criteria andFuncIdIsNull() {
            addCriterion("FUNC_ID is null");
            return (Criteria) this;
        }

        public Criteria andFuncIdIsNotNull() {
            addCriterion("FUNC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFuncIdEqualTo(Integer value) {
            addCriterion("FUNC_ID =", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotEqualTo(Integer value) {
            addCriterion("FUNC_ID <>", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThan(Integer value) {
            addCriterion("FUNC_ID >", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FUNC_ID >=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThan(Integer value) {
            addCriterion("FUNC_ID <", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThanOrEqualTo(Integer value) {
            addCriterion("FUNC_ID <=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdIn(List<Integer> values) {
            addCriterion("FUNC_ID in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotIn(List<Integer> values) {
            addCriterion("FUNC_ID not in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdBetween(Integer value1, Integer value2) {
            addCriterion("FUNC_ID between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FUNC_ID not between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andEntClassIdIsNull() {
            addCriterion("ENT_CLASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andEntClassIdIsNotNull() {
            addCriterion("ENT_CLASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEntClassIdEqualTo(Integer value) {
            addCriterion("ENT_CLASS_ID =", value, "entClassId");
            return (Criteria) this;
        }

        public Criteria andEntClassIdNotEqualTo(Integer value) {
            addCriterion("ENT_CLASS_ID <>", value, "entClassId");
            return (Criteria) this;
        }

        public Criteria andEntClassIdGreaterThan(Integer value) {
            addCriterion("ENT_CLASS_ID >", value, "entClassId");
            return (Criteria) this;
        }

        public Criteria andEntClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENT_CLASS_ID >=", value, "entClassId");
            return (Criteria) this;
        }

        public Criteria andEntClassIdLessThan(Integer value) {
            addCriterion("ENT_CLASS_ID <", value, "entClassId");
            return (Criteria) this;
        }

        public Criteria andEntClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("ENT_CLASS_ID <=", value, "entClassId");
            return (Criteria) this;
        }

        public Criteria andEntClassIdIn(List<Integer> values) {
            addCriterion("ENT_CLASS_ID in", values, "entClassId");
            return (Criteria) this;
        }

        public Criteria andEntClassIdNotIn(List<Integer> values) {
            addCriterion("ENT_CLASS_ID not in", values, "entClassId");
            return (Criteria) this;
        }

        public Criteria andEntClassIdBetween(Integer value1, Integer value2) {
            addCriterion("ENT_CLASS_ID between", value1, value2, "entClassId");
            return (Criteria) this;
        }

        public Criteria andEntClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ENT_CLASS_ID not between", value1, value2, "entClassId");
            return (Criteria) this;
        }

        public Criteria andFuncCodeIsNull() {
            addCriterion("FUNC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFuncCodeIsNotNull() {
            addCriterion("FUNC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFuncCodeEqualTo(String value) {
            addCriterion("FUNC_CODE =", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeNotEqualTo(String value) {
            addCriterion("FUNC_CODE <>", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeGreaterThan(String value) {
            addCriterion("FUNC_CODE >", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FUNC_CODE >=", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeLessThan(String value) {
            addCriterion("FUNC_CODE <", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeLessThanOrEqualTo(String value) {
            addCriterion("FUNC_CODE <=", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeLike(String value) {
            addCriterion("FUNC_CODE like", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeNotLike(String value) {
            addCriterion("FUNC_CODE not like", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeIn(List<String> values) {
            addCriterion("FUNC_CODE in", values, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeNotIn(List<String> values) {
            addCriterion("FUNC_CODE not in", values, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeBetween(String value1, String value2) {
            addCriterion("FUNC_CODE between", value1, value2, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeNotBetween(String value1, String value2) {
            addCriterion("FUNC_CODE not between", value1, value2, "funcCode");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
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

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andFunSeqIsNull() {
            addCriterion("FUN_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andFunSeqIsNotNull() {
            addCriterion("FUN_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andFunSeqEqualTo(Integer value) {
            addCriterion("FUN_SEQ =", value, "funSeq");
            return (Criteria) this;
        }

        public Criteria andFunSeqNotEqualTo(Integer value) {
            addCriterion("FUN_SEQ <>", value, "funSeq");
            return (Criteria) this;
        }

        public Criteria andFunSeqGreaterThan(Integer value) {
            addCriterion("FUN_SEQ >", value, "funSeq");
            return (Criteria) this;
        }

        public Criteria andFunSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("FUN_SEQ >=", value, "funSeq");
            return (Criteria) this;
        }

        public Criteria andFunSeqLessThan(Integer value) {
            addCriterion("FUN_SEQ <", value, "funSeq");
            return (Criteria) this;
        }

        public Criteria andFunSeqLessThanOrEqualTo(Integer value) {
            addCriterion("FUN_SEQ <=", value, "funSeq");
            return (Criteria) this;
        }

        public Criteria andFunSeqIn(List<Integer> values) {
            addCriterion("FUN_SEQ in", values, "funSeq");
            return (Criteria) this;
        }

        public Criteria andFunSeqNotIn(List<Integer> values) {
            addCriterion("FUN_SEQ not in", values, "funSeq");
            return (Criteria) this;
        }

        public Criteria andFunSeqBetween(Integer value1, Integer value2) {
            addCriterion("FUN_SEQ between", value1, value2, "funSeq");
            return (Criteria) this;
        }

        public Criteria andFunSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("FUN_SEQ not between", value1, value2, "funSeq");
            return (Criteria) this;
        }

        public Criteria andViewnameIsNull() {
            addCriterion("VIEWNAME is null");
            return (Criteria) this;
        }

        public Criteria andViewnameIsNotNull() {
            addCriterion("VIEWNAME is not null");
            return (Criteria) this;
        }

        public Criteria andViewnameEqualTo(String value) {
            addCriterion("VIEWNAME =", value, "viewname");
            return (Criteria) this;
        }

        public Criteria andViewnameNotEqualTo(String value) {
            addCriterion("VIEWNAME <>", value, "viewname");
            return (Criteria) this;
        }

        public Criteria andViewnameGreaterThan(String value) {
            addCriterion("VIEWNAME >", value, "viewname");
            return (Criteria) this;
        }

        public Criteria andViewnameGreaterThanOrEqualTo(String value) {
            addCriterion("VIEWNAME >=", value, "viewname");
            return (Criteria) this;
        }

        public Criteria andViewnameLessThan(String value) {
            addCriterion("VIEWNAME <", value, "viewname");
            return (Criteria) this;
        }

        public Criteria andViewnameLessThanOrEqualTo(String value) {
            addCriterion("VIEWNAME <=", value, "viewname");
            return (Criteria) this;
        }

        public Criteria andViewnameLike(String value) {
            addCriterion("VIEWNAME like", value, "viewname");
            return (Criteria) this;
        }

        public Criteria andViewnameNotLike(String value) {
            addCriterion("VIEWNAME not like", value, "viewname");
            return (Criteria) this;
        }

        public Criteria andViewnameIn(List<String> values) {
            addCriterion("VIEWNAME in", values, "viewname");
            return (Criteria) this;
        }

        public Criteria andViewnameNotIn(List<String> values) {
            addCriterion("VIEWNAME not in", values, "viewname");
            return (Criteria) this;
        }

        public Criteria andViewnameBetween(String value1, String value2) {
            addCriterion("VIEWNAME between", value1, value2, "viewname");
            return (Criteria) this;
        }

        public Criteria andViewnameNotBetween(String value1, String value2) {
            addCriterion("VIEWNAME not between", value1, value2, "viewname");
            return (Criteria) this;
        }

        public Criteria andDllPathdllIsNull() {
            addCriterion("DLL_PATHDLL is null");
            return (Criteria) this;
        }

        public Criteria andDllPathdllIsNotNull() {
            addCriterion("DLL_PATHDLL is not null");
            return (Criteria) this;
        }

        public Criteria andDllPathdllEqualTo(String value) {
            addCriterion("DLL_PATHDLL =", value, "dllPathdll");
            return (Criteria) this;
        }

        public Criteria andDllPathdllNotEqualTo(String value) {
            addCriterion("DLL_PATHDLL <>", value, "dllPathdll");
            return (Criteria) this;
        }

        public Criteria andDllPathdllGreaterThan(String value) {
            addCriterion("DLL_PATHDLL >", value, "dllPathdll");
            return (Criteria) this;
        }

        public Criteria andDllPathdllGreaterThanOrEqualTo(String value) {
            addCriterion("DLL_PATHDLL >=", value, "dllPathdll");
            return (Criteria) this;
        }

        public Criteria andDllPathdllLessThan(String value) {
            addCriterion("DLL_PATHDLL <", value, "dllPathdll");
            return (Criteria) this;
        }

        public Criteria andDllPathdllLessThanOrEqualTo(String value) {
            addCriterion("DLL_PATHDLL <=", value, "dllPathdll");
            return (Criteria) this;
        }

        public Criteria andDllPathdllLike(String value) {
            addCriterion("DLL_PATHDLL like", value, "dllPathdll");
            return (Criteria) this;
        }

        public Criteria andDllPathdllNotLike(String value) {
            addCriterion("DLL_PATHDLL not like", value, "dllPathdll");
            return (Criteria) this;
        }

        public Criteria andDllPathdllIn(List<String> values) {
            addCriterion("DLL_PATHDLL in", values, "dllPathdll");
            return (Criteria) this;
        }

        public Criteria andDllPathdllNotIn(List<String> values) {
            addCriterion("DLL_PATHDLL not in", values, "dllPathdll");
            return (Criteria) this;
        }

        public Criteria andDllPathdllBetween(String value1, String value2) {
            addCriterion("DLL_PATHDLL between", value1, value2, "dllPathdll");
            return (Criteria) this;
        }

        public Criteria andDllPathdllNotBetween(String value1, String value2) {
            addCriterion("DLL_PATHDLL not between", value1, value2, "dllPathdll");
            return (Criteria) this;
        }

        public Criteria andFuncImgIsNull() {
            addCriterion("FUNC_IMG is null");
            return (Criteria) this;
        }

        public Criteria andFuncImgIsNotNull() {
            addCriterion("FUNC_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andFuncImgEqualTo(String value) {
            addCriterion("FUNC_IMG =", value, "funcImg");
            return (Criteria) this;
        }

        public Criteria andFuncImgNotEqualTo(String value) {
            addCriterion("FUNC_IMG <>", value, "funcImg");
            return (Criteria) this;
        }

        public Criteria andFuncImgGreaterThan(String value) {
            addCriterion("FUNC_IMG >", value, "funcImg");
            return (Criteria) this;
        }

        public Criteria andFuncImgGreaterThanOrEqualTo(String value) {
            addCriterion("FUNC_IMG >=", value, "funcImg");
            return (Criteria) this;
        }

        public Criteria andFuncImgLessThan(String value) {
            addCriterion("FUNC_IMG <", value, "funcImg");
            return (Criteria) this;
        }

        public Criteria andFuncImgLessThanOrEqualTo(String value) {
            addCriterion("FUNC_IMG <=", value, "funcImg");
            return (Criteria) this;
        }

        public Criteria andFuncImgLike(String value) {
            addCriterion("FUNC_IMG like", value, "funcImg");
            return (Criteria) this;
        }

        public Criteria andFuncImgNotLike(String value) {
            addCriterion("FUNC_IMG not like", value, "funcImg");
            return (Criteria) this;
        }

        public Criteria andFuncImgIn(List<String> values) {
            addCriterion("FUNC_IMG in", values, "funcImg");
            return (Criteria) this;
        }

        public Criteria andFuncImgNotIn(List<String> values) {
            addCriterion("FUNC_IMG not in", values, "funcImg");
            return (Criteria) this;
        }

        public Criteria andFuncImgBetween(String value1, String value2) {
            addCriterion("FUNC_IMG between", value1, value2, "funcImg");
            return (Criteria) this;
        }

        public Criteria andFuncImgNotBetween(String value1, String value2) {
            addCriterion("FUNC_IMG not between", value1, value2, "funcImg");
            return (Criteria) this;
        }

        public Criteria andFuncArgIsNull() {
            addCriterion("FUNC_ARG is null");
            return (Criteria) this;
        }

        public Criteria andFuncArgIsNotNull() {
            addCriterion("FUNC_ARG is not null");
            return (Criteria) this;
        }

        public Criteria andFuncArgEqualTo(String value) {
            addCriterion("FUNC_ARG =", value, "funcArg");
            return (Criteria) this;
        }

        public Criteria andFuncArgNotEqualTo(String value) {
            addCriterion("FUNC_ARG <>", value, "funcArg");
            return (Criteria) this;
        }

        public Criteria andFuncArgGreaterThan(String value) {
            addCriterion("FUNC_ARG >", value, "funcArg");
            return (Criteria) this;
        }

        public Criteria andFuncArgGreaterThanOrEqualTo(String value) {
            addCriterion("FUNC_ARG >=", value, "funcArg");
            return (Criteria) this;
        }

        public Criteria andFuncArgLessThan(String value) {
            addCriterion("FUNC_ARG <", value, "funcArg");
            return (Criteria) this;
        }

        public Criteria andFuncArgLessThanOrEqualTo(String value) {
            addCriterion("FUNC_ARG <=", value, "funcArg");
            return (Criteria) this;
        }

        public Criteria andFuncArgLike(String value) {
            addCriterion("FUNC_ARG like", value, "funcArg");
            return (Criteria) this;
        }

        public Criteria andFuncArgNotLike(String value) {
            addCriterion("FUNC_ARG not like", value, "funcArg");
            return (Criteria) this;
        }

        public Criteria andFuncArgIn(List<String> values) {
            addCriterion("FUNC_ARG in", values, "funcArg");
            return (Criteria) this;
        }

        public Criteria andFuncArgNotIn(List<String> values) {
            addCriterion("FUNC_ARG not in", values, "funcArg");
            return (Criteria) this;
        }

        public Criteria andFuncArgBetween(String value1, String value2) {
            addCriterion("FUNC_ARG between", value1, value2, "funcArg");
            return (Criteria) this;
        }

        public Criteria andFuncArgNotBetween(String value1, String value2) {
            addCriterion("FUNC_ARG not between", value1, value2, "funcArg");
            return (Criteria) this;
        }

        public Criteria andFuncTypeIsNull() {
            addCriterion("FUNC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFuncTypeIsNotNull() {
            addCriterion("FUNC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFuncTypeEqualTo(String value) {
            addCriterion("FUNC_TYPE =", value, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeNotEqualTo(String value) {
            addCriterion("FUNC_TYPE <>", value, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeGreaterThan(String value) {
            addCriterion("FUNC_TYPE >", value, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FUNC_TYPE >=", value, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeLessThan(String value) {
            addCriterion("FUNC_TYPE <", value, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeLessThanOrEqualTo(String value) {
            addCriterion("FUNC_TYPE <=", value, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeLike(String value) {
            addCriterion("FUNC_TYPE like", value, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeNotLike(String value) {
            addCriterion("FUNC_TYPE not like", value, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeIn(List<String> values) {
            addCriterion("FUNC_TYPE in", values, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeNotIn(List<String> values) {
            addCriterion("FUNC_TYPE not in", values, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeBetween(String value1, String value2) {
            addCriterion("FUNC_TYPE between", value1, value2, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeNotBetween(String value1, String value2) {
            addCriterion("FUNC_TYPE not between", value1, value2, "funcType");
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
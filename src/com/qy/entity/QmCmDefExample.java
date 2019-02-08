package com.qy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QmCmDefExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QmCmDefExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCmIdIsNull() {
            addCriterion("CM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCmIdIsNotNull() {
            addCriterion("CM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCmIdEqualTo(Long value) {
            addCriterion("CM_ID =", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotEqualTo(Long value) {
            addCriterion("CM_ID <>", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThan(Long value) {
            addCriterion("CM_ID >", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CM_ID >=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThan(Long value) {
            addCriterion("CM_ID <", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThanOrEqualTo(Long value) {
            addCriterion("CM_ID <=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdIn(List<Long> values) {
            addCriterion("CM_ID in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotIn(List<Long> values) {
            addCriterion("CM_ID not in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdBetween(Long value1, Long value2) {
            addCriterion("CM_ID between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotBetween(Long value1, Long value2) {
            addCriterion("CM_ID not between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andDefIdIsNull() {
            addCriterion("DEF_ID is null");
            return (Criteria) this;
        }

        public Criteria andDefIdIsNotNull() {
            addCriterion("DEF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDefIdEqualTo(Long value) {
            addCriterion("DEF_ID =", value, "defId");
            return (Criteria) this;
        }

        public Criteria andDefIdNotEqualTo(Long value) {
            addCriterion("DEF_ID <>", value, "defId");
            return (Criteria) this;
        }

        public Criteria andDefIdGreaterThan(Long value) {
            addCriterion("DEF_ID >", value, "defId");
            return (Criteria) this;
        }

        public Criteria andDefIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DEF_ID >=", value, "defId");
            return (Criteria) this;
        }

        public Criteria andDefIdLessThan(Long value) {
            addCriterion("DEF_ID <", value, "defId");
            return (Criteria) this;
        }

        public Criteria andDefIdLessThanOrEqualTo(Long value) {
            addCriterion("DEF_ID <=", value, "defId");
            return (Criteria) this;
        }

        public Criteria andDefIdIn(List<Long> values) {
            addCriterion("DEF_ID in", values, "defId");
            return (Criteria) this;
        }

        public Criteria andDefIdNotIn(List<Long> values) {
            addCriterion("DEF_ID not in", values, "defId");
            return (Criteria) this;
        }

        public Criteria andDefIdBetween(Long value1, Long value2) {
            addCriterion("DEF_ID between", value1, value2, "defId");
            return (Criteria) this;
        }

        public Criteria andDefIdNotBetween(Long value1, Long value2) {
            addCriterion("DEF_ID not between", value1, value2, "defId");
            return (Criteria) this;
        }

        public Criteria andExecutionGbIsNull() {
            addCriterion("EXECUTION_GB is null");
            return (Criteria) this;
        }

        public Criteria andExecutionGbIsNotNull() {
            addCriterion("EXECUTION_GB is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionGbEqualTo(String value) {
            addCriterion("EXECUTION_GB =", value, "executionGb");
            return (Criteria) this;
        }

        public Criteria andExecutionGbNotEqualTo(String value) {
            addCriterion("EXECUTION_GB <>", value, "executionGb");
            return (Criteria) this;
        }

        public Criteria andExecutionGbGreaterThan(String value) {
            addCriterion("EXECUTION_GB >", value, "executionGb");
            return (Criteria) this;
        }

        public Criteria andExecutionGbGreaterThanOrEqualTo(String value) {
            addCriterion("EXECUTION_GB >=", value, "executionGb");
            return (Criteria) this;
        }

        public Criteria andExecutionGbLessThan(String value) {
            addCriterion("EXECUTION_GB <", value, "executionGb");
            return (Criteria) this;
        }

        public Criteria andExecutionGbLessThanOrEqualTo(String value) {
            addCriterion("EXECUTION_GB <=", value, "executionGb");
            return (Criteria) this;
        }

        public Criteria andExecutionGbLike(String value) {
            addCriterion("EXECUTION_GB like", value, "executionGb");
            return (Criteria) this;
        }

        public Criteria andExecutionGbNotLike(String value) {
            addCriterion("EXECUTION_GB not like", value, "executionGb");
            return (Criteria) this;
        }

        public Criteria andExecutionGbIn(List<String> values) {
            addCriterion("EXECUTION_GB in", values, "executionGb");
            return (Criteria) this;
        }

        public Criteria andExecutionGbNotIn(List<String> values) {
            addCriterion("EXECUTION_GB not in", values, "executionGb");
            return (Criteria) this;
        }

        public Criteria andExecutionGbBetween(String value1, String value2) {
            addCriterion("EXECUTION_GB between", value1, value2, "executionGb");
            return (Criteria) this;
        }

        public Criteria andExecutionGbNotBetween(String value1, String value2) {
            addCriterion("EXECUTION_GB not between", value1, value2, "executionGb");
            return (Criteria) this;
        }

        public Criteria andStTypeIsNull() {
            addCriterion("ST_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andStTypeIsNotNull() {
            addCriterion("ST_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStTypeEqualTo(String value) {
            addCriterion("ST_TYPE =", value, "stType");
            return (Criteria) this;
        }

        public Criteria andStTypeNotEqualTo(String value) {
            addCriterion("ST_TYPE <>", value, "stType");
            return (Criteria) this;
        }

        public Criteria andStTypeGreaterThan(String value) {
            addCriterion("ST_TYPE >", value, "stType");
            return (Criteria) this;
        }

        public Criteria andStTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ST_TYPE >=", value, "stType");
            return (Criteria) this;
        }

        public Criteria andStTypeLessThan(String value) {
            addCriterion("ST_TYPE <", value, "stType");
            return (Criteria) this;
        }

        public Criteria andStTypeLessThanOrEqualTo(String value) {
            addCriterion("ST_TYPE <=", value, "stType");
            return (Criteria) this;
        }

        public Criteria andStTypeLike(String value) {
            addCriterion("ST_TYPE like", value, "stType");
            return (Criteria) this;
        }

        public Criteria andStTypeNotLike(String value) {
            addCriterion("ST_TYPE not like", value, "stType");
            return (Criteria) this;
        }

        public Criteria andStTypeIn(List<String> values) {
            addCriterion("ST_TYPE in", values, "stType");
            return (Criteria) this;
        }

        public Criteria andStTypeNotIn(List<String> values) {
            addCriterion("ST_TYPE not in", values, "stType");
            return (Criteria) this;
        }

        public Criteria andStTypeBetween(String value1, String value2) {
            addCriterion("ST_TYPE between", value1, value2, "stType");
            return (Criteria) this;
        }

        public Criteria andStTypeNotBetween(String value1, String value2) {
            addCriterion("ST_TYPE not between", value1, value2, "stType");
            return (Criteria) this;
        }

        public Criteria andStDesIsNull() {
            addCriterion("ST_DES is null");
            return (Criteria) this;
        }

        public Criteria andStDesIsNotNull() {
            addCriterion("ST_DES is not null");
            return (Criteria) this;
        }

        public Criteria andStDesEqualTo(String value) {
            addCriterion("ST_DES =", value, "stDes");
            return (Criteria) this;
        }

        public Criteria andStDesNotEqualTo(String value) {
            addCriterion("ST_DES <>", value, "stDes");
            return (Criteria) this;
        }

        public Criteria andStDesGreaterThan(String value) {
            addCriterion("ST_DES >", value, "stDes");
            return (Criteria) this;
        }

        public Criteria andStDesGreaterThanOrEqualTo(String value) {
            addCriterion("ST_DES >=", value, "stDes");
            return (Criteria) this;
        }

        public Criteria andStDesLessThan(String value) {
            addCriterion("ST_DES <", value, "stDes");
            return (Criteria) this;
        }

        public Criteria andStDesLessThanOrEqualTo(String value) {
            addCriterion("ST_DES <=", value, "stDes");
            return (Criteria) this;
        }

        public Criteria andStDesLike(String value) {
            addCriterion("ST_DES like", value, "stDes");
            return (Criteria) this;
        }

        public Criteria andStDesNotLike(String value) {
            addCriterion("ST_DES not like", value, "stDes");
            return (Criteria) this;
        }

        public Criteria andStDesIn(List<String> values) {
            addCriterion("ST_DES in", values, "stDes");
            return (Criteria) this;
        }

        public Criteria andStDesNotIn(List<String> values) {
            addCriterion("ST_DES not in", values, "stDes");
            return (Criteria) this;
        }

        public Criteria andStDesBetween(String value1, String value2) {
            addCriterion("ST_DES between", value1, value2, "stDes");
            return (Criteria) this;
        }

        public Criteria andStDesNotBetween(String value1, String value2) {
            addCriterion("ST_DES not between", value1, value2, "stDes");
            return (Criteria) this;
        }

        public Criteria andStStartTimeIsNull() {
            addCriterion("ST_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStStartTimeIsNotNull() {
            addCriterion("ST_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStStartTimeEqualTo(Date value) {
            addCriterion("ST_START_TIME =", value, "stStartTime");
            return (Criteria) this;
        }

        public Criteria andStStartTimeNotEqualTo(Date value) {
            addCriterion("ST_START_TIME <>", value, "stStartTime");
            return (Criteria) this;
        }

        public Criteria andStStartTimeGreaterThan(Date value) {
            addCriterion("ST_START_TIME >", value, "stStartTime");
            return (Criteria) this;
        }

        public Criteria andStStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ST_START_TIME >=", value, "stStartTime");
            return (Criteria) this;
        }

        public Criteria andStStartTimeLessThan(Date value) {
            addCriterion("ST_START_TIME <", value, "stStartTime");
            return (Criteria) this;
        }

        public Criteria andStStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("ST_START_TIME <=", value, "stStartTime");
            return (Criteria) this;
        }

        public Criteria andStStartTimeIn(List<Date> values) {
            addCriterion("ST_START_TIME in", values, "stStartTime");
            return (Criteria) this;
        }

        public Criteria andStStartTimeNotIn(List<Date> values) {
            addCriterion("ST_START_TIME not in", values, "stStartTime");
            return (Criteria) this;
        }

        public Criteria andStStartTimeBetween(Date value1, Date value2) {
            addCriterion("ST_START_TIME between", value1, value2, "stStartTime");
            return (Criteria) this;
        }

        public Criteria andStStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("ST_START_TIME not between", value1, value2, "stStartTime");
            return (Criteria) this;
        }

        public Criteria andStEndTimeIsNull() {
            addCriterion("ST_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStEndTimeIsNotNull() {
            addCriterion("ST_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStEndTimeEqualTo(Date value) {
            addCriterion("ST_END_TIME =", value, "stEndTime");
            return (Criteria) this;
        }

        public Criteria andStEndTimeNotEqualTo(Date value) {
            addCriterion("ST_END_TIME <>", value, "stEndTime");
            return (Criteria) this;
        }

        public Criteria andStEndTimeGreaterThan(Date value) {
            addCriterion("ST_END_TIME >", value, "stEndTime");
            return (Criteria) this;
        }

        public Criteria andStEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ST_END_TIME >=", value, "stEndTime");
            return (Criteria) this;
        }

        public Criteria andStEndTimeLessThan(Date value) {
            addCriterion("ST_END_TIME <", value, "stEndTime");
            return (Criteria) this;
        }

        public Criteria andStEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("ST_END_TIME <=", value, "stEndTime");
            return (Criteria) this;
        }

        public Criteria andStEndTimeIn(List<Date> values) {
            addCriterion("ST_END_TIME in", values, "stEndTime");
            return (Criteria) this;
        }

        public Criteria andStEndTimeNotIn(List<Date> values) {
            addCriterion("ST_END_TIME not in", values, "stEndTime");
            return (Criteria) this;
        }

        public Criteria andStEndTimeBetween(Date value1, Date value2) {
            addCriterion("ST_END_TIME between", value1, value2, "stEndTime");
            return (Criteria) this;
        }

        public Criteria andStEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("ST_END_TIME not between", value1, value2, "stEndTime");
            return (Criteria) this;
        }

        public Criteria andVerIsNull() {
            addCriterion("VER is null");
            return (Criteria) this;
        }

        public Criteria andVerIsNotNull() {
            addCriterion("VER is not null");
            return (Criteria) this;
        }

        public Criteria andVerEqualTo(Long value) {
            addCriterion("VER =", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotEqualTo(Long value) {
            addCriterion("VER <>", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerGreaterThan(Long value) {
            addCriterion("VER >", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerGreaterThanOrEqualTo(Long value) {
            addCriterion("VER >=", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerLessThan(Long value) {
            addCriterion("VER <", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerLessThanOrEqualTo(Long value) {
            addCriterion("VER <=", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerIn(List<Long> values) {
            addCriterion("VER in", values, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotIn(List<Long> values) {
            addCriterion("VER not in", values, "ver");
            return (Criteria) this;
        }

        public Criteria andVerBetween(Long value1, Long value2) {
            addCriterion("VER between", value1, value2, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotBetween(Long value1, Long value2) {
            addCriterion("VER not between", value1, value2, "ver");
            return (Criteria) this;
        }

        public Criteria andStValue1IsNull() {
            addCriterion("ST_VALUE1 is null");
            return (Criteria) this;
        }

        public Criteria andStValue1IsNotNull() {
            addCriterion("ST_VALUE1 is not null");
            return (Criteria) this;
        }

        public Criteria andStValue1EqualTo(String value) {
            addCriterion("ST_VALUE1 =", value, "stValue1");
            return (Criteria) this;
        }

        public Criteria andStValue1NotEqualTo(String value) {
            addCriterion("ST_VALUE1 <>", value, "stValue1");
            return (Criteria) this;
        }

        public Criteria andStValue1GreaterThan(String value) {
            addCriterion("ST_VALUE1 >", value, "stValue1");
            return (Criteria) this;
        }

        public Criteria andStValue1GreaterThanOrEqualTo(String value) {
            addCriterion("ST_VALUE1 >=", value, "stValue1");
            return (Criteria) this;
        }

        public Criteria andStValue1LessThan(String value) {
            addCriterion("ST_VALUE1 <", value, "stValue1");
            return (Criteria) this;
        }

        public Criteria andStValue1LessThanOrEqualTo(String value) {
            addCriterion("ST_VALUE1 <=", value, "stValue1");
            return (Criteria) this;
        }

        public Criteria andStValue1Like(String value) {
            addCriterion("ST_VALUE1 like", value, "stValue1");
            return (Criteria) this;
        }

        public Criteria andStValue1NotLike(String value) {
            addCriterion("ST_VALUE1 not like", value, "stValue1");
            return (Criteria) this;
        }

        public Criteria andStValue1In(List<String> values) {
            addCriterion("ST_VALUE1 in", values, "stValue1");
            return (Criteria) this;
        }

        public Criteria andStValue1NotIn(List<String> values) {
            addCriterion("ST_VALUE1 not in", values, "stValue1");
            return (Criteria) this;
        }

        public Criteria andStValue1Between(String value1, String value2) {
            addCriterion("ST_VALUE1 between", value1, value2, "stValue1");
            return (Criteria) this;
        }

        public Criteria andStValue1NotBetween(String value1, String value2) {
            addCriterion("ST_VALUE1 not between", value1, value2, "stValue1");
            return (Criteria) this;
        }

        public Criteria andStValue2IsNull() {
            addCriterion("ST_VALUE2 is null");
            return (Criteria) this;
        }

        public Criteria andStValue2IsNotNull() {
            addCriterion("ST_VALUE2 is not null");
            return (Criteria) this;
        }

        public Criteria andStValue2EqualTo(String value) {
            addCriterion("ST_VALUE2 =", value, "stValue2");
            return (Criteria) this;
        }

        public Criteria andStValue2NotEqualTo(String value) {
            addCriterion("ST_VALUE2 <>", value, "stValue2");
            return (Criteria) this;
        }

        public Criteria andStValue2GreaterThan(String value) {
            addCriterion("ST_VALUE2 >", value, "stValue2");
            return (Criteria) this;
        }

        public Criteria andStValue2GreaterThanOrEqualTo(String value) {
            addCriterion("ST_VALUE2 >=", value, "stValue2");
            return (Criteria) this;
        }

        public Criteria andStValue2LessThan(String value) {
            addCriterion("ST_VALUE2 <", value, "stValue2");
            return (Criteria) this;
        }

        public Criteria andStValue2LessThanOrEqualTo(String value) {
            addCriterion("ST_VALUE2 <=", value, "stValue2");
            return (Criteria) this;
        }

        public Criteria andStValue2Like(String value) {
            addCriterion("ST_VALUE2 like", value, "stValue2");
            return (Criteria) this;
        }

        public Criteria andStValue2NotLike(String value) {
            addCriterion("ST_VALUE2 not like", value, "stValue2");
            return (Criteria) this;
        }

        public Criteria andStValue2In(List<String> values) {
            addCriterion("ST_VALUE2 in", values, "stValue2");
            return (Criteria) this;
        }

        public Criteria andStValue2NotIn(List<String> values) {
            addCriterion("ST_VALUE2 not in", values, "stValue2");
            return (Criteria) this;
        }

        public Criteria andStValue2Between(String value1, String value2) {
            addCriterion("ST_VALUE2 between", value1, value2, "stValue2");
            return (Criteria) this;
        }

        public Criteria andStValue2NotBetween(String value1, String value2) {
            addCriterion("ST_VALUE2 not between", value1, value2, "stValue2");
            return (Criteria) this;
        }

        public Criteria andStValue3IsNull() {
            addCriterion("ST_VALUE3 is null");
            return (Criteria) this;
        }

        public Criteria andStValue3IsNotNull() {
            addCriterion("ST_VALUE3 is not null");
            return (Criteria) this;
        }

        public Criteria andStValue3EqualTo(String value) {
            addCriterion("ST_VALUE3 =", value, "stValue3");
            return (Criteria) this;
        }

        public Criteria andStValue3NotEqualTo(String value) {
            addCriterion("ST_VALUE3 <>", value, "stValue3");
            return (Criteria) this;
        }

        public Criteria andStValue3GreaterThan(String value) {
            addCriterion("ST_VALUE3 >", value, "stValue3");
            return (Criteria) this;
        }

        public Criteria andStValue3GreaterThanOrEqualTo(String value) {
            addCriterion("ST_VALUE3 >=", value, "stValue3");
            return (Criteria) this;
        }

        public Criteria andStValue3LessThan(String value) {
            addCriterion("ST_VALUE3 <", value, "stValue3");
            return (Criteria) this;
        }

        public Criteria andStValue3LessThanOrEqualTo(String value) {
            addCriterion("ST_VALUE3 <=", value, "stValue3");
            return (Criteria) this;
        }

        public Criteria andStValue3Like(String value) {
            addCriterion("ST_VALUE3 like", value, "stValue3");
            return (Criteria) this;
        }

        public Criteria andStValue3NotLike(String value) {
            addCriterion("ST_VALUE3 not like", value, "stValue3");
            return (Criteria) this;
        }

        public Criteria andStValue3In(List<String> values) {
            addCriterion("ST_VALUE3 in", values, "stValue3");
            return (Criteria) this;
        }

        public Criteria andStValue3NotIn(List<String> values) {
            addCriterion("ST_VALUE3 not in", values, "stValue3");
            return (Criteria) this;
        }

        public Criteria andStValue3Between(String value1, String value2) {
            addCriterion("ST_VALUE3 between", value1, value2, "stValue3");
            return (Criteria) this;
        }

        public Criteria andStValue3NotBetween(String value1, String value2) {
            addCriterion("ST_VALUE3 not between", value1, value2, "stValue3");
            return (Criteria) this;
        }

        public Criteria andStValue4IsNull() {
            addCriterion("ST_VALUE4 is null");
            return (Criteria) this;
        }

        public Criteria andStValue4IsNotNull() {
            addCriterion("ST_VALUE4 is not null");
            return (Criteria) this;
        }

        public Criteria andStValue4EqualTo(String value) {
            addCriterion("ST_VALUE4 =", value, "stValue4");
            return (Criteria) this;
        }

        public Criteria andStValue4NotEqualTo(String value) {
            addCriterion("ST_VALUE4 <>", value, "stValue4");
            return (Criteria) this;
        }

        public Criteria andStValue4GreaterThan(String value) {
            addCriterion("ST_VALUE4 >", value, "stValue4");
            return (Criteria) this;
        }

        public Criteria andStValue4GreaterThanOrEqualTo(String value) {
            addCriterion("ST_VALUE4 >=", value, "stValue4");
            return (Criteria) this;
        }

        public Criteria andStValue4LessThan(String value) {
            addCriterion("ST_VALUE4 <", value, "stValue4");
            return (Criteria) this;
        }

        public Criteria andStValue4LessThanOrEqualTo(String value) {
            addCriterion("ST_VALUE4 <=", value, "stValue4");
            return (Criteria) this;
        }

        public Criteria andStValue4Like(String value) {
            addCriterion("ST_VALUE4 like", value, "stValue4");
            return (Criteria) this;
        }

        public Criteria andStValue4NotLike(String value) {
            addCriterion("ST_VALUE4 not like", value, "stValue4");
            return (Criteria) this;
        }

        public Criteria andStValue4In(List<String> values) {
            addCriterion("ST_VALUE4 in", values, "stValue4");
            return (Criteria) this;
        }

        public Criteria andStValue4NotIn(List<String> values) {
            addCriterion("ST_VALUE4 not in", values, "stValue4");
            return (Criteria) this;
        }

        public Criteria andStValue4Between(String value1, String value2) {
            addCriterion("ST_VALUE4 between", value1, value2, "stValue4");
            return (Criteria) this;
        }

        public Criteria andStValue4NotBetween(String value1, String value2) {
            addCriterion("ST_VALUE4 not between", value1, value2, "stValue4");
            return (Criteria) this;
        }

        public Criteria andStMethodIsNull() {
            addCriterion("ST_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andStMethodIsNotNull() {
            addCriterion("ST_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andStMethodEqualTo(String value) {
            addCriterion("ST_METHOD =", value, "stMethod");
            return (Criteria) this;
        }

        public Criteria andStMethodNotEqualTo(String value) {
            addCriterion("ST_METHOD <>", value, "stMethod");
            return (Criteria) this;
        }

        public Criteria andStMethodGreaterThan(String value) {
            addCriterion("ST_METHOD >", value, "stMethod");
            return (Criteria) this;
        }

        public Criteria andStMethodGreaterThanOrEqualTo(String value) {
            addCriterion("ST_METHOD >=", value, "stMethod");
            return (Criteria) this;
        }

        public Criteria andStMethodLessThan(String value) {
            addCriterion("ST_METHOD <", value, "stMethod");
            return (Criteria) this;
        }

        public Criteria andStMethodLessThanOrEqualTo(String value) {
            addCriterion("ST_METHOD <=", value, "stMethod");
            return (Criteria) this;
        }

        public Criteria andStMethodLike(String value) {
            addCriterion("ST_METHOD like", value, "stMethod");
            return (Criteria) this;
        }

        public Criteria andStMethodNotLike(String value) {
            addCriterion("ST_METHOD not like", value, "stMethod");
            return (Criteria) this;
        }

        public Criteria andStMethodIn(List<String> values) {
            addCriterion("ST_METHOD in", values, "stMethod");
            return (Criteria) this;
        }

        public Criteria andStMethodNotIn(List<String> values) {
            addCriterion("ST_METHOD not in", values, "stMethod");
            return (Criteria) this;
        }

        public Criteria andStMethodBetween(String value1, String value2) {
            addCriterion("ST_METHOD between", value1, value2, "stMethod");
            return (Criteria) this;
        }

        public Criteria andStMethodNotBetween(String value1, String value2) {
            addCriterion("ST_METHOD not between", value1, value2, "stMethod");
            return (Criteria) this;
        }

        public Criteria andIsExamineIsNull() {
            addCriterion("IS_EXAMINE is null");
            return (Criteria) this;
        }

        public Criteria andIsExamineIsNotNull() {
            addCriterion("IS_EXAMINE is not null");
            return (Criteria) this;
        }

        public Criteria andIsExamineEqualTo(Short value) {
            addCriterion("IS_EXAMINE =", value, "isExamine");
            return (Criteria) this;
        }

        public Criteria andIsExamineNotEqualTo(Short value) {
            addCriterion("IS_EXAMINE <>", value, "isExamine");
            return (Criteria) this;
        }

        public Criteria andIsExamineGreaterThan(Short value) {
            addCriterion("IS_EXAMINE >", value, "isExamine");
            return (Criteria) this;
        }

        public Criteria andIsExamineGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_EXAMINE >=", value, "isExamine");
            return (Criteria) this;
        }

        public Criteria andIsExamineLessThan(Short value) {
            addCriterion("IS_EXAMINE <", value, "isExamine");
            return (Criteria) this;
        }

        public Criteria andIsExamineLessThanOrEqualTo(Short value) {
            addCriterion("IS_EXAMINE <=", value, "isExamine");
            return (Criteria) this;
        }

        public Criteria andIsExamineIn(List<Short> values) {
            addCriterion("IS_EXAMINE in", values, "isExamine");
            return (Criteria) this;
        }

        public Criteria andIsExamineNotIn(List<Short> values) {
            addCriterion("IS_EXAMINE not in", values, "isExamine");
            return (Criteria) this;
        }

        public Criteria andIsExamineBetween(Short value1, Short value2) {
            addCriterion("IS_EXAMINE between", value1, value2, "isExamine");
            return (Criteria) this;
        }

        public Criteria andIsExamineNotBetween(Short value1, Short value2) {
            addCriterion("IS_EXAMINE not between", value1, value2, "isExamine");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("CREATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("CREATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Long value) {
            addCriterion("CREATE_USER_ID =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Long value) {
            addCriterion("CREATE_USER_ID <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Long value) {
            addCriterion("CREATE_USER_ID >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATE_USER_ID >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Long value) {
            addCriterion("CREATE_USER_ID <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("CREATE_USER_ID <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Long> values) {
            addCriterion("CREATE_USER_ID in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Long> values) {
            addCriterion("CREATE_USER_ID not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Long value1, Long value2) {
            addCriterion("CREATE_USER_ID between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("CREATE_USER_ID not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdIsNull() {
            addCriterion("MODIFY_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdIsNotNull() {
            addCriterion("MODIFY_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdEqualTo(Long value) {
            addCriterion("MODIFY_USER_ID =", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotEqualTo(Long value) {
            addCriterion("MODIFY_USER_ID <>", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdGreaterThan(Long value) {
            addCriterion("MODIFY_USER_ID >", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MODIFY_USER_ID >=", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdLessThan(Long value) {
            addCriterion("MODIFY_USER_ID <", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdLessThanOrEqualTo(Long value) {
            addCriterion("MODIFY_USER_ID <=", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdIn(List<Long> values) {
            addCriterion("MODIFY_USER_ID in", values, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotIn(List<Long> values) {
            addCriterion("MODIFY_USER_ID not in", values, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdBetween(Long value1, Long value2) {
            addCriterion("MODIFY_USER_ID between", value1, value2, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotBetween(Long value1, Long value2) {
            addCriterion("MODIFY_USER_ID not between", value1, value2, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("IS_DEL is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("IS_DEL is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Short value) {
            addCriterion("IS_DEL =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Short value) {
            addCriterion("IS_DEL <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Short value) {
            addCriterion("IS_DEL >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_DEL >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Short value) {
            addCriterion("IS_DEL <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Short value) {
            addCriterion("IS_DEL <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Short> values) {
            addCriterion("IS_DEL in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Short> values) {
            addCriterion("IS_DEL not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Short value1, Short value2) {
            addCriterion("IS_DEL between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Short value1, Short value2) {
            addCriterion("IS_DEL not between", value1, value2, "isDel");
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
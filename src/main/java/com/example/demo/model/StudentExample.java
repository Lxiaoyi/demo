package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andSNoIsNull() {
            addCriterion("s_no is null");
            return (Criteria) this;
        }

        public Criteria andSNoIsNotNull() {
            addCriterion("s_no is not null");
            return (Criteria) this;
        }

        public Criteria andSNoEqualTo(Integer value) {
            addCriterion("s_no =", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoNotEqualTo(Integer value) {
            addCriterion("s_no <>", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoGreaterThan(Integer value) {
            addCriterion("s_no >", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_no >=", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoLessThan(Integer value) {
            addCriterion("s_no <", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoLessThanOrEqualTo(Integer value) {
            addCriterion("s_no <=", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoIn(List<Integer> values) {
            addCriterion("s_no in", values, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoNotIn(List<Integer> values) {
            addCriterion("s_no not in", values, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoBetween(Integer value1, Integer value2) {
            addCriterion("s_no between", value1, value2, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoNotBetween(Integer value1, Integer value2) {
            addCriterion("s_no not between", value1, value2, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSAgeIsNull() {
            addCriterion("s_age is null");
            return (Criteria) this;
        }

        public Criteria andSAgeIsNotNull() {
            addCriterion("s_age is not null");
            return (Criteria) this;
        }

        public Criteria andSAgeEqualTo(Short value) {
            addCriterion("s_age =", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeNotEqualTo(Short value) {
            addCriterion("s_age <>", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeGreaterThan(Short value) {
            addCriterion("s_age >", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeGreaterThanOrEqualTo(Short value) {
            addCriterion("s_age >=", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeLessThan(Short value) {
            addCriterion("s_age <", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeLessThanOrEqualTo(Short value) {
            addCriterion("s_age <=", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeIn(List<Short> values) {
            addCriterion("s_age in", values, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeNotIn(List<Short> values) {
            addCriterion("s_age not in", values, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeBetween(Short value1, Short value2) {
            addCriterion("s_age between", value1, value2, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeNotBetween(Short value1, Short value2) {
            addCriterion("s_age not between", value1, value2, "sAge");
            return (Criteria) this;
        }

        public Criteria andSSexIsNull() {
            addCriterion("s_sex is null");
            return (Criteria) this;
        }

        public Criteria andSSexIsNotNull() {
            addCriterion("s_sex is not null");
            return (Criteria) this;
        }

        public Criteria andSSexEqualTo(Byte value) {
            addCriterion("s_sex =", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotEqualTo(Byte value) {
            addCriterion("s_sex <>", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThan(Byte value) {
            addCriterion("s_sex >", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("s_sex >=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThan(Byte value) {
            addCriterion("s_sex <", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThanOrEqualTo(Byte value) {
            addCriterion("s_sex <=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexIn(List<Byte> values) {
            addCriterion("s_sex in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotIn(List<Byte> values) {
            addCriterion("s_sex not in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexBetween(Byte value1, Byte value2) {
            addCriterion("s_sex between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotBetween(Byte value1, Byte value2) {
            addCriterion("s_sex not between", value1, value2, "sSex");
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
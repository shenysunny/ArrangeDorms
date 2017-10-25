package cn.yrfk.arrangedorms.entity;

import java.util.ArrayList;
import java.util.List;

public class administratorEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public administratorEntityExample() {
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

        public Criteria andArNumberIsNull() {
            addCriterion("ar_number is null");
            return (Criteria) this;
        }

        public Criteria andArNumberIsNotNull() {
            addCriterion("ar_number is not null");
            return (Criteria) this;
        }

        public Criteria andArNumberEqualTo(Integer value) {
            addCriterion("ar_number =", value, "arNumber");
            return (Criteria) this;
        }

        public Criteria andArNumberNotEqualTo(Integer value) {
            addCriterion("ar_number <>", value, "arNumber");
            return (Criteria) this;
        }

        public Criteria andArNumberGreaterThan(Integer value) {
            addCriterion("ar_number >", value, "arNumber");
            return (Criteria) this;
        }

        public Criteria andArNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ar_number >=", value, "arNumber");
            return (Criteria) this;
        }

        public Criteria andArNumberLessThan(Integer value) {
            addCriterion("ar_number <", value, "arNumber");
            return (Criteria) this;
        }

        public Criteria andArNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ar_number <=", value, "arNumber");
            return (Criteria) this;
        }

        public Criteria andArNumberIn(List<Integer> values) {
            addCriterion("ar_number in", values, "arNumber");
            return (Criteria) this;
        }

        public Criteria andArNumberNotIn(List<Integer> values) {
            addCriterion("ar_number not in", values, "arNumber");
            return (Criteria) this;
        }

        public Criteria andArNumberBetween(Integer value1, Integer value2) {
            addCriterion("ar_number between", value1, value2, "arNumber");
            return (Criteria) this;
        }

        public Criteria andArNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ar_number not between", value1, value2, "arNumber");
            return (Criteria) this;
        }

        public Criteria andArPasswordIsNull() {
            addCriterion("ar_password is null");
            return (Criteria) this;
        }

        public Criteria andArPasswordIsNotNull() {
            addCriterion("ar_password is not null");
            return (Criteria) this;
        }

        public Criteria andArPasswordEqualTo(String value) {
            addCriterion("ar_password =", value, "arPassword");
            return (Criteria) this;
        }

        public Criteria andArPasswordNotEqualTo(String value) {
            addCriterion("ar_password <>", value, "arPassword");
            return (Criteria) this;
        }

        public Criteria andArPasswordGreaterThan(String value) {
            addCriterion("ar_password >", value, "arPassword");
            return (Criteria) this;
        }

        public Criteria andArPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("ar_password >=", value, "arPassword");
            return (Criteria) this;
        }

        public Criteria andArPasswordLessThan(String value) {
            addCriterion("ar_password <", value, "arPassword");
            return (Criteria) this;
        }

        public Criteria andArPasswordLessThanOrEqualTo(String value) {
            addCriterion("ar_password <=", value, "arPassword");
            return (Criteria) this;
        }

        public Criteria andArPasswordLike(String value) {
            addCriterion("ar_password like", value, "arPassword");
            return (Criteria) this;
        }

        public Criteria andArPasswordNotLike(String value) {
            addCriterion("ar_password not like", value, "arPassword");
            return (Criteria) this;
        }

        public Criteria andArPasswordIn(List<String> values) {
            addCriterion("ar_password in", values, "arPassword");
            return (Criteria) this;
        }

        public Criteria andArPasswordNotIn(List<String> values) {
            addCriterion("ar_password not in", values, "arPassword");
            return (Criteria) this;
        }

        public Criteria andArPasswordBetween(String value1, String value2) {
            addCriterion("ar_password between", value1, value2, "arPassword");
            return (Criteria) this;
        }

        public Criteria andArPasswordNotBetween(String value1, String value2) {
            addCriterion("ar_password not between", value1, value2, "arPassword");
            return (Criteria) this;
        }

        public Criteria andArNameIsNull() {
            addCriterion("ar_name is null");
            return (Criteria) this;
        }

        public Criteria andArNameIsNotNull() {
            addCriterion("ar_name is not null");
            return (Criteria) this;
        }

        public Criteria andArNameEqualTo(String value) {
            addCriterion("ar_name =", value, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameNotEqualTo(String value) {
            addCriterion("ar_name <>", value, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameGreaterThan(String value) {
            addCriterion("ar_name >", value, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameGreaterThanOrEqualTo(String value) {
            addCriterion("ar_name >=", value, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameLessThan(String value) {
            addCriterion("ar_name <", value, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameLessThanOrEqualTo(String value) {
            addCriterion("ar_name <=", value, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameLike(String value) {
            addCriterion("ar_name like", value, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameNotLike(String value) {
            addCriterion("ar_name not like", value, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameIn(List<String> values) {
            addCriterion("ar_name in", values, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameNotIn(List<String> values) {
            addCriterion("ar_name not in", values, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameBetween(String value1, String value2) {
            addCriterion("ar_name between", value1, value2, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameNotBetween(String value1, String value2) {
            addCriterion("ar_name not between", value1, value2, "arName");
            return (Criteria) this;
        }

        public Criteria andArJurisdictionIsNull() {
            addCriterion("ar_jurisdiction is null");
            return (Criteria) this;
        }

        public Criteria andArJurisdictionIsNotNull() {
            addCriterion("ar_jurisdiction is not null");
            return (Criteria) this;
        }

        public Criteria andArJurisdictionEqualTo(String value) {
            addCriterion("ar_jurisdiction =", value, "arJurisdiction");
            return (Criteria) this;
        }

        public Criteria andArJurisdictionNotEqualTo(String value) {
            addCriterion("ar_jurisdiction <>", value, "arJurisdiction");
            return (Criteria) this;
        }

        public Criteria andArJurisdictionGreaterThan(String value) {
            addCriterion("ar_jurisdiction >", value, "arJurisdiction");
            return (Criteria) this;
        }

        public Criteria andArJurisdictionGreaterThanOrEqualTo(String value) {
            addCriterion("ar_jurisdiction >=", value, "arJurisdiction");
            return (Criteria) this;
        }

        public Criteria andArJurisdictionLessThan(String value) {
            addCriterion("ar_jurisdiction <", value, "arJurisdiction");
            return (Criteria) this;
        }

        public Criteria andArJurisdictionLessThanOrEqualTo(String value) {
            addCriterion("ar_jurisdiction <=", value, "arJurisdiction");
            return (Criteria) this;
        }

        public Criteria andArJurisdictionLike(String value) {
            addCriterion("ar_jurisdiction like", value, "arJurisdiction");
            return (Criteria) this;
        }

        public Criteria andArJurisdictionNotLike(String value) {
            addCriterion("ar_jurisdiction not like", value, "arJurisdiction");
            return (Criteria) this;
        }

        public Criteria andArJurisdictionIn(List<String> values) {
            addCriterion("ar_jurisdiction in", values, "arJurisdiction");
            return (Criteria) this;
        }

        public Criteria andArJurisdictionNotIn(List<String> values) {
            addCriterion("ar_jurisdiction not in", values, "arJurisdiction");
            return (Criteria) this;
        }

        public Criteria andArJurisdictionBetween(String value1, String value2) {
            addCriterion("ar_jurisdiction between", value1, value2, "arJurisdiction");
            return (Criteria) this;
        }

        public Criteria andArJurisdictionNotBetween(String value1, String value2) {
            addCriterion("ar_jurisdiction not between", value1, value2, "arJurisdiction");
            return (Criteria) this;
        }

        public Criteria andArControlLimitIsNull() {
            addCriterion("ar_control_limit is null");
            return (Criteria) this;
        }

        public Criteria andArControlLimitIsNotNull() {
            addCriterion("ar_control_limit is not null");
            return (Criteria) this;
        }

        public Criteria andArControlLimitEqualTo(String value) {
            addCriterion("ar_control_limit =", value, "arControlLimit");
            return (Criteria) this;
        }

        public Criteria andArControlLimitNotEqualTo(String value) {
            addCriterion("ar_control_limit <>", value, "arControlLimit");
            return (Criteria) this;
        }

        public Criteria andArControlLimitGreaterThan(String value) {
            addCriterion("ar_control_limit >", value, "arControlLimit");
            return (Criteria) this;
        }

        public Criteria andArControlLimitGreaterThanOrEqualTo(String value) {
            addCriterion("ar_control_limit >=", value, "arControlLimit");
            return (Criteria) this;
        }

        public Criteria andArControlLimitLessThan(String value) {
            addCriterion("ar_control_limit <", value, "arControlLimit");
            return (Criteria) this;
        }

        public Criteria andArControlLimitLessThanOrEqualTo(String value) {
            addCriterion("ar_control_limit <=", value, "arControlLimit");
            return (Criteria) this;
        }

        public Criteria andArControlLimitLike(String value) {
            addCriterion("ar_control_limit like", value, "arControlLimit");
            return (Criteria) this;
        }

        public Criteria andArControlLimitNotLike(String value) {
            addCriterion("ar_control_limit not like", value, "arControlLimit");
            return (Criteria) this;
        }

        public Criteria andArControlLimitIn(List<String> values) {
            addCriterion("ar_control_limit in", values, "arControlLimit");
            return (Criteria) this;
        }

        public Criteria andArControlLimitNotIn(List<String> values) {
            addCriterion("ar_control_limit not in", values, "arControlLimit");
            return (Criteria) this;
        }

        public Criteria andArControlLimitBetween(String value1, String value2) {
            addCriterion("ar_control_limit between", value1, value2, "arControlLimit");
            return (Criteria) this;
        }

        public Criteria andArControlLimitNotBetween(String value1, String value2) {
            addCriterion("ar_control_limit not between", value1, value2, "arControlLimit");
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
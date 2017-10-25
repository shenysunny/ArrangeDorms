package cn.yrfk.arrangedorms.entity;

import java.util.ArrayList;
import java.util.List;

public class StudentEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentEntityExample() {
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

        public Criteria andSdNumberIsNull() {
            addCriterion("sd_number is null");
            return (Criteria) this;
        }

        public Criteria andSdNumberIsNotNull() {
            addCriterion("sd_number is not null");
            return (Criteria) this;
        }

        public Criteria andSdNumberEqualTo(Integer value) {
            addCriterion("sd_number =", value, "sdNumber");
            return (Criteria) this;
        }

        public Criteria andSdNumberNotEqualTo(Integer value) {
            addCriterion("sd_number <>", value, "sdNumber");
            return (Criteria) this;
        }

        public Criteria andSdNumberGreaterThan(Integer value) {
            addCriterion("sd_number >", value, "sdNumber");
            return (Criteria) this;
        }

        public Criteria andSdNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("sd_number >=", value, "sdNumber");
            return (Criteria) this;
        }

        public Criteria andSdNumberLessThan(Integer value) {
            addCriterion("sd_number <", value, "sdNumber");
            return (Criteria) this;
        }

        public Criteria andSdNumberLessThanOrEqualTo(Integer value) {
            addCriterion("sd_number <=", value, "sdNumber");
            return (Criteria) this;
        }

        public Criteria andSdNumberIn(List<Integer> values) {
            addCriterion("sd_number in", values, "sdNumber");
            return (Criteria) this;
        }

        public Criteria andSdNumberNotIn(List<Integer> values) {
            addCriterion("sd_number not in", values, "sdNumber");
            return (Criteria) this;
        }

        public Criteria andSdNumberBetween(Integer value1, Integer value2) {
            addCriterion("sd_number between", value1, value2, "sdNumber");
            return (Criteria) this;
        }

        public Criteria andSdNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("sd_number not between", value1, value2, "sdNumber");
            return (Criteria) this;
        }

        public Criteria andSdNameIsNull() {
            addCriterion("sd_name is null");
            return (Criteria) this;
        }

        public Criteria andSdNameIsNotNull() {
            addCriterion("sd_name is not null");
            return (Criteria) this;
        }

        public Criteria andSdNameEqualTo(String value) {
            addCriterion("sd_name =", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameNotEqualTo(String value) {
            addCriterion("sd_name <>", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameGreaterThan(String value) {
            addCriterion("sd_name >", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameGreaterThanOrEqualTo(String value) {
            addCriterion("sd_name >=", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameLessThan(String value) {
            addCriterion("sd_name <", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameLessThanOrEqualTo(String value) {
            addCriterion("sd_name <=", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameLike(String value) {
            addCriterion("sd_name like", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameNotLike(String value) {
            addCriterion("sd_name not like", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameIn(List<String> values) {
            addCriterion("sd_name in", values, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameNotIn(List<String> values) {
            addCriterion("sd_name not in", values, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameBetween(String value1, String value2) {
            addCriterion("sd_name between", value1, value2, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameNotBetween(String value1, String value2) {
            addCriterion("sd_name not between", value1, value2, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdSexIsNull() {
            addCriterion("sd_sex is null");
            return (Criteria) this;
        }

        public Criteria andSdSexIsNotNull() {
            addCriterion("sd_sex is not null");
            return (Criteria) this;
        }

        public Criteria andSdSexEqualTo(String value) {
            addCriterion("sd_sex =", value, "sdSex");
            return (Criteria) this;
        }

        public Criteria andSdSexNotEqualTo(String value) {
            addCriterion("sd_sex <>", value, "sdSex");
            return (Criteria) this;
        }

        public Criteria andSdSexGreaterThan(String value) {
            addCriterion("sd_sex >", value, "sdSex");
            return (Criteria) this;
        }

        public Criteria andSdSexGreaterThanOrEqualTo(String value) {
            addCriterion("sd_sex >=", value, "sdSex");
            return (Criteria) this;
        }

        public Criteria andSdSexLessThan(String value) {
            addCriterion("sd_sex <", value, "sdSex");
            return (Criteria) this;
        }

        public Criteria andSdSexLessThanOrEqualTo(String value) {
            addCriterion("sd_sex <=", value, "sdSex");
            return (Criteria) this;
        }

        public Criteria andSdSexLike(String value) {
            addCriterion("sd_sex like", value, "sdSex");
            return (Criteria) this;
        }

        public Criteria andSdSexNotLike(String value) {
            addCriterion("sd_sex not like", value, "sdSex");
            return (Criteria) this;
        }

        public Criteria andSdSexIn(List<String> values) {
            addCriterion("sd_sex in", values, "sdSex");
            return (Criteria) this;
        }

        public Criteria andSdSexNotIn(List<String> values) {
            addCriterion("sd_sex not in", values, "sdSex");
            return (Criteria) this;
        }

        public Criteria andSdSexBetween(String value1, String value2) {
            addCriterion("sd_sex between", value1, value2, "sdSex");
            return (Criteria) this;
        }

        public Criteria andSdSexNotBetween(String value1, String value2) {
            addCriterion("sd_sex not between", value1, value2, "sdSex");
            return (Criteria) this;
        }

        public Criteria andSdAgeIsNull() {
            addCriterion("sd_age is null");
            return (Criteria) this;
        }

        public Criteria andSdAgeIsNotNull() {
            addCriterion("sd_age is not null");
            return (Criteria) this;
        }

        public Criteria andSdAgeEqualTo(Integer value) {
            addCriterion("sd_age =", value, "sdAge");
            return (Criteria) this;
        }

        public Criteria andSdAgeNotEqualTo(Integer value) {
            addCriterion("sd_age <>", value, "sdAge");
            return (Criteria) this;
        }

        public Criteria andSdAgeGreaterThan(Integer value) {
            addCriterion("sd_age >", value, "sdAge");
            return (Criteria) this;
        }

        public Criteria andSdAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sd_age >=", value, "sdAge");
            return (Criteria) this;
        }

        public Criteria andSdAgeLessThan(Integer value) {
            addCriterion("sd_age <", value, "sdAge");
            return (Criteria) this;
        }

        public Criteria andSdAgeLessThanOrEqualTo(Integer value) {
            addCriterion("sd_age <=", value, "sdAge");
            return (Criteria) this;
        }

        public Criteria andSdAgeIn(List<Integer> values) {
            addCriterion("sd_age in", values, "sdAge");
            return (Criteria) this;
        }

        public Criteria andSdAgeNotIn(List<Integer> values) {
            addCriterion("sd_age not in", values, "sdAge");
            return (Criteria) this;
        }

        public Criteria andSdAgeBetween(Integer value1, Integer value2) {
            addCriterion("sd_age between", value1, value2, "sdAge");
            return (Criteria) this;
        }

        public Criteria andSdAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("sd_age not between", value1, value2, "sdAge");
            return (Criteria) this;
        }

        public Criteria andSdMajorIsNull() {
            addCriterion("sd_major is null");
            return (Criteria) this;
        }

        public Criteria andSdMajorIsNotNull() {
            addCriterion("sd_major is not null");
            return (Criteria) this;
        }

        public Criteria andSdMajorEqualTo(String value) {
            addCriterion("sd_major =", value, "sdMajor");
            return (Criteria) this;
        }

        public Criteria andSdMajorNotEqualTo(String value) {
            addCriterion("sd_major <>", value, "sdMajor");
            return (Criteria) this;
        }

        public Criteria andSdMajorGreaterThan(String value) {
            addCriterion("sd_major >", value, "sdMajor");
            return (Criteria) this;
        }

        public Criteria andSdMajorGreaterThanOrEqualTo(String value) {
            addCriterion("sd_major >=", value, "sdMajor");
            return (Criteria) this;
        }

        public Criteria andSdMajorLessThan(String value) {
            addCriterion("sd_major <", value, "sdMajor");
            return (Criteria) this;
        }

        public Criteria andSdMajorLessThanOrEqualTo(String value) {
            addCriterion("sd_major <=", value, "sdMajor");
            return (Criteria) this;
        }

        public Criteria andSdMajorLike(String value) {
            addCriterion("sd_major like", value, "sdMajor");
            return (Criteria) this;
        }

        public Criteria andSdMajorNotLike(String value) {
            addCriterion("sd_major not like", value, "sdMajor");
            return (Criteria) this;
        }

        public Criteria andSdMajorIn(List<String> values) {
            addCriterion("sd_major in", values, "sdMajor");
            return (Criteria) this;
        }

        public Criteria andSdMajorNotIn(List<String> values) {
            addCriterion("sd_major not in", values, "sdMajor");
            return (Criteria) this;
        }

        public Criteria andSdMajorBetween(String value1, String value2) {
            addCriterion("sd_major between", value1, value2, "sdMajor");
            return (Criteria) this;
        }

        public Criteria andSdMajorNotBetween(String value1, String value2) {
            addCriterion("sd_major not between", value1, value2, "sdMajor");
            return (Criteria) this;
        }

        public Criteria andSdDormIsNull() {
            addCriterion("sd_dorm is null");
            return (Criteria) this;
        }

        public Criteria andSdDormIsNotNull() {
            addCriterion("sd_dorm is not null");
            return (Criteria) this;
        }

        public Criteria andSdDormEqualTo(String value) {
            addCriterion("sd_dorm =", value, "sdDorm");
            return (Criteria) this;
        }

        public Criteria andSdDormNotEqualTo(String value) {
            addCriterion("sd_dorm <>", value, "sdDorm");
            return (Criteria) this;
        }

        public Criteria andSdDormGreaterThan(String value) {
            addCriterion("sd_dorm >", value, "sdDorm");
            return (Criteria) this;
        }

        public Criteria andSdDormGreaterThanOrEqualTo(String value) {
            addCriterion("sd_dorm >=", value, "sdDorm");
            return (Criteria) this;
        }

        public Criteria andSdDormLessThan(String value) {
            addCriterion("sd_dorm <", value, "sdDorm");
            return (Criteria) this;
        }

        public Criteria andSdDormLessThanOrEqualTo(String value) {
            addCriterion("sd_dorm <=", value, "sdDorm");
            return (Criteria) this;
        }

        public Criteria andSdDormLike(String value) {
            addCriterion("sd_dorm like", value, "sdDorm");
            return (Criteria) this;
        }

        public Criteria andSdDormNotLike(String value) {
            addCriterion("sd_dorm not like", value, "sdDorm");
            return (Criteria) this;
        }

        public Criteria andSdDormIn(List<String> values) {
            addCriterion("sd_dorm in", values, "sdDorm");
            return (Criteria) this;
        }

        public Criteria andSdDormNotIn(List<String> values) {
            addCriterion("sd_dorm not in", values, "sdDorm");
            return (Criteria) this;
        }

        public Criteria andSdDormBetween(String value1, String value2) {
            addCriterion("sd_dorm between", value1, value2, "sdDorm");
            return (Criteria) this;
        }

        public Criteria andSdDormNotBetween(String value1, String value2) {
            addCriterion("sd_dorm not between", value1, value2, "sdDorm");
            return (Criteria) this;
        }

        public Criteria andSdCharacterIsNull() {
            addCriterion("sd_character is null");
            return (Criteria) this;
        }

        public Criteria andSdCharacterIsNotNull() {
            addCriterion("sd_character is not null");
            return (Criteria) this;
        }

        public Criteria andSdCharacterEqualTo(String value) {
            addCriterion("sd_character =", value, "sdCharacter");
            return (Criteria) this;
        }

        public Criteria andSdCharacterNotEqualTo(String value) {
            addCriterion("sd_character <>", value, "sdCharacter");
            return (Criteria) this;
        }

        public Criteria andSdCharacterGreaterThan(String value) {
            addCriterion("sd_character >", value, "sdCharacter");
            return (Criteria) this;
        }

        public Criteria andSdCharacterGreaterThanOrEqualTo(String value) {
            addCriterion("sd_character >=", value, "sdCharacter");
            return (Criteria) this;
        }

        public Criteria andSdCharacterLessThan(String value) {
            addCriterion("sd_character <", value, "sdCharacter");
            return (Criteria) this;
        }

        public Criteria andSdCharacterLessThanOrEqualTo(String value) {
            addCriterion("sd_character <=", value, "sdCharacter");
            return (Criteria) this;
        }

        public Criteria andSdCharacterLike(String value) {
            addCriterion("sd_character like", value, "sdCharacter");
            return (Criteria) this;
        }

        public Criteria andSdCharacterNotLike(String value) {
            addCriterion("sd_character not like", value, "sdCharacter");
            return (Criteria) this;
        }

        public Criteria andSdCharacterIn(List<String> values) {
            addCriterion("sd_character in", values, "sdCharacter");
            return (Criteria) this;
        }

        public Criteria andSdCharacterNotIn(List<String> values) {
            addCriterion("sd_character not in", values, "sdCharacter");
            return (Criteria) this;
        }

        public Criteria andSdCharacterBetween(String value1, String value2) {
            addCriterion("sd_character between", value1, value2, "sdCharacter");
            return (Criteria) this;
        }

        public Criteria andSdCharacterNotBetween(String value1, String value2) {
            addCriterion("sd_character not between", value1, value2, "sdCharacter");
            return (Criteria) this;
        }

        public Criteria andSdClassIsNull() {
            addCriterion("sd_class is null");
            return (Criteria) this;
        }

        public Criteria andSdClassIsNotNull() {
            addCriterion("sd_class is not null");
            return (Criteria) this;
        }

        public Criteria andSdClassEqualTo(String value) {
            addCriterion("sd_class =", value, "sdClass");
            return (Criteria) this;
        }

        public Criteria andSdClassNotEqualTo(String value) {
            addCriterion("sd_class <>", value, "sdClass");
            return (Criteria) this;
        }

        public Criteria andSdClassGreaterThan(String value) {
            addCriterion("sd_class >", value, "sdClass");
            return (Criteria) this;
        }

        public Criteria andSdClassGreaterThanOrEqualTo(String value) {
            addCriterion("sd_class >=", value, "sdClass");
            return (Criteria) this;
        }

        public Criteria andSdClassLessThan(String value) {
            addCriterion("sd_class <", value, "sdClass");
            return (Criteria) this;
        }

        public Criteria andSdClassLessThanOrEqualTo(String value) {
            addCriterion("sd_class <=", value, "sdClass");
            return (Criteria) this;
        }

        public Criteria andSdClassLike(String value) {
            addCriterion("sd_class like", value, "sdClass");
            return (Criteria) this;
        }

        public Criteria andSdClassNotLike(String value) {
            addCriterion("sd_class not like", value, "sdClass");
            return (Criteria) this;
        }

        public Criteria andSdClassIn(List<String> values) {
            addCriterion("sd_class in", values, "sdClass");
            return (Criteria) this;
        }

        public Criteria andSdClassNotIn(List<String> values) {
            addCriterion("sd_class not in", values, "sdClass");
            return (Criteria) this;
        }

        public Criteria andSdClassBetween(String value1, String value2) {
            addCriterion("sd_class between", value1, value2, "sdClass");
            return (Criteria) this;
        }

        public Criteria andSdClassNotBetween(String value1, String value2) {
            addCriterion("sd_class not between", value1, value2, "sdClass");
            return (Criteria) this;
        }

        public Criteria andSdPapersIsNull() {
            addCriterion("sd_papers is null");
            return (Criteria) this;
        }

        public Criteria andSdPapersIsNotNull() {
            addCriterion("sd_papers is not null");
            return (Criteria) this;
        }

        public Criteria andSdPapersEqualTo(String value) {
            addCriterion("sd_papers =", value, "sdPapers");
            return (Criteria) this;
        }

        public Criteria andSdPapersNotEqualTo(String value) {
            addCriterion("sd_papers <>", value, "sdPapers");
            return (Criteria) this;
        }

        public Criteria andSdPapersGreaterThan(String value) {
            addCriterion("sd_papers >", value, "sdPapers");
            return (Criteria) this;
        }

        public Criteria andSdPapersGreaterThanOrEqualTo(String value) {
            addCriterion("sd_papers >=", value, "sdPapers");
            return (Criteria) this;
        }

        public Criteria andSdPapersLessThan(String value) {
            addCriterion("sd_papers <", value, "sdPapers");
            return (Criteria) this;
        }

        public Criteria andSdPapersLessThanOrEqualTo(String value) {
            addCriterion("sd_papers <=", value, "sdPapers");
            return (Criteria) this;
        }

        public Criteria andSdPapersLike(String value) {
            addCriterion("sd_papers like", value, "sdPapers");
            return (Criteria) this;
        }

        public Criteria andSdPapersNotLike(String value) {
            addCriterion("sd_papers not like", value, "sdPapers");
            return (Criteria) this;
        }

        public Criteria andSdPapersIn(List<String> values) {
            addCriterion("sd_papers in", values, "sdPapers");
            return (Criteria) this;
        }

        public Criteria andSdPapersNotIn(List<String> values) {
            addCriterion("sd_papers not in", values, "sdPapers");
            return (Criteria) this;
        }

        public Criteria andSdPapersBetween(String value1, String value2) {
            addCriterion("sd_papers between", value1, value2, "sdPapers");
            return (Criteria) this;
        }

        public Criteria andSdPapersNotBetween(String value1, String value2) {
            addCriterion("sd_papers not between", value1, value2, "sdPapers");
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
package com.xbjs.webim.pojo;

import java.util.ArrayList;
import java.util.List;
/**
 * Created with IntelliJ IDEA.
 *
 * @author: xincheng.zhao
 * @date: 2018/9/4
 * @description:
 */
public class ImMyFzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImMyFzExample() {
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

        public Criteria andFzIdIsNull() {
            addCriterion("fz_id is null");
            return (Criteria) this;
        }

        public Criteria andFzIdIsNotNull() {
            addCriterion("fz_id is not null");
            return (Criteria) this;
        }

        public Criteria andFzIdEqualTo(Long value) {
            addCriterion("fz_id =", value, "fzId");
            return (Criteria) this;
        }

        public Criteria andFzIdNotEqualTo(Long value) {
            addCriterion("fz_id <>", value, "fzId");
            return (Criteria) this;
        }

        public Criteria andFzIdGreaterThan(Long value) {
            addCriterion("fz_id >", value, "fzId");
            return (Criteria) this;
        }

        public Criteria andFzIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fz_id >=", value, "fzId");
            return (Criteria) this;
        }

        public Criteria andFzIdLessThan(Long value) {
            addCriterion("fz_id <", value, "fzId");
            return (Criteria) this;
        }

        public Criteria andFzIdLessThanOrEqualTo(Long value) {
            addCriterion("fz_id <=", value, "fzId");
            return (Criteria) this;
        }

        public Criteria andFzIdIn(List<Long> values) {
            addCriterion("fz_id in", values, "fzId");
            return (Criteria) this;
        }

        public Criteria andFzIdNotIn(List<Long> values) {
            addCriterion("fz_id not in", values, "fzId");
            return (Criteria) this;
        }

        public Criteria andFzIdBetween(Long value1, Long value2) {
            addCriterion("fz_id between", value1, value2, "fzId");
            return (Criteria) this;
        }

        public Criteria andFzIdNotBetween(Long value1, Long value2) {
            addCriterion("fz_id not between", value1, value2, "fzId");
            return (Criteria) this;
        }

        public Criteria andFzGroupnameIsNull() {
            addCriterion("fz_groupname is null");
            return (Criteria) this;
        }

        public Criteria andFzGroupnameIsNotNull() {
            addCriterion("fz_groupname is not null");
            return (Criteria) this;
        }

        public Criteria andFzGroupnameEqualTo(String value) {
            addCriterion("fz_groupname =", value, "fzGroupname");
            return (Criteria) this;
        }

        public Criteria andFzGroupnameNotEqualTo(String value) {
            addCriterion("fz_groupname <>", value, "fzGroupname");
            return (Criteria) this;
        }

        public Criteria andFzGroupnameGreaterThan(String value) {
            addCriterion("fz_groupname >", value, "fzGroupname");
            return (Criteria) this;
        }

        public Criteria andFzGroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("fz_groupname >=", value, "fzGroupname");
            return (Criteria) this;
        }

        public Criteria andFzGroupnameLessThan(String value) {
            addCriterion("fz_groupname <", value, "fzGroupname");
            return (Criteria) this;
        }

        public Criteria andFzGroupnameLessThanOrEqualTo(String value) {
            addCriterion("fz_groupname <=", value, "fzGroupname");
            return (Criteria) this;
        }

        public Criteria andFzGroupnameLike(String value) {
            addCriterion("fz_groupname like", value, "fzGroupname");
            return (Criteria) this;
        }

        public Criteria andFzGroupnameNotLike(String value) {
            addCriterion("fz_groupname not like", value, "fzGroupname");
            return (Criteria) this;
        }

        public Criteria andFzGroupnameIn(List<String> values) {
            addCriterion("fz_groupname in", values, "fzGroupname");
            return (Criteria) this;
        }

        public Criteria andFzGroupnameNotIn(List<String> values) {
            addCriterion("fz_groupname not in", values, "fzGroupname");
            return (Criteria) this;
        }

        public Criteria andFzGroupnameBetween(String value1, String value2) {
            addCriterion("fz_groupname between", value1, value2, "fzGroupname");
            return (Criteria) this;
        }

        public Criteria andFzGroupnameNotBetween(String value1, String value2) {
            addCriterion("fz_groupname not between", value1, value2, "fzGroupname");
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
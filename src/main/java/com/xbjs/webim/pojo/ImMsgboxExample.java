package com.xbjs.webim.pojo;

import java.util.ArrayList;
import java.util.List;

public class ImMsgboxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImMsgboxExample() {
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

        public Criteria andBoxIdIsNull() {
            addCriterion("box_id is null");
            return (Criteria) this;
        }

        public Criteria andBoxIdIsNotNull() {
            addCriterion("box_id is not null");
            return (Criteria) this;
        }

        public Criteria andBoxIdEqualTo(Long value) {
            addCriterion("box_id =", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdNotEqualTo(Long value) {
            addCriterion("box_id <>", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdGreaterThan(Long value) {
            addCriterion("box_id >", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdGreaterThanOrEqualTo(Long value) {
            addCriterion("box_id >=", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdLessThan(Long value) {
            addCriterion("box_id <", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdLessThanOrEqualTo(Long value) {
            addCriterion("box_id <=", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdIn(List<Long> values) {
            addCriterion("box_id in", values, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdNotIn(List<Long> values) {
            addCriterion("box_id not in", values, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdBetween(Long value1, Long value2) {
            addCriterion("box_id between", value1, value2, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdNotBetween(Long value1, Long value2) {
            addCriterion("box_id not between", value1, value2, "boxId");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andFromidIsNull() {
            addCriterion("fromid is null");
            return (Criteria) this;
        }

        public Criteria andFromidIsNotNull() {
            addCriterion("fromid is not null");
            return (Criteria) this;
        }

        public Criteria andFromidEqualTo(Long value) {
            addCriterion("fromid =", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotEqualTo(Long value) {
            addCriterion("fromid <>", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidGreaterThan(Long value) {
            addCriterion("fromid >", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidGreaterThanOrEqualTo(Long value) {
            addCriterion("fromid >=", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLessThan(Long value) {
            addCriterion("fromid <", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLessThanOrEqualTo(Long value) {
            addCriterion("fromid <=", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidIn(List<Long> values) {
            addCriterion("fromid in", values, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotIn(List<Long> values) {
            addCriterion("fromid not in", values, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidBetween(Long value1, Long value2) {
            addCriterion("fromid between", value1, value2, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotBetween(Long value1, Long value2) {
            addCriterion("fromid not between", value1, value2, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromGroupIsNull() {
            addCriterion("from_group is null");
            return (Criteria) this;
        }

        public Criteria andFromGroupIsNotNull() {
            addCriterion("from_group is not null");
            return (Criteria) this;
        }

        public Criteria andFromGroupEqualTo(Long value) {
            addCriterion("from_group =", value, "fromGroup");
            return (Criteria) this;
        }

        public Criteria andFromGroupNotEqualTo(Long value) {
            addCriterion("from_group <>", value, "fromGroup");
            return (Criteria) this;
        }

        public Criteria andFromGroupGreaterThan(Long value) {
            addCriterion("from_group >", value, "fromGroup");
            return (Criteria) this;
        }

        public Criteria andFromGroupGreaterThanOrEqualTo(Long value) {
            addCriterion("from_group >=", value, "fromGroup");
            return (Criteria) this;
        }

        public Criteria andFromGroupLessThan(Long value) {
            addCriterion("from_group <", value, "fromGroup");
            return (Criteria) this;
        }

        public Criteria andFromGroupLessThanOrEqualTo(Long value) {
            addCriterion("from_group <=", value, "fromGroup");
            return (Criteria) this;
        }

        public Criteria andFromGroupIn(List<Long> values) {
            addCriterion("from_group in", values, "fromGroup");
            return (Criteria) this;
        }

        public Criteria andFromGroupNotIn(List<Long> values) {
            addCriterion("from_group not in", values, "fromGroup");
            return (Criteria) this;
        }

        public Criteria andFromGroupBetween(Long value1, Long value2) {
            addCriterion("from_group between", value1, value2, "fromGroup");
            return (Criteria) this;
        }

        public Criteria andFromGroupNotBetween(Long value1, Long value2) {
            addCriterion("from_group not between", value1, value2, "fromGroup");
            return (Criteria) this;
        }

        public Criteria andTypIsNull() {
            addCriterion("typ is null");
            return (Criteria) this;
        }

        public Criteria andTypIsNotNull() {
            addCriterion("typ is not null");
            return (Criteria) this;
        }

        public Criteria andTypEqualTo(Integer value) {
            addCriterion("typ =", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypNotEqualTo(Integer value) {
            addCriterion("typ <>", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypGreaterThan(Integer value) {
            addCriterion("typ >", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypGreaterThanOrEqualTo(Integer value) {
            addCriterion("typ >=", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypLessThan(Integer value) {
            addCriterion("typ <", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypLessThanOrEqualTo(Integer value) {
            addCriterion("typ <=", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypIn(List<Integer> values) {
            addCriterion("typ in", values, "typ");
            return (Criteria) this;
        }

        public Criteria andTypNotIn(List<Integer> values) {
            addCriterion("typ not in", values, "typ");
            return (Criteria) this;
        }

        public Criteria andTypBetween(Integer value1, Integer value2) {
            addCriterion("typ between", value1, value2, "typ");
            return (Criteria) this;
        }

        public Criteria andTypNotBetween(Integer value1, Integer value2) {
            addCriterion("typ not between", value1, value2, "typ");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andHrefIsNull() {
            addCriterion("href is null");
            return (Criteria) this;
        }

        public Criteria andHrefIsNotNull() {
            addCriterion("href is not null");
            return (Criteria) this;
        }

        public Criteria andHrefEqualTo(String value) {
            addCriterion("href =", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotEqualTo(String value) {
            addCriterion("href <>", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefGreaterThan(String value) {
            addCriterion("href >", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefGreaterThanOrEqualTo(String value) {
            addCriterion("href >=", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefLessThan(String value) {
            addCriterion("href <", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefLessThanOrEqualTo(String value) {
            addCriterion("href <=", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefLike(String value) {
            addCriterion("href like", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotLike(String value) {
            addCriterion("href not like", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefIn(List<String> values) {
            addCriterion("href in", values, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotIn(List<String> values) {
            addCriterion("href not in", values, "href");
            return (Criteria) this;
        }

        public Criteria andHrefBetween(String value1, String value2) {
            addCriterion("href between", value1, value2, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotBetween(String value1, String value2) {
            addCriterion("href not between", value1, value2, "href");
            return (Criteria) this;
        }

        public Criteria andReadIsNull() {
            addCriterion("read is null");
            return (Criteria) this;
        }

        public Criteria andReadIsNotNull() {
            addCriterion("read is not null");
            return (Criteria) this;
        }

        public Criteria andReadEqualTo(Short value) {
            addCriterion("read =", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadNotEqualTo(Short value) {
            addCriterion("read <>", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadGreaterThan(Short value) {
            addCriterion("read >", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadGreaterThanOrEqualTo(Short value) {
            addCriterion("read >=", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadLessThan(Short value) {
            addCriterion("read <", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadLessThanOrEqualTo(Short value) {
            addCriterion("read <=", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadIn(List<Short> values) {
            addCriterion("read in", values, "read");
            return (Criteria) this;
        }

        public Criteria andReadNotIn(List<Short> values) {
            addCriterion("read not in", values, "read");
            return (Criteria) this;
        }

        public Criteria andReadBetween(Short value1, Short value2) {
            addCriterion("read between", value1, value2, "read");
            return (Criteria) this;
        }

        public Criteria andReadNotBetween(Short value1, Short value2) {
            addCriterion("read not between", value1, value2, "read");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Long value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Long value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Long value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Long value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Long value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Long> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Long> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Long value1, Long value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Long value1, Long value2) {
            addCriterion("time not between", value1, value2, "time");
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
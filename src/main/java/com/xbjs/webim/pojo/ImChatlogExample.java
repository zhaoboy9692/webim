package com.xbjs.webim.pojo;

import java.util.ArrayList;
import java.util.List;

public class ImChatlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImChatlogExample() {
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

        public Criteria andChatlogidIsNull() {
            addCriterion("chatlogId is null");
            return (Criteria) this;
        }

        public Criteria andChatlogidIsNotNull() {
            addCriterion("chatlogId is not null");
            return (Criteria) this;
        }

        public Criteria andChatlogidEqualTo(Long value) {
            addCriterion("chatlogId =", value, "chatlogid");
            return (Criteria) this;
        }

        public Criteria andChatlogidNotEqualTo(Long value) {
            addCriterion("chatlogId <>", value, "chatlogid");
            return (Criteria) this;
        }

        public Criteria andChatlogidGreaterThan(Long value) {
            addCriterion("chatlogId >", value, "chatlogid");
            return (Criteria) this;
        }

        public Criteria andChatlogidGreaterThanOrEqualTo(Long value) {
            addCriterion("chatlogId >=", value, "chatlogid");
            return (Criteria) this;
        }

        public Criteria andChatlogidLessThan(Long value) {
            addCriterion("chatlogId <", value, "chatlogid");
            return (Criteria) this;
        }

        public Criteria andChatlogidLessThanOrEqualTo(Long value) {
            addCriterion("chatlogId <=", value, "chatlogid");
            return (Criteria) this;
        }

        public Criteria andChatlogidIn(List<Long> values) {
            addCriterion("chatlogId in", values, "chatlogid");
            return (Criteria) this;
        }

        public Criteria andChatlogidNotIn(List<Long> values) {
            addCriterion("chatlogId not in", values, "chatlogid");
            return (Criteria) this;
        }

        public Criteria andChatlogidBetween(Long value1, Long value2) {
            addCriterion("chatlogId between", value1, value2, "chatlogid");
            return (Criteria) this;
        }

        public Criteria andChatlogidNotBetween(Long value1, Long value2) {
            addCriterion("chatlogId not between", value1, value2, "chatlogid");
            return (Criteria) this;
        }

        public Criteria andFromidIsNull() {
            addCriterion("fromId is null");
            return (Criteria) this;
        }

        public Criteria andFromidIsNotNull() {
            addCriterion("fromId is not null");
            return (Criteria) this;
        }

        public Criteria andFromidEqualTo(Long value) {
            addCriterion("fromId =", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotEqualTo(Long value) {
            addCriterion("fromId <>", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidGreaterThan(Long value) {
            addCriterion("fromId >", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidGreaterThanOrEqualTo(Long value) {
            addCriterion("fromId >=", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLessThan(Long value) {
            addCriterion("fromId <", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLessThanOrEqualTo(Long value) {
            addCriterion("fromId <=", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidIn(List<Long> values) {
            addCriterion("fromId in", values, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotIn(List<Long> values) {
            addCriterion("fromId not in", values, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidBetween(Long value1, Long value2) {
            addCriterion("fromId between", value1, value2, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotBetween(Long value1, Long value2) {
            addCriterion("fromId not between", value1, value2, "fromid");
            return (Criteria) this;
        }

        public Criteria andToidIsNull() {
            addCriterion("toId is null");
            return (Criteria) this;
        }

        public Criteria andToidIsNotNull() {
            addCriterion("toId is not null");
            return (Criteria) this;
        }

        public Criteria andToidEqualTo(Long value) {
            addCriterion("toId =", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotEqualTo(Long value) {
            addCriterion("toId <>", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidGreaterThan(Long value) {
            addCriterion("toId >", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidGreaterThanOrEqualTo(Long value) {
            addCriterion("toId >=", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidLessThan(Long value) {
            addCriterion("toId <", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidLessThanOrEqualTo(Long value) {
            addCriterion("toId <=", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidIn(List<Long> values) {
            addCriterion("toId in", values, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotIn(List<Long> values) {
            addCriterion("toId not in", values, "toid");
            return (Criteria) this;
        }

        public Criteria andToidBetween(Long value1, Long value2) {
            addCriterion("toId between", value1, value2, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotBetween(Long value1, Long value2) {
            addCriterion("toId not between", value1, value2, "toid");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNull() {
            addCriterion("sendTime is null");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNotNull() {
            addCriterion("sendTime is not null");
            return (Criteria) this;
        }

        public Criteria andSendtimeEqualTo(Long value) {
            addCriterion("sendTime =", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotEqualTo(Long value) {
            addCriterion("sendTime <>", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThan(Long value) {
            addCriterion("sendTime >", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThanOrEqualTo(Long value) {
            addCriterion("sendTime >=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThan(Long value) {
            addCriterion("sendTime <", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThanOrEqualTo(Long value) {
            addCriterion("sendTime <=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIn(List<Long> values) {
            addCriterion("sendTime in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotIn(List<Long> values) {
            addCriterion("sendTime not in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeBetween(Long value1, Long value2) {
            addCriterion("sendTime between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotBetween(Long value1, Long value2) {
            addCriterion("sendTime not between", value1, value2, "sendtime");
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

        public Criteria andTypEqualTo(String value) {
            addCriterion("typ =", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypNotEqualTo(String value) {
            addCriterion("typ <>", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypGreaterThan(String value) {
            addCriterion("typ >", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypGreaterThanOrEqualTo(String value) {
            addCriterion("typ >=", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypLessThan(String value) {
            addCriterion("typ <", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypLessThanOrEqualTo(String value) {
            addCriterion("typ <=", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypLike(String value) {
            addCriterion("typ like", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypNotLike(String value) {
            addCriterion("typ not like", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypIn(List<String> values) {
            addCriterion("typ in", values, "typ");
            return (Criteria) this;
        }

        public Criteria andTypNotIn(List<String> values) {
            addCriterion("typ not in", values, "typ");
            return (Criteria) this;
        }

        public Criteria andTypBetween(String value1, String value2) {
            addCriterion("typ between", value1, value2, "typ");
            return (Criteria) this;
        }

        public Criteria andTypNotBetween(String value1, String value2) {
            addCriterion("typ not between", value1, value2, "typ");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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
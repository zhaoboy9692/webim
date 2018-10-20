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
public class ImMyFriendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImMyFriendExample() {
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

        public Criteria andMyFriendIdIsNull() {
            addCriterion("my_friend_id is null");
            return (Criteria) this;
        }

        public Criteria andMyFriendIdIsNotNull() {
            addCriterion("my_friend_id is not null");
            return (Criteria) this;
        }

        public Criteria andMyFriendIdEqualTo(Long value) {
            addCriterion("my_friend_id =", value, "myFriendId");
            return (Criteria) this;
        }

        public Criteria andMyFriendIdNotEqualTo(Long value) {
            addCriterion("my_friend_id <>", value, "myFriendId");
            return (Criteria) this;
        }

        public Criteria andMyFriendIdGreaterThan(Long value) {
            addCriterion("my_friend_id >", value, "myFriendId");
            return (Criteria) this;
        }

        public Criteria andMyFriendIdGreaterThanOrEqualTo(Long value) {
            addCriterion("my_friend_id >=", value, "myFriendId");
            return (Criteria) this;
        }

        public Criteria andMyFriendIdLessThan(Long value) {
            addCriterion("my_friend_id <", value, "myFriendId");
            return (Criteria) this;
        }

        public Criteria andMyFriendIdLessThanOrEqualTo(Long value) {
            addCriterion("my_friend_id <=", value, "myFriendId");
            return (Criteria) this;
        }

        public Criteria andMyFriendIdIn(List<Long> values) {
            addCriterion("my_friend_id in", values, "myFriendId");
            return (Criteria) this;
        }

        public Criteria andMyFriendIdNotIn(List<Long> values) {
            addCriterion("my_friend_id not in", values, "myFriendId");
            return (Criteria) this;
        }

        public Criteria andMyFriendIdBetween(Long value1, Long value2) {
            addCriterion("my_friend_id between", value1, value2, "myFriendId");
            return (Criteria) this;
        }

        public Criteria andMyFriendIdNotBetween(Long value1, Long value2) {
            addCriterion("my_friend_id not between", value1, value2, "myFriendId");
            return (Criteria) this;
        }

        public Criteria andMyFzIdIsNull() {
            addCriterion("my_fz_id is null");
            return (Criteria) this;
        }

        public Criteria andMyFzIdIsNotNull() {
            addCriterion("my_fz_id is not null");
            return (Criteria) this;
        }

        public Criteria andMyFzIdEqualTo(Long value) {
            addCriterion("my_fz_id =", value, "myFzId");
            return (Criteria) this;
        }

        public Criteria andMyFzIdNotEqualTo(Long value) {
            addCriterion("my_fz_id <>", value, "myFzId");
            return (Criteria) this;
        }

        public Criteria andMyFzIdGreaterThan(Long value) {
            addCriterion("my_fz_id >", value, "myFzId");
            return (Criteria) this;
        }

        public Criteria andMyFzIdGreaterThanOrEqualTo(Long value) {
            addCriterion("my_fz_id >=", value, "myFzId");
            return (Criteria) this;
        }

        public Criteria andMyFzIdLessThan(Long value) {
            addCriterion("my_fz_id <", value, "myFzId");
            return (Criteria) this;
        }

        public Criteria andMyFzIdLessThanOrEqualTo(Long value) {
            addCriterion("my_fz_id <=", value, "myFzId");
            return (Criteria) this;
        }

        public Criteria andMyFzIdIn(List<Long> values) {
            addCriterion("my_fz_id in", values, "myFzId");
            return (Criteria) this;
        }

        public Criteria andMyFzIdNotIn(List<Long> values) {
            addCriterion("my_fz_id not in", values, "myFzId");
            return (Criteria) this;
        }

        public Criteria andMyFzIdBetween(Long value1, Long value2) {
            addCriterion("my_fz_id between", value1, value2, "myFzId");
            return (Criteria) this;
        }

        public Criteria andMyFzIdNotBetween(Long value1, Long value2) {
            addCriterion("my_fz_id not between", value1, value2, "myFzId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickName is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickName is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickName =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickName <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickName >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickName >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickName <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickName <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickName like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickName not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickName in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickName not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickName between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickName not between", value1, value2, "nickname");
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
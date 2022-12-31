package zjc.bookmanage.org.model;

import java.util.ArrayList;
import java.util.List;

public class BookkindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookkindExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andBookkindidIsNull() {
            addCriterion("BookKindID is null");
            return (Criteria) this;
        }

        public Criteria andBookkindidIsNotNull() {
            addCriterion("BookKindID is not null");
            return (Criteria) this;
        }

        public Criteria andBookkindidEqualTo(Integer value) {
            addCriterion("BookKindID =", value, "bookkindid");
            return (Criteria) this;
        }

        public Criteria andBookkindidNotEqualTo(Integer value) {
            addCriterion("BookKindID <>", value, "bookkindid");
            return (Criteria) this;
        }

        public Criteria andBookkindidGreaterThan(Integer value) {
            addCriterion("BookKindID >", value, "bookkindid");
            return (Criteria) this;
        }

        public Criteria andBookkindidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BookKindID >=", value, "bookkindid");
            return (Criteria) this;
        }

        public Criteria andBookkindidLessThan(Integer value) {
            addCriterion("BookKindID <", value, "bookkindid");
            return (Criteria) this;
        }

        public Criteria andBookkindidLessThanOrEqualTo(Integer value) {
            addCriterion("BookKindID <=", value, "bookkindid");
            return (Criteria) this;
        }

        public Criteria andBookkindidIn(List<Integer> values) {
            addCriterion("BookKindID in", values, "bookkindid");
            return (Criteria) this;
        }

        public Criteria andBookkindidNotIn(List<Integer> values) {
            addCriterion("BookKindID not in", values, "bookkindid");
            return (Criteria) this;
        }

        public Criteria andBookkindidBetween(Integer value1, Integer value2) {
            addCriterion("BookKindID between", value1, value2, "bookkindid");
            return (Criteria) this;
        }

        public Criteria andBookkindidNotBetween(Integer value1, Integer value2) {
            addCriterion("BookKindID not between", value1, value2, "bookkindid");
            return (Criteria) this;
        }

        public Criteria andBookkindnameIsNull() {
            addCriterion("BookKindName is null");
            return (Criteria) this;
        }

        public Criteria andBookkindnameIsNotNull() {
            addCriterion("BookKindName is not null");
            return (Criteria) this;
        }

        public Criteria andBookkindnameEqualTo(String value) {
            addCriterion("BookKindName =", value, "bookkindname");
            return (Criteria) this;
        }

        public Criteria andBookkindnameNotEqualTo(String value) {
            addCriterion("BookKindName <>", value, "bookkindname");
            return (Criteria) this;
        }

        public Criteria andBookkindnameGreaterThan(String value) {
            addCriterion("BookKindName >", value, "bookkindname");
            return (Criteria) this;
        }

        public Criteria andBookkindnameGreaterThanOrEqualTo(String value) {
            addCriterion("BookKindName >=", value, "bookkindname");
            return (Criteria) this;
        }

        public Criteria andBookkindnameLessThan(String value) {
            addCriterion("BookKindName <", value, "bookkindname");
            return (Criteria) this;
        }

        public Criteria andBookkindnameLessThanOrEqualTo(String value) {
            addCriterion("BookKindName <=", value, "bookkindname");
            return (Criteria) this;
        }

        public Criteria andBookkindnameLike(String value) {
            addCriterion("BookKindName like", value, "bookkindname");
            return (Criteria) this;
        }

        public Criteria andBookkindnameNotLike(String value) {
            addCriterion("BookKindName not like", value, "bookkindname");
            return (Criteria) this;
        }

        public Criteria andBookkindnameIn(List<String> values) {
            addCriterion("BookKindName in", values, "bookkindname");
            return (Criteria) this;
        }

        public Criteria andBookkindnameNotIn(List<String> values) {
            addCriterion("BookKindName not in", values, "bookkindname");
            return (Criteria) this;
        }

        public Criteria andBookkindnameBetween(String value1, String value2) {
            addCriterion("BookKindName between", value1, value2, "bookkindname");
            return (Criteria) this;
        }

        public Criteria andBookkindnameNotBetween(String value1, String value2) {
            addCriterion("BookKindName not between", value1, value2, "bookkindname");
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
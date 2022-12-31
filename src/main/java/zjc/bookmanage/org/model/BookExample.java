package zjc.bookmanage.org.model;

import java.util.ArrayList;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andBookidIsNull() {
            addCriterion("BookID is null");
            return (Criteria) this;
        }

        public Criteria andBookidIsNotNull() {
            addCriterion("BookID is not null");
            return (Criteria) this;
        }

        public Criteria andBookidEqualTo(Integer value) {
            addCriterion("BookID =", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotEqualTo(Integer value) {
            addCriterion("BookID <>", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThan(Integer value) {
            addCriterion("BookID >", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BookID >=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThan(Integer value) {
            addCriterion("BookID <", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThanOrEqualTo(Integer value) {
            addCriterion("BookID <=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidIn(List<Integer> values) {
            addCriterion("BookID in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotIn(List<Integer> values) {
            addCriterion("BookID not in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidBetween(Integer value1, Integer value2) {
            addCriterion("BookID between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotBetween(Integer value1, Integer value2) {
            addCriterion("BookID not between", value1, value2, "bookid");
            return (Criteria) this;
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

        public Criteria andBooknameIsNull() {
            addCriterion("BookName is null");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNotNull() {
            addCriterion("BookName is not null");
            return (Criteria) this;
        }

        public Criteria andBooknameEqualTo(String value) {
            addCriterion("BookName =", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotEqualTo(String value) {
            addCriterion("BookName <>", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThan(String value) {
            addCriterion("BookName >", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThanOrEqualTo(String value) {
            addCriterion("BookName >=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThan(String value) {
            addCriterion("BookName <", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThanOrEqualTo(String value) {
            addCriterion("BookName <=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLike(String value) {
            addCriterion("BookName like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotLike(String value) {
            addCriterion("BookName not like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameIn(List<String> values) {
            addCriterion("BookName in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotIn(List<String> values) {
            addCriterion("BookName not in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameBetween(String value1, String value2) {
            addCriterion("BookName between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotBetween(String value1, String value2) {
            addCriterion("BookName not between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBookpriceIsNull() {
            addCriterion("BookPrice is null");
            return (Criteria) this;
        }

        public Criteria andBookpriceIsNotNull() {
            addCriterion("BookPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBookpriceEqualTo(String value) {
            addCriterion("BookPrice =", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceNotEqualTo(String value) {
            addCriterion("BookPrice <>", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceGreaterThan(String value) {
            addCriterion("BookPrice >", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceGreaterThanOrEqualTo(String value) {
            addCriterion("BookPrice >=", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceLessThan(String value) {
            addCriterion("BookPrice <", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceLessThanOrEqualTo(String value) {
            addCriterion("BookPrice <=", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceLike(String value) {
            addCriterion("BookPrice like", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceNotLike(String value) {
            addCriterion("BookPrice not like", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceIn(List<String> values) {
            addCriterion("BookPrice in", values, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceNotIn(List<String> values) {
            addCriterion("BookPrice not in", values, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceBetween(String value1, String value2) {
            addCriterion("BookPrice between", value1, value2, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceNotBetween(String value1, String value2) {
            addCriterion("BookPrice not between", value1, value2, "bookprice");
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
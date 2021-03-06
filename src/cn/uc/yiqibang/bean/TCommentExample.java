package cn.uc.yiqibang.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCommentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_comment
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_comment
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_comment
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public TCommentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_comment
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTNIdIsNull() {
            addCriterion("t_n_id is null");
            return (Criteria) this;
        }

        public Criteria andTNIdIsNotNull() {
            addCriterion("t_n_id is not null");
            return (Criteria) this;
        }

        public Criteria andTNIdEqualTo(Integer value) {
            addCriterion("t_n_id =", value, "tNId");
            return (Criteria) this;
        }

        public Criteria andTNIdNotEqualTo(Integer value) {
            addCriterion("t_n_id <>", value, "tNId");
            return (Criteria) this;
        }

        public Criteria andTNIdGreaterThan(Integer value) {
            addCriterion("t_n_id >", value, "tNId");
            return (Criteria) this;
        }

        public Criteria andTNIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_n_id >=", value, "tNId");
            return (Criteria) this;
        }

        public Criteria andTNIdLessThan(Integer value) {
            addCriterion("t_n_id <", value, "tNId");
            return (Criteria) this;
        }

        public Criteria andTNIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_n_id <=", value, "tNId");
            return (Criteria) this;
        }

        public Criteria andTNIdIn(List<Integer> values) {
            addCriterion("t_n_id in", values, "tNId");
            return (Criteria) this;
        }

        public Criteria andTNIdNotIn(List<Integer> values) {
            addCriterion("t_n_id not in", values, "tNId");
            return (Criteria) this;
        }

        public Criteria andTNIdBetween(Integer value1, Integer value2) {
            addCriterion("t_n_id between", value1, value2, "tNId");
            return (Criteria) this;
        }

        public Criteria andTNIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_n_id not between", value1, value2, "tNId");
            return (Criteria) this;
        }

        public Criteria andTUIdIsNull() {
            addCriterion("t_u_id is null");
            return (Criteria) this;
        }

        public Criteria andTUIdIsNotNull() {
            addCriterion("t_u_id is not null");
            return (Criteria) this;
        }

        public Criteria andTUIdEqualTo(Integer value) {
            addCriterion("t_u_id =", value, "tUId");
            return (Criteria) this;
        }

        public Criteria andTUIdNotEqualTo(Integer value) {
            addCriterion("t_u_id <>", value, "tUId");
            return (Criteria) this;
        }

        public Criteria andTUIdGreaterThan(Integer value) {
            addCriterion("t_u_id >", value, "tUId");
            return (Criteria) this;
        }

        public Criteria andTUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_u_id >=", value, "tUId");
            return (Criteria) this;
        }

        public Criteria andTUIdLessThan(Integer value) {
            addCriterion("t_u_id <", value, "tUId");
            return (Criteria) this;
        }

        public Criteria andTUIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_u_id <=", value, "tUId");
            return (Criteria) this;
        }

        public Criteria andTUIdIn(List<Integer> values) {
            addCriterion("t_u_id in", values, "tUId");
            return (Criteria) this;
        }

        public Criteria andTUIdNotIn(List<Integer> values) {
            addCriterion("t_u_id not in", values, "tUId");
            return (Criteria) this;
        }

        public Criteria andTUIdBetween(Integer value1, Integer value2) {
            addCriterion("t_u_id between", value1, value2, "tUId");
            return (Criteria) this;
        }

        public Criteria andTUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_u_id not between", value1, value2, "tUId");
            return (Criteria) this;
        }

        public Criteria andCContentIsNull() {
            addCriterion("c_content is null");
            return (Criteria) this;
        }

        public Criteria andCContentIsNotNull() {
            addCriterion("c_content is not null");
            return (Criteria) this;
        }

        public Criteria andCContentEqualTo(String value) {
            addCriterion("c_content =", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotEqualTo(String value) {
            addCriterion("c_content <>", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentGreaterThan(String value) {
            addCriterion("c_content >", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentGreaterThanOrEqualTo(String value) {
            addCriterion("c_content >=", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLessThan(String value) {
            addCriterion("c_content <", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLessThanOrEqualTo(String value) {
            addCriterion("c_content <=", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLike(String value) {
            addCriterion("c_content like", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotLike(String value) {
            addCriterion("c_content not like", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentIn(List<String> values) {
            addCriterion("c_content in", values, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotIn(List<String> values) {
            addCriterion("c_content not in", values, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentBetween(String value1, String value2) {
            addCriterion("c_content between", value1, value2, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotBetween(String value1, String value2) {
            addCriterion("c_content not between", value1, value2, "cContent");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeIsNull() {
            addCriterion("c_createtime is null");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeIsNotNull() {
            addCriterion("c_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeEqualTo(Date value) {
            addCriterion("c_createtime =", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeNotEqualTo(Date value) {
            addCriterion("c_createtime <>", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeGreaterThan(Date value) {
            addCriterion("c_createtime >", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_createtime >=", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeLessThan(Date value) {
            addCriterion("c_createtime <", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("c_createtime <=", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeIn(List<Date> values) {
            addCriterion("c_createtime in", values, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeNotIn(List<Date> values) {
            addCriterion("c_createtime not in", values, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeBetween(Date value1, Date value2) {
            addCriterion("c_createtime between", value1, value2, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("c_createtime not between", value1, value2, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCThumbscountIsNull() {
            addCriterion("c_thumbscount is null");
            return (Criteria) this;
        }

        public Criteria andCThumbscountIsNotNull() {
            addCriterion("c_thumbscount is not null");
            return (Criteria) this;
        }

        public Criteria andCThumbscountEqualTo(Integer value) {
            addCriterion("c_thumbscount =", value, "cThumbscount");
            return (Criteria) this;
        }

        public Criteria andCThumbscountNotEqualTo(Integer value) {
            addCriterion("c_thumbscount <>", value, "cThumbscount");
            return (Criteria) this;
        }

        public Criteria andCThumbscountGreaterThan(Integer value) {
            addCriterion("c_thumbscount >", value, "cThumbscount");
            return (Criteria) this;
        }

        public Criteria andCThumbscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_thumbscount >=", value, "cThumbscount");
            return (Criteria) this;
        }

        public Criteria andCThumbscountLessThan(Integer value) {
            addCriterion("c_thumbscount <", value, "cThumbscount");
            return (Criteria) this;
        }

        public Criteria andCThumbscountLessThanOrEqualTo(Integer value) {
            addCriterion("c_thumbscount <=", value, "cThumbscount");
            return (Criteria) this;
        }

        public Criteria andCThumbscountIn(List<Integer> values) {
            addCriterion("c_thumbscount in", values, "cThumbscount");
            return (Criteria) this;
        }

        public Criteria andCThumbscountNotIn(List<Integer> values) {
            addCriterion("c_thumbscount not in", values, "cThumbscount");
            return (Criteria) this;
        }

        public Criteria andCThumbscountBetween(Integer value1, Integer value2) {
            addCriterion("c_thumbscount between", value1, value2, "cThumbscount");
            return (Criteria) this;
        }

        public Criteria andCThumbscountNotBetween(Integer value1, Integer value2) {
            addCriterion("c_thumbscount not between", value1, value2, "cThumbscount");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_comment
     *
     * @mbggenerated do_not_delete_during_merge Mon Nov 13 14:55:36 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_comment
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
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
package com.forchina_fn.pojo;

import java.util.ArrayList;
import java.util.List;

public class fnCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public fnCategoryExample() {
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

        public Criteria andCatidIsNull() {
            addCriterion("catid is null");
            return (Criteria) this;
        }

        public Criteria andCatidIsNotNull() {
            addCriterion("catid is not null");
            return (Criteria) this;
        }

        public Criteria andCatidEqualTo(Short value) {
            addCriterion("catid =", value, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidNotEqualTo(Short value) {
            addCriterion("catid <>", value, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidGreaterThan(Short value) {
            addCriterion("catid >", value, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidGreaterThanOrEqualTo(Short value) {
            addCriterion("catid >=", value, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidLessThan(Short value) {
            addCriterion("catid <", value, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidLessThanOrEqualTo(Short value) {
            addCriterion("catid <=", value, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidIn(List<Short> values) {
            addCriterion("catid in", values, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidNotIn(List<Short> values) {
            addCriterion("catid not in", values, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidBetween(Short value1, Short value2) {
            addCriterion("catid between", value1, value2, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidNotBetween(Short value1, Short value2) {
            addCriterion("catid not between", value1, value2, "catid");
            return (Criteria) this;
        }

        public Criteria andSiteIsNull() {
            addCriterion("site is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("site is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(Byte value) {
            addCriterion("site =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(Byte value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(Byte value) {
            addCriterion("site >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(Byte value) {
            addCriterion("site >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(Byte value) {
            addCriterion("site <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(Byte value) {
            addCriterion("site <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<Byte> values) {
            addCriterion("site in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<Byte> values) {
            addCriterion("site not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(Byte value1, Byte value2) {
            addCriterion("site between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(Byte value1, Byte value2) {
            addCriterion("site not between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeid is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeid is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Boolean value) {
            addCriterion("typeid =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Boolean value) {
            addCriterion("typeid <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Boolean value) {
            addCriterion("typeid >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("typeid >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Boolean value) {
            addCriterion("typeid <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Boolean value) {
            addCriterion("typeid <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Boolean> values) {
            addCriterion("typeid in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Boolean> values) {
            addCriterion("typeid not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Boolean value1, Boolean value2) {
            addCriterion("typeid between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("typeid not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andModelidIsNull() {
            addCriterion("modelid is null");
            return (Criteria) this;
        }

        public Criteria andModelidIsNotNull() {
            addCriterion("modelid is not null");
            return (Criteria) this;
        }

        public Criteria andModelidEqualTo(Short value) {
            addCriterion("modelid =", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotEqualTo(Short value) {
            addCriterion("modelid <>", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidGreaterThan(Short value) {
            addCriterion("modelid >", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidGreaterThanOrEqualTo(Short value) {
            addCriterion("modelid >=", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidLessThan(Short value) {
            addCriterion("modelid <", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidLessThanOrEqualTo(Short value) {
            addCriterion("modelid <=", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidIn(List<Short> values) {
            addCriterion("modelid in", values, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotIn(List<Short> values) {
            addCriterion("modelid not in", values, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidBetween(Short value1, Short value2) {
            addCriterion("modelid between", value1, value2, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotBetween(Short value1, Short value2) {
            addCriterion("modelid not between", value1, value2, "modelid");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentid is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentid is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Short value) {
            addCriterion("parentid =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Short value) {
            addCriterion("parentid <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Short value) {
            addCriterion("parentid >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Short value) {
            addCriterion("parentid >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Short value) {
            addCriterion("parentid <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Short value) {
            addCriterion("parentid <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Short> values) {
            addCriterion("parentid in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Short> values) {
            addCriterion("parentid not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Short value1, Short value2) {
            addCriterion("parentid between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Short value1, Short value2) {
            addCriterion("parentid not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidIsNull() {
            addCriterion("arrparentid is null");
            return (Criteria) this;
        }

        public Criteria andArrparentidIsNotNull() {
            addCriterion("arrparentid is not null");
            return (Criteria) this;
        }

        public Criteria andArrparentidEqualTo(String value) {
            addCriterion("arrparentid =", value, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidNotEqualTo(String value) {
            addCriterion("arrparentid <>", value, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidGreaterThan(String value) {
            addCriterion("arrparentid >", value, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidGreaterThanOrEqualTo(String value) {
            addCriterion("arrparentid >=", value, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidLessThan(String value) {
            addCriterion("arrparentid <", value, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidLessThanOrEqualTo(String value) {
            addCriterion("arrparentid <=", value, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidLike(String value) {
            addCriterion("arrparentid like", value, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidNotLike(String value) {
            addCriterion("arrparentid not like", value, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidIn(List<String> values) {
            addCriterion("arrparentid in", values, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidNotIn(List<String> values) {
            addCriterion("arrparentid not in", values, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidBetween(String value1, String value2) {
            addCriterion("arrparentid between", value1, value2, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andArrparentidNotBetween(String value1, String value2) {
            addCriterion("arrparentid not between", value1, value2, "arrparentid");
            return (Criteria) this;
        }

        public Criteria andChildIsNull() {
            addCriterion("child is null");
            return (Criteria) this;
        }

        public Criteria andChildIsNotNull() {
            addCriterion("child is not null");
            return (Criteria) this;
        }

        public Criteria andChildEqualTo(Boolean value) {
            addCriterion("child =", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildNotEqualTo(Boolean value) {
            addCriterion("child <>", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildGreaterThan(Boolean value) {
            addCriterion("child >", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildGreaterThanOrEqualTo(Boolean value) {
            addCriterion("child >=", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildLessThan(Boolean value) {
            addCriterion("child <", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildLessThanOrEqualTo(Boolean value) {
            addCriterion("child <=", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildIn(List<Boolean> values) {
            addCriterion("child in", values, "child");
            return (Criteria) this;
        }

        public Criteria andChildNotIn(List<Boolean> values) {
            addCriterion("child not in", values, "child");
            return (Criteria) this;
        }

        public Criteria andChildBetween(Boolean value1, Boolean value2) {
            addCriterion("child between", value1, value2, "child");
            return (Criteria) this;
        }

        public Criteria andChildNotBetween(Boolean value1, Boolean value2) {
            addCriterion("child not between", value1, value2, "child");
            return (Criteria) this;
        }

        public Criteria andArrchildidIsNull() {
            addCriterion("arrchildid is null");
            return (Criteria) this;
        }

        public Criteria andArrchildidIsNotNull() {
            addCriterion("arrchildid is not null");
            return (Criteria) this;
        }

        public Criteria andArrchildidEqualTo(String value) {
            addCriterion("arrchildid =", value, "arrchildid");
            return (Criteria) this;
        }

        public Criteria andArrchildidNotEqualTo(String value) {
            addCriterion("arrchildid <>", value, "arrchildid");
            return (Criteria) this;
        }

        public Criteria andArrchildidGreaterThan(String value) {
            addCriterion("arrchildid >", value, "arrchildid");
            return (Criteria) this;
        }

        public Criteria andArrchildidGreaterThanOrEqualTo(String value) {
            addCriterion("arrchildid >=", value, "arrchildid");
            return (Criteria) this;
        }

        public Criteria andArrchildidLessThan(String value) {
            addCriterion("arrchildid <", value, "arrchildid");
            return (Criteria) this;
        }

        public Criteria andArrchildidLessThanOrEqualTo(String value) {
            addCriterion("arrchildid <=", value, "arrchildid");
            return (Criteria) this;
        }

        public Criteria andArrchildidLike(String value) {
            addCriterion("arrchildid like", value, "arrchildid");
            return (Criteria) this;
        }

        public Criteria andArrchildidNotLike(String value) {
            addCriterion("arrchildid not like", value, "arrchildid");
            return (Criteria) this;
        }

        public Criteria andArrchildidIn(List<String> values) {
            addCriterion("arrchildid in", values, "arrchildid");
            return (Criteria) this;
        }

        public Criteria andArrchildidNotIn(List<String> values) {
            addCriterion("arrchildid not in", values, "arrchildid");
            return (Criteria) this;
        }

        public Criteria andArrchildidBetween(String value1, String value2) {
            addCriterion("arrchildid between", value1, value2, "arrchildid");
            return (Criteria) this;
        }

        public Criteria andArrchildidNotBetween(String value1, String value2) {
            addCriterion("arrchildid not between", value1, value2, "arrchildid");
            return (Criteria) this;
        }

        public Criteria andCatnameIsNull() {
            addCriterion("catname is null");
            return (Criteria) this;
        }

        public Criteria andCatnameIsNotNull() {
            addCriterion("catname is not null");
            return (Criteria) this;
        }

        public Criteria andCatnameEqualTo(String value) {
            addCriterion("catname =", value, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameNotEqualTo(String value) {
            addCriterion("catname <>", value, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameGreaterThan(String value) {
            addCriterion("catname >", value, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameGreaterThanOrEqualTo(String value) {
            addCriterion("catname >=", value, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameLessThan(String value) {
            addCriterion("catname <", value, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameLessThanOrEqualTo(String value) {
            addCriterion("catname <=", value, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameLike(String value) {
            addCriterion("catname like", value, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameNotLike(String value) {
            addCriterion("catname not like", value, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameIn(List<String> values) {
            addCriterion("catname in", values, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameNotIn(List<String> values) {
            addCriterion("catname not in", values, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameBetween(String value1, String value2) {
            addCriterion("catname between", value1, value2, "catname");
            return (Criteria) this;
        }

        public Criteria andCatnameNotBetween(String value1, String value2) {
            addCriterion("catname not between", value1, value2, "catname");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andMetaTitleIsNull() {
            addCriterion("meta_title is null");
            return (Criteria) this;
        }

        public Criteria andMetaTitleIsNotNull() {
            addCriterion("meta_title is not null");
            return (Criteria) this;
        }

        public Criteria andMetaTitleEqualTo(String value) {
            addCriterion("meta_title =", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleNotEqualTo(String value) {
            addCriterion("meta_title <>", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleGreaterThan(String value) {
            addCriterion("meta_title >", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleGreaterThanOrEqualTo(String value) {
            addCriterion("meta_title >=", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleLessThan(String value) {
            addCriterion("meta_title <", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleLessThanOrEqualTo(String value) {
            addCriterion("meta_title <=", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleLike(String value) {
            addCriterion("meta_title like", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleNotLike(String value) {
            addCriterion("meta_title not like", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleIn(List<String> values) {
            addCriterion("meta_title in", values, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleNotIn(List<String> values) {
            addCriterion("meta_title not in", values, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleBetween(String value1, String value2) {
            addCriterion("meta_title between", value1, value2, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleNotBetween(String value1, String value2) {
            addCriterion("meta_title not between", value1, value2, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andCatdirIsNull() {
            addCriterion("catdir is null");
            return (Criteria) this;
        }

        public Criteria andCatdirIsNotNull() {
            addCriterion("catdir is not null");
            return (Criteria) this;
        }

        public Criteria andCatdirEqualTo(String value) {
            addCriterion("catdir =", value, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirNotEqualTo(String value) {
            addCriterion("catdir <>", value, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirGreaterThan(String value) {
            addCriterion("catdir >", value, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirGreaterThanOrEqualTo(String value) {
            addCriterion("catdir >=", value, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirLessThan(String value) {
            addCriterion("catdir <", value, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirLessThanOrEqualTo(String value) {
            addCriterion("catdir <=", value, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirLike(String value) {
            addCriterion("catdir like", value, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirNotLike(String value) {
            addCriterion("catdir not like", value, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirIn(List<String> values) {
            addCriterion("catdir in", values, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirNotIn(List<String> values) {
            addCriterion("catdir not in", values, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirBetween(String value1, String value2) {
            addCriterion("catdir between", value1, value2, "catdir");
            return (Criteria) this;
        }

        public Criteria andCatdirNotBetween(String value1, String value2) {
            addCriterion("catdir not between", value1, value2, "catdir");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlpathIsNull() {
            addCriterion("urlpath is null");
            return (Criteria) this;
        }

        public Criteria andUrlpathIsNotNull() {
            addCriterion("urlpath is not null");
            return (Criteria) this;
        }

        public Criteria andUrlpathEqualTo(String value) {
            addCriterion("urlpath =", value, "urlpath");
            return (Criteria) this;
        }

        public Criteria andUrlpathNotEqualTo(String value) {
            addCriterion("urlpath <>", value, "urlpath");
            return (Criteria) this;
        }

        public Criteria andUrlpathGreaterThan(String value) {
            addCriterion("urlpath >", value, "urlpath");
            return (Criteria) this;
        }

        public Criteria andUrlpathGreaterThanOrEqualTo(String value) {
            addCriterion("urlpath >=", value, "urlpath");
            return (Criteria) this;
        }

        public Criteria andUrlpathLessThan(String value) {
            addCriterion("urlpath <", value, "urlpath");
            return (Criteria) this;
        }

        public Criteria andUrlpathLessThanOrEqualTo(String value) {
            addCriterion("urlpath <=", value, "urlpath");
            return (Criteria) this;
        }

        public Criteria andUrlpathLike(String value) {
            addCriterion("urlpath like", value, "urlpath");
            return (Criteria) this;
        }

        public Criteria andUrlpathNotLike(String value) {
            addCriterion("urlpath not like", value, "urlpath");
            return (Criteria) this;
        }

        public Criteria andUrlpathIn(List<String> values) {
            addCriterion("urlpath in", values, "urlpath");
            return (Criteria) this;
        }

        public Criteria andUrlpathNotIn(List<String> values) {
            addCriterion("urlpath not in", values, "urlpath");
            return (Criteria) this;
        }

        public Criteria andUrlpathBetween(String value1, String value2) {
            addCriterion("urlpath between", value1, value2, "urlpath");
            return (Criteria) this;
        }

        public Criteria andUrlpathNotBetween(String value1, String value2) {
            addCriterion("urlpath not between", value1, value2, "urlpath");
            return (Criteria) this;
        }

        public Criteria andItemsIsNull() {
            addCriterion("items is null");
            return (Criteria) this;
        }

        public Criteria andItemsIsNotNull() {
            addCriterion("items is not null");
            return (Criteria) this;
        }

        public Criteria andItemsEqualTo(Integer value) {
            addCriterion("items =", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsNotEqualTo(Integer value) {
            addCriterion("items <>", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsGreaterThan(Integer value) {
            addCriterion("items >", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsGreaterThanOrEqualTo(Integer value) {
            addCriterion("items >=", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsLessThan(Integer value) {
            addCriterion("items <", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsLessThanOrEqualTo(Integer value) {
            addCriterion("items <=", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsIn(List<Integer> values) {
            addCriterion("items in", values, "items");
            return (Criteria) this;
        }

        public Criteria andItemsNotIn(List<Integer> values) {
            addCriterion("items not in", values, "items");
            return (Criteria) this;
        }

        public Criteria andItemsBetween(Integer value1, Integer value2) {
            addCriterion("items between", value1, value2, "items");
            return (Criteria) this;
        }

        public Criteria andItemsNotBetween(Integer value1, Integer value2) {
            addCriterion("items not between", value1, value2, "items");
            return (Criteria) this;
        }

        public Criteria andListorderIsNull() {
            addCriterion("listorder is null");
            return (Criteria) this;
        }

        public Criteria andListorderIsNotNull() {
            addCriterion("listorder is not null");
            return (Criteria) this;
        }

        public Criteria andListorderEqualTo(Short value) {
            addCriterion("listorder =", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderNotEqualTo(Short value) {
            addCriterion("listorder <>", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderGreaterThan(Short value) {
            addCriterion("listorder >", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderGreaterThanOrEqualTo(Short value) {
            addCriterion("listorder >=", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderLessThan(Short value) {
            addCriterion("listorder <", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderLessThanOrEqualTo(Short value) {
            addCriterion("listorder <=", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderIn(List<Short> values) {
            addCriterion("listorder in", values, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderNotIn(List<Short> values) {
            addCriterion("listorder not in", values, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderBetween(Short value1, Short value2) {
            addCriterion("listorder between", value1, value2, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderNotBetween(Short value1, Short value2) {
            addCriterion("listorder not between", value1, value2, "listorder");
            return (Criteria) this;
        }

        public Criteria andIsmenuIsNull() {
            addCriterion("ismenu is null");
            return (Criteria) this;
        }

        public Criteria andIsmenuIsNotNull() {
            addCriterion("ismenu is not null");
            return (Criteria) this;
        }

        public Criteria andIsmenuEqualTo(Boolean value) {
            addCriterion("ismenu =", value, "ismenu");
            return (Criteria) this;
        }

        public Criteria andIsmenuNotEqualTo(Boolean value) {
            addCriterion("ismenu <>", value, "ismenu");
            return (Criteria) this;
        }

        public Criteria andIsmenuGreaterThan(Boolean value) {
            addCriterion("ismenu >", value, "ismenu");
            return (Criteria) this;
        }

        public Criteria andIsmenuGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ismenu >=", value, "ismenu");
            return (Criteria) this;
        }

        public Criteria andIsmenuLessThan(Boolean value) {
            addCriterion("ismenu <", value, "ismenu");
            return (Criteria) this;
        }

        public Criteria andIsmenuLessThanOrEqualTo(Boolean value) {
            addCriterion("ismenu <=", value, "ismenu");
            return (Criteria) this;
        }

        public Criteria andIsmenuIn(List<Boolean> values) {
            addCriterion("ismenu in", values, "ismenu");
            return (Criteria) this;
        }

        public Criteria andIsmenuNotIn(List<Boolean> values) {
            addCriterion("ismenu not in", values, "ismenu");
            return (Criteria) this;
        }

        public Criteria andIsmenuBetween(Boolean value1, Boolean value2) {
            addCriterion("ismenu between", value1, value2, "ismenu");
            return (Criteria) this;
        }

        public Criteria andIsmenuNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ismenu not between", value1, value2, "ismenu");
            return (Criteria) this;
        }

        public Criteria andCategorytplIsNull() {
            addCriterion("categorytpl is null");
            return (Criteria) this;
        }

        public Criteria andCategorytplIsNotNull() {
            addCriterion("categorytpl is not null");
            return (Criteria) this;
        }

        public Criteria andCategorytplEqualTo(String value) {
            addCriterion("categorytpl =", value, "categorytpl");
            return (Criteria) this;
        }

        public Criteria andCategorytplNotEqualTo(String value) {
            addCriterion("categorytpl <>", value, "categorytpl");
            return (Criteria) this;
        }

        public Criteria andCategorytplGreaterThan(String value) {
            addCriterion("categorytpl >", value, "categorytpl");
            return (Criteria) this;
        }

        public Criteria andCategorytplGreaterThanOrEqualTo(String value) {
            addCriterion("categorytpl >=", value, "categorytpl");
            return (Criteria) this;
        }

        public Criteria andCategorytplLessThan(String value) {
            addCriterion("categorytpl <", value, "categorytpl");
            return (Criteria) this;
        }

        public Criteria andCategorytplLessThanOrEqualTo(String value) {
            addCriterion("categorytpl <=", value, "categorytpl");
            return (Criteria) this;
        }

        public Criteria andCategorytplLike(String value) {
            addCriterion("categorytpl like", value, "categorytpl");
            return (Criteria) this;
        }

        public Criteria andCategorytplNotLike(String value) {
            addCriterion("categorytpl not like", value, "categorytpl");
            return (Criteria) this;
        }

        public Criteria andCategorytplIn(List<String> values) {
            addCriterion("categorytpl in", values, "categorytpl");
            return (Criteria) this;
        }

        public Criteria andCategorytplNotIn(List<String> values) {
            addCriterion("categorytpl not in", values, "categorytpl");
            return (Criteria) this;
        }

        public Criteria andCategorytplBetween(String value1, String value2) {
            addCriterion("categorytpl between", value1, value2, "categorytpl");
            return (Criteria) this;
        }

        public Criteria andCategorytplNotBetween(String value1, String value2) {
            addCriterion("categorytpl not between", value1, value2, "categorytpl");
            return (Criteria) this;
        }

        public Criteria andListtplIsNull() {
            addCriterion("listtpl is null");
            return (Criteria) this;
        }

        public Criteria andListtplIsNotNull() {
            addCriterion("listtpl is not null");
            return (Criteria) this;
        }

        public Criteria andListtplEqualTo(String value) {
            addCriterion("listtpl =", value, "listtpl");
            return (Criteria) this;
        }

        public Criteria andListtplNotEqualTo(String value) {
            addCriterion("listtpl <>", value, "listtpl");
            return (Criteria) this;
        }

        public Criteria andListtplGreaterThan(String value) {
            addCriterion("listtpl >", value, "listtpl");
            return (Criteria) this;
        }

        public Criteria andListtplGreaterThanOrEqualTo(String value) {
            addCriterion("listtpl >=", value, "listtpl");
            return (Criteria) this;
        }

        public Criteria andListtplLessThan(String value) {
            addCriterion("listtpl <", value, "listtpl");
            return (Criteria) this;
        }

        public Criteria andListtplLessThanOrEqualTo(String value) {
            addCriterion("listtpl <=", value, "listtpl");
            return (Criteria) this;
        }

        public Criteria andListtplLike(String value) {
            addCriterion("listtpl like", value, "listtpl");
            return (Criteria) this;
        }

        public Criteria andListtplNotLike(String value) {
            addCriterion("listtpl not like", value, "listtpl");
            return (Criteria) this;
        }

        public Criteria andListtplIn(List<String> values) {
            addCriterion("listtpl in", values, "listtpl");
            return (Criteria) this;
        }

        public Criteria andListtplNotIn(List<String> values) {
            addCriterion("listtpl not in", values, "listtpl");
            return (Criteria) this;
        }

        public Criteria andListtplBetween(String value1, String value2) {
            addCriterion("listtpl between", value1, value2, "listtpl");
            return (Criteria) this;
        }

        public Criteria andListtplNotBetween(String value1, String value2) {
            addCriterion("listtpl not between", value1, value2, "listtpl");
            return (Criteria) this;
        }

        public Criteria andShowtplIsNull() {
            addCriterion("showtpl is null");
            return (Criteria) this;
        }

        public Criteria andShowtplIsNotNull() {
            addCriterion("showtpl is not null");
            return (Criteria) this;
        }

        public Criteria andShowtplEqualTo(String value) {
            addCriterion("showtpl =", value, "showtpl");
            return (Criteria) this;
        }

        public Criteria andShowtplNotEqualTo(String value) {
            addCriterion("showtpl <>", value, "showtpl");
            return (Criteria) this;
        }

        public Criteria andShowtplGreaterThan(String value) {
            addCriterion("showtpl >", value, "showtpl");
            return (Criteria) this;
        }

        public Criteria andShowtplGreaterThanOrEqualTo(String value) {
            addCriterion("showtpl >=", value, "showtpl");
            return (Criteria) this;
        }

        public Criteria andShowtplLessThan(String value) {
            addCriterion("showtpl <", value, "showtpl");
            return (Criteria) this;
        }

        public Criteria andShowtplLessThanOrEqualTo(String value) {
            addCriterion("showtpl <=", value, "showtpl");
            return (Criteria) this;
        }

        public Criteria andShowtplLike(String value) {
            addCriterion("showtpl like", value, "showtpl");
            return (Criteria) this;
        }

        public Criteria andShowtplNotLike(String value) {
            addCriterion("showtpl not like", value, "showtpl");
            return (Criteria) this;
        }

        public Criteria andShowtplIn(List<String> values) {
            addCriterion("showtpl in", values, "showtpl");
            return (Criteria) this;
        }

        public Criteria andShowtplNotIn(List<String> values) {
            addCriterion("showtpl not in", values, "showtpl");
            return (Criteria) this;
        }

        public Criteria andShowtplBetween(String value1, String value2) {
            addCriterion("showtpl between", value1, value2, "showtpl");
            return (Criteria) this;
        }

        public Criteria andShowtplNotBetween(String value1, String value2) {
            addCriterion("showtpl not between", value1, value2, "showtpl");
            return (Criteria) this;
        }

        public Criteria andPagesizeIsNull() {
            addCriterion("pagesize is null");
            return (Criteria) this;
        }

        public Criteria andPagesizeIsNotNull() {
            addCriterion("pagesize is not null");
            return (Criteria) this;
        }

        public Criteria andPagesizeEqualTo(Short value) {
            addCriterion("pagesize =", value, "pagesize");
            return (Criteria) this;
        }

        public Criteria andPagesizeNotEqualTo(Short value) {
            addCriterion("pagesize <>", value, "pagesize");
            return (Criteria) this;
        }

        public Criteria andPagesizeGreaterThan(Short value) {
            addCriterion("pagesize >", value, "pagesize");
            return (Criteria) this;
        }

        public Criteria andPagesizeGreaterThanOrEqualTo(Short value) {
            addCriterion("pagesize >=", value, "pagesize");
            return (Criteria) this;
        }

        public Criteria andPagesizeLessThan(Short value) {
            addCriterion("pagesize <", value, "pagesize");
            return (Criteria) this;
        }

        public Criteria andPagesizeLessThanOrEqualTo(Short value) {
            addCriterion("pagesize <=", value, "pagesize");
            return (Criteria) this;
        }

        public Criteria andPagesizeIn(List<Short> values) {
            addCriterion("pagesize in", values, "pagesize");
            return (Criteria) this;
        }

        public Criteria andPagesizeNotIn(List<Short> values) {
            addCriterion("pagesize not in", values, "pagesize");
            return (Criteria) this;
        }

        public Criteria andPagesizeBetween(Short value1, Short value2) {
            addCriterion("pagesize between", value1, value2, "pagesize");
            return (Criteria) this;
        }

        public Criteria andPagesizeNotBetween(Short value1, Short value2) {
            addCriterion("pagesize not between", value1, value2, "pagesize");
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
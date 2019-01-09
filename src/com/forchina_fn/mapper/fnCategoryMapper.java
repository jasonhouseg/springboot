package com.forchina_fn.mapper;

import com.forchina_fn.pojo.FnCategory;
import com.forchina_fn.pojo.FnCategoryWithBLOBs;

public interface FnCategoryMapper {
    int deleteByPrimaryKey(Short catid);

    int insert(FnCategoryWithBLOBs record);

    int insertSelective(FnCategoryWithBLOBs record);

    FnCategoryWithBLOBs selectByPrimaryKey(Short catid);

    int updateByPrimaryKeySelective(FnCategoryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FnCategoryWithBLOBs record);

    int updateByPrimaryKey(FnCategory record);
}
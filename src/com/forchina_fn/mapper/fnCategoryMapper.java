package com.forchina_fn.mapper;

import com.forchina_fn.pojo.fnCategory;
import com.forchina_fn.pojo.fnCategoryExample;
import com.forchina_fn.pojo.fnCategoryWithBLOBs;
import java.util.List;

public interface fnCategoryMapper {
    int deleteByPrimaryKey(Short catid);

    int insert(fnCategoryWithBLOBs record);

    int insertSelective(fnCategoryWithBLOBs record);

    List<fnCategoryWithBLOBs> selectByExampleWithBLOBs(fnCategoryExample example);

    List<fnCategory> selectByExample(fnCategoryExample example);

    fnCategoryWithBLOBs selectByPrimaryKey(Short catid);

    int updateByPrimaryKeySelective(fnCategoryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(fnCategoryWithBLOBs record);

    int updateByPrimaryKey(fnCategory record);
}
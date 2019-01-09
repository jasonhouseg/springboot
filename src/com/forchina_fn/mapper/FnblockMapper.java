package com.forchina_fn.mapper;

import com.forchina_fn.pojo.Fnblock;
import com.forchina_fn.pojo.FnblockExample;
import java.util.List;

public interface FnblockMapper {
    int deleteByPrimaryKey(Short id);

    int insert(Fnblock record);

    int insertSelective(Fnblock record);

    List<Fnblock> selectByExampleWithBLOBs(FnblockExample example);

    List<Fnblock> selectByExample(FnblockExample example);

    Fnblock selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(Fnblock record);

    int updateByPrimaryKeyWithBLOBs(Fnblock record);

    int updateByPrimaryKey(Fnblock record);
}
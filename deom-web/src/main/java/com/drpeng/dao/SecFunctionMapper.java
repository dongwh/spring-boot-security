package com.drpeng.dao;

import com.drpeng.domain.SecFunction;
import com.drpeng.domain.SecFunctionExample;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SecFunctionMapper {
    int countByExample(SecFunctionExample example);

    int deleteByPrimaryKey(Integer funcId);

    int insert(SecFunction record);

    int insertSelective(SecFunction record);

    List<SecFunction> selectByExample(SecFunctionExample example);

    SecFunction selectByPrimaryKey(Integer funcId);

    int updateByPrimaryKeySelective(SecFunction record);

    int updateByPrimaryKey(SecFunction record);
}
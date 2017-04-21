package com.drpeng.dao;

import com.drpeng.domain.SecOperator;
import com.drpeng.domain.SecOperatorExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SecOperatorMapper {
    int countByExample(SecOperatorExample example);

    int deleteByPrimaryKey(Integer operatorId);

    int insert(SecOperator record);

    int insertSelective(SecOperator record);

    List<SecOperator> selectByExample(SecOperatorExample example);

    List<SecOperator> selectByCode(@Param("code") String code);

    SecOperator selectByPrimaryKey(Integer operatorId);

    int updateByPrimaryKeySelective(SecOperator record);

    int updateByPrimaryKey(SecOperator record);
}
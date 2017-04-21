package com.drpeng.dao;

import com.drpeng.domain.SecRole;
import com.drpeng.domain.SecRoleExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SecRoleMapper {
    int countByExample(SecRoleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(SecRole record);

    int insertSelective(SecRole record);

    List<SecRole> selectByExample(SecRoleExample example);

    SecRole selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(SecRole record);

    int updateByPrimaryKey(SecRole record);

    List<SecRole> selectRolesByOperatorId(@Param("operatorId") String operatorId);
}
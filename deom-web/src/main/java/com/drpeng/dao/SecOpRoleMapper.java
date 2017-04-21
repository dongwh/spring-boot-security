package com.drpeng.dao;

import com.drpeng.domain.SecOpRole;
import com.drpeng.domain.SecOpRoleExample;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SecOpRoleMapper {
    int countByExample(SecOpRoleExample example);

    int deleteByPrimaryKey(Integer opRoleId);

    int insert(SecOpRole record);

    int insertSelective(SecOpRole record);

    List<SecOpRole> selectByExample(SecOpRoleExample example);

    SecOpRole selectByPrimaryKey(Integer opRoleId);

    int updateByPrimaryKeySelective(SecOpRole record);

    int updateByPrimaryKey(SecOpRole record);
}
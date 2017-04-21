package com.drpeng.dao;

import com.drpeng.domain.SecRoleGrant;
import com.drpeng.domain.SecRoleGrantExample;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SecRoleGrantMapper {
    int countByExample(SecRoleGrantExample example);

    int deleteByPrimaryKey(Integer roleGrantId);

    int insert(SecRoleGrant record);

    int insertSelective(SecRoleGrant record);

    List<SecRoleGrant> selectByExample(SecRoleGrantExample example);

    SecRoleGrant selectByPrimaryKey(Integer roleGrantId);

    int updateByPrimaryKeySelective(SecRoleGrant record);

    int updateByPrimaryKey(SecRoleGrant record);
}
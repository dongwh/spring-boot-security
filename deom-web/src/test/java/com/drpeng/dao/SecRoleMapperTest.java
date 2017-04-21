package com.drpeng.dao;

import com.drpeng.domain.SecRole;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by dongwh on 17/4/19.
 */
/*@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:mappers/mybatis-config.xml"})*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class SecRoleMapperTest {
    @Autowired
    private SecRoleMapper secRoleMapper;

    @Test
    public void selectRolesByOperatorId() throws Exception {
        List<SecRole> roles = secRoleMapper.selectRolesByOperatorId("1");
        System.out.println("roles========"+roles);
    }

}
package com.drpeng.security;

import com.drpeng.dao.SecOperatorMapper;
import com.drpeng.dao.SecRoleMapper;
import com.drpeng.domain.SecOperator;
import com.drpeng.domain.SecRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dongwh on 17/4/19.
 * 通过该服务类知道当前登录的用户是什么角色
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

   /* @Autowired
    private SecOperatorMapper secOperatorMapper;
    @Autowired
    private SecRoleMapper secRoleMapper;*/

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        //得到operator
        //List<SecOperator> secOperators = secOperatorMapper.selectByCode(userName);
        // data
        List<SecOperator> secOperators = new ArrayList<>();
        SecOperator secOperator1 = new SecOperator();
        secOperator1.setOperatorId(1);
        secOperator1.setCode("admin");
        secOperator1.setPassword("password");
        secOperator1.setState(0);
        secOperator1.setLockFlag("N");
        SecOperator secOperator2 = new SecOperator();
        secOperator2.setOperatorId(2);
        secOperator2.setCode("user");
        secOperator2.setPassword("password");
        secOperator2.setState(0);
        secOperator2.setLockFlag("N");
        secOperators.add(secOperator1);
        secOperators.add(secOperator2);

        SecOperator operatorInfo = null;
        for (SecOperator secOperator : secOperators){
            if(secOperator.getCode().equals(userName)){
                operatorInfo = secOperator;
            }
        }
        if(null==operatorInfo ){
            throw new UsernameNotFoundException("++++++++++++++Username not found+++++++++++++++");
        }

        String code = String.valueOf(operatorInfo.getCode());
        String password = String.valueOf(operatorInfo.getPassword());
        String state = null==operatorInfo.getState()? "0" : String.valueOf(operatorInfo.getState());
        String lockFlag = null==operatorInfo.getLockFlag()? "N" : String.valueOf(operatorInfo.getLockFlag());

        UserDetails userDetails = new org.springframework.security.core.userdetails.User(code, password,
                "0".equals(state), true, true, !"Y".equals(lockFlag), getGrantedAuthorities(operatorInfo));
        return userDetails;
    }

    /**
     * 获得访问角色权限
     * @param user
     * @return
     */
    private List<GrantedAuthority> getGrantedAuthorities(SecOperator user){
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        /*List<SecRole> secRoles = secRoleMapper.selectRolesByOperatorId(String.valueOf(user.getOperatorId()));
        for(SecRole secRole : secRoles){
            authorities.add(new SimpleGrantedAuthority("ROLE_"+secRole.getRoleId()));
        }*/
        //data
        if(user.getOperatorId()==1){
            authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        }
        if(user.getOperatorId()==2){
            authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        }
        System.out.print("++++++++++++++++++++CustomUserDetailsService中的authorities :"+authorities);
        return authorities;
    }
}

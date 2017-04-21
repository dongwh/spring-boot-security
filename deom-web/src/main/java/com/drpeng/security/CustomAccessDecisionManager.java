package com.drpeng.security;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by dongwh on 17/4/19.
 */
@Service
public class CustomAccessDecisionManager implements AccessDecisionManager {

    //授权策略
    //authentication 是释CustomUserService中循环添加到 GrantedAuthority 对象中的权限信息集合.
    //object 包含客户端发起的请求的requset信息，可转换为 HttpServletRequest request = ((FilterInvocation) object).getHttpRequest();
    //configAttributes 为CustomInvocationSecurityMetadataSource的getAttributes(Object object)这个方法返回的结果，此方法是为了判定用户请求的url 是否在权限表中，如果在权限表中，则返回给 decide 方法，用来判定用户是否有此权限。如果不在权限表中则放行。
    @Override
    public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes) throws AccessDeniedException, InsufficientAuthenticationException {
        Collection<? extends GrantedAuthority> myRoles = authentication.getAuthorities();
        if (configAttributes == null) {
            return;
        }
        // 所请求的资源拥有的权限(一个资源对多个权限)
        Iterator<ConfigAttribute> iterator = configAttributes.iterator();
        while (iterator.hasNext()) {
            ConfigAttribute configAttribute = iterator.next(); // 前台传入的url的角色，getAttributes()获得的
            // 访问所请求资源所需要的权限
            String needPermission = configAttribute.getAttribute();
            System.out.println("===============needPermission is " + needPermission);

            // 用户所拥有的权限authentication
            for (GrantedAuthority myRole : myRoles) {// 当前登录的角色
                if (needPermission.equals(myRole.getAuthority())) {
                    // 说明此URL地址符合权限,可以放行
                    return;
                }
            }
        }
        // 没有权限  执行这里，后台是会抛异常的，但是界面会跳转到所配的access-denied-page页面
        throw new AccessDeniedException(" No Access Dendied ");
    }

    @Override
    public boolean supports(ConfigAttribute configAttribute) {
        return true;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}

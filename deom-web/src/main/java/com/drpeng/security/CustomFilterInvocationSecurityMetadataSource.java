package com.drpeng.security;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Service;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import java.util.*;

/**
 * Created by dongwh on 17/4/19.
 */
@Service
public class CustomFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

    private static Map<String, Collection<ConfigAttribute>> resourceMap = new HashMap<String, Collection<ConfigAttribute>>();
    private PathMatcher pathMatcher = new AntPathMatcher();

    public CustomFilterInvocationSecurityMetadataSource() {
        loadResourceDefine();
    }

    //加载所有url和权限（或角色）的对应关系
    private void loadResourceDefine() {
        Map<String, List<String>> functionsRoles = new HashMap<>();
        List<String> roles1 = new ArrayList<>();
        roles1.add("ADMIN");
        functionsRoles.put("hello",roles1);
        List<String> roles2 = new ArrayList<>();
        roles2.add("USER");
        roles2.add("ADMIN");
        functionsRoles.put("index",roles2);
        Collection<ConfigAttribute> atts = null;
        if(null!=functionsRoles && functionsRoles.size()>0){
            for (Map.Entry<String, List<String>> functionRoleInfo : functionsRoles.entrySet()) {
                String functionId = functionRoleInfo.getKey();
                ConfigAttribute ca ;
                atts = new ArrayList<ConfigAttribute>();
                List<String> rolesValue = functionRoleInfo.getValue();
                for(String roleId : rolesValue){
                    ca = new SecurityConfig("ROLE_"+ roleId);
                    atts.add(ca);
                }
                resourceMap.put("/"+functionId+"", atts);
            }
        }
    }
    //参数是要访问的url，返回这个url对于的所有权限（或角色）
    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        // object 是一个URL 被用户请求的url (将参数转为url)
        String url = ((FilterInvocation) object).getRequestUrl();
        System.out.println("requestUrl is 访问的URL地址为(包括参数)=" + url);
        if(null==resourceMap){
            loadResourceDefine();
        }
        int firstQuestionMarkIndex = url.indexOf("?");
        if (firstQuestionMarkIndex != -1) {
            url = url.substring(0, firstQuestionMarkIndex);
        }
        Iterator<String> ite = resourceMap.keySet().iterator();

        while (ite.hasNext()) {
            String resURL = ite.next();
            if (pathMatcher.match(resURL,url)) {//urlMatcher.pathMatchesUrl(url, resURL)
                return resourceMap.get(resURL);
            }
        }
        return null;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    /**
     * 如果为真则说明支持当前格式类型,才会到上面的 getAttributes 方法中
     * @param aClass
     * @return
     */
    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}

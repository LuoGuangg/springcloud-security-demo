package demo.guang.springcloud.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.security.server
 * @Description:
 * @date: 2018/10/20 9:39
 */
@Component("rbacService")
public class RbacServiceImpl implements RbacService{

    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    private Logger logger = LoggerFactory.getLogger(getClass());


    @Override
    public boolean hasPermission(HttpServletRequest request, Authentication authentication) {
        Object principal = authentication.getPrincipal();

        boolean hasPermission = false;
        if (principal instanceof UserDetails){
            String username = ((UserDetails)principal).getUsername();
            logger.info("-->判断用户的权限："+username);
            Set<String> urls = new HashSet<>();
            urls.add("/demo");
            for (String url: urls){
                if (antPathMatcher.match(url,request.getRequestURI())){
                    hasPermission = true;
                    break;
                }
            }
        }

        return hasPermission;
    }

}

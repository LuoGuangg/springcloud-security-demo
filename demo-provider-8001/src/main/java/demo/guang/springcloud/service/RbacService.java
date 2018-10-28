package demo.guang.springcloud.service;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.security.server
 * @Description:
 * @date: 2018/10/20 9:38
 */
public interface RbacService {

    boolean hasPermission(HttpServletRequest request, Authentication authentication);
}

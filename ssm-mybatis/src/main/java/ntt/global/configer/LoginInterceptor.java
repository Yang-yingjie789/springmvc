package ntt.global.configer;

import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p> 登录拦截器</p>
 *
 * @Author Yang yingjie(杨英杰)
 * @Created 2020/6/6 0:31
 */
public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登录拦截
        /**
         *  1. 请求的 URL中包含login 不要拦截
         *  2. session 是否存在
         *  3. 不符合以上两个拦截的需要跳转到 登录页面
         */
        if(request.getRequestURI().contains("login")){
            return true;
        }
        if(request.getSession().getAttribute("userLoginInfo")!=null){
            return true;
        }
        request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request,response);
        return false;
    }
}

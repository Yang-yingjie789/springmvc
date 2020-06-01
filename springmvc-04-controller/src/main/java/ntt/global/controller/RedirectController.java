package ntt.global.controller;

import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p></p>
 *
 * @Author Yang yingjie(杨英杰)
 * @Created 2020/6/1 21:44
 */
@Controller
public class RedirectController {
    @RequestMapping("/test")
    public String test(HttpServletRequest request,HttpServletResponse response){
        request.setAttribute("msg","hello 跳转");
        return "hello";
    }
    @RequestMapping("/test3")
    public String test3(HttpServletRequest request,HttpServletResponse response){
        request.setAttribute("msg","hello 跳转转发方式二");
        return "forward:hello";
    }
    @RequestMapping("/test2")
    public String test2(HttpServletRequest request,HttpServletResponse response){
        request.setAttribute("msg","hello 重定向");
        return "redirect:hello";
    }
}

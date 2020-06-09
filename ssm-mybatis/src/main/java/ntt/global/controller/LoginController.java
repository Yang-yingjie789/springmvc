package ntt.global.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * <p></p>
 *
 * @Author Yang yingjie(杨英杰)
 * @Created 2020/6/5 23:32
 */
@Controller
public class LoginController {


    @RequestMapping("/index")
    public String toIndexPage(){
        return "index";
    }
    @RequestMapping("/login.html")
    public String toLoginPage(){
        return "login";
    }
    @RequestMapping("/user/login")
    public String Login(String username, String password, HttpSession session){
        session.setAttribute("userLoginInfo",username);
        return "index";
    }

}

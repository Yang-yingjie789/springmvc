package ntt.global.controller;

/**
 * <p></p>
 *
 * @Author Yang yingjie(杨英杰)
 * @Created 2020/6/1 21:35
 */

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController1 {
    @RequestMapping("/hello")
    public ModelAndView sqtHello2(ModelAndView mv) {
        mv.addObject("msg","hello sya");
        mv.setViewName("hello");
        return mv;
    }
}

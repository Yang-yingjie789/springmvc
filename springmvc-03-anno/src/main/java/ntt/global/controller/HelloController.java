package ntt.global.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p></p>
 *
 * @Author Yang yingjie(杨英杰)
 * @Created 2020/5/31 15:33
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(Model model){
        model.addAttribute("msg","hello springmvc annotation");
        return "hello";
    }
    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public String sayHello2(ModelAndView modelAndView){
        modelAndView.addObject("msg","hello springmvc annotation");
        return "hello";
    }

    @RequestMapping(value = "/hello3",method = RequestMethod.GET)
    public String sayHello3(ModelMap modelMap){
        modelMap.addAttribute("msg","hello springmvc annotation");
        return "hello";
    }
}

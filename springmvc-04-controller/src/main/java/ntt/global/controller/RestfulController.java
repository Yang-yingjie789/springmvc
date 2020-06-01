package ntt.global.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.lang.annotation.Target;

/**
 * <p></p>
 *
 * @Author Yang yingjie(杨英杰)
 * @Created 2020/6/1 22:07
 */
@Controller
public class RestfulController {
    @GetMapping("/hello/{uid}/{sid}")
    public String test(@PathVariable(name = "uid") int fid, @PathVariable int sid, Model modelAndView){
        int result=fid+sid;
        System.out.println(result);
        modelAndView.addAttribute("msg",result);
        return "hello";
    }
  /*  @GetMapping("/hello/{uid}/{sid}")
    public String test2(@PathVariable int fid,@PathVariable int sid){
        ModelAndView modelAndView =new ModelAndView();
        int result=fid+sid;
        modelAndView.addObject("msg",result);
        return "forward:hello";
    }*/

    @RequestMapping ( value = "/hello/test" ,method = RequestMethod.POST)
    public String test(@RequestParam String username, Model modelAndView){
        System.out.println(username);
        modelAndView.addAttribute("msg",username);
        return "hello";
    }
    @RequestMapping ( path = "/hello/test1" ,method = RequestMethod.POST)
    public String test1(String username, Model modelAndView){
        System.out.println(username);
        modelAndView.addAttribute("msg",username);
        return "hello";
    }
}

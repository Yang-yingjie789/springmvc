package ntt.global.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ntt.global.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p></p>
 *
 * @Author Yang yingjie(杨英杰)
 * @Created 2020/6/1 23:12
 */
@Controller
public class TestController {
    @RequestMapping(value = "/json/1",produces = "text/application;charset=utf-8")
    @ResponseBody
    public  String jsonTest(){
        User user=new User(1,"杨英杰",25);
        return user.toString();
    }
    @RequestMapping(value = "/json/2")
    @ResponseBody
    public  String jsonTest2() throws JsonProcessingException {
        User user=new User(1,"杨英杰",25);
        ObjectMapper mapper=new ObjectMapper();
        String str = mapper.writeValueAsString(user);
        return str;
    }
}

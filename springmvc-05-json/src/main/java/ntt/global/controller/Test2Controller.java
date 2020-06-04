package ntt.global.controller;

import com.alibaba.fastjson.JSON;
import ntt.global.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * <p></p>
 *
 * @Author Yang yingjie(杨英杰)
 * @Created 2020/6/2 22:06
 */
@Controller
@ResponseBody
public class Test2Controller {
    @RequestMapping("/fastjson/11")
    public String test11(@RequestParam(required = true) String id){
        System.out.println(id);
        User user=new User(6,"哈哈哈",23);
        return JSON.toJSONString(user);
    }
    @RequestMapping("/fastjson/1")
    public String test1(String id){
        System.out.println(id);
        User user=new User(6,"哈哈哈",23);
        return JSON.toJSONString(user);
    }

    @RequestMapping("/fastjson/2")
    public String test2(User user){
        String json= JSON.toJSONString(user);
        System.out.println(json);
        return json;
    }
    @RequestMapping("/fastjson/3")
    public String test3(){
        List<User> userList=new ArrayList<User>();
        User user=new User(6,"哈哈哈",23);
        User user1=new User(6,"哈哈哈",23);
        User user2=new User(6,"哈哈哈",23);
        User user3=new User(6,"哈哈哈",23);
        User user4=new User(6,"哈哈哈",23);
        User user5=new User(6,"哈哈哈",23);
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        //========= Java 对象转 json 字符串======//
        String users= JSON.toJSONString(userList);
        String userJson=JSON.toJSONString(user1);
        System.out.println(users+"---"+userJson);
        //==========Json字符串 转java 对象=======//
        User jp=JSON.parseObject(userJson,User.class);
        System.out.println(jp);
        //==========java 对象转化成 Json

        return users+userJson;


    }
}

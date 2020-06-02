package ntt.global.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import ntt.global.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
        List<User> userList = new ArrayList<User>();
        User user=new User(1,"杨英杰",25);
        User user2=new User(1,"杨英杰",25);
        User user3=new User(1,"杨英杰",25);
        User user4=new User(1,"杨英杰",25);
        User user5=new User(1,"杨英杰",25);
        userList.add(user);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        ObjectMapper mapper=new ObjectMapper();
        String str = mapper.writeValueAsString(userList);
        return str;
    }
    @RequestMapping(value = "/json/3")
    @ResponseBody
    public  String jsonTest3() throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        Date date=new Date();
        return mapper.writeValueAsString(date);
    }
    @RequestMapping(value = "/json/4")
    @ResponseBody
    public  String jsonTest4() throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD HH:mm:ss.sss");
        Date date=new Date();

        return mapper.writeValueAsString(sdf.format(date));
    }
    @RequestMapping(value = "/json/5")
    @ResponseBody
    public  String jsonTest5() throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS,false);

        SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD HH:mm:ss.sss");
        mapper.setDateFormat(sdf);
        Date date=new Date();
        return mapper.writeValueAsString(date);
    }
}

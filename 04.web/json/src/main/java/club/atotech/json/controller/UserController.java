package club.atotech.json.controller;

import club.atotech.json.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/1/12 18:45
 */
//@Controller
@RestController
public class UserController {

//    @ResponseBody
    @GetMapping("/user")
    public List<User> getAllUser(){
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"1","1",new Date()));
        userList.add(new User(2,"2","2",new Date()));
        userList.add(new User(3,"3","3",new Date()));
        userList.add(new User(4,"4","4",new Date()));
        return userList;
    }
}

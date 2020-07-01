package org.javaboy.json.controller;

import org.javaboy.json.bean.User;
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
 * @date 2020/3/6 21:18
 */
//@Controller
    @RestController
public class UserController {

//    @ResponseBody
    @GetMapping("/user")
    public List<User> getAllUser(){
        List<User> users = new ArrayList<>();
        for (int i=0;i<10;i++){
            User user = new User();
            user.setId(i);
            user.setName("name"+i);
            user.setAddress("address"+i);
            user.setBirthday(new Date());
            users.add(user);
        }
        return users;
    }
}

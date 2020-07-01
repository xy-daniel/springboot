package org.javaboy.aop;

import org.javaboy.aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/9 22:18
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/test1")
    public String getUserNameById(Integer id){
        return userService.getUserNameById(id);
    }

    @GetMapping("/test2")
    public void deleteUserById(Integer id){
        userService.deleteUserById(id);
    }

}

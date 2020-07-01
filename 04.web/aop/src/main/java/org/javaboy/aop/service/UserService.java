package org.javaboy.aop.service;

import org.springframework.stereotype.Service;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/9 22:16
 */
@Service
public class UserService {

    public String getUserNameById(Integer id){
        System.out.println("getUserNameById");
        return "javaboy";
    }

    public void deleteUserById(Integer id){
        System.out.println("deleteUserById");
    }

}

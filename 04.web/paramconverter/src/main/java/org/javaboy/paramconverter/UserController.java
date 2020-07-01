package org.javaboy.paramconverter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/9 21:11
 */
@RestController
public class UserController {

    @GetMapping("/hello")
    public void hello(Date date){
        System.out.println(date);
    }
}

package org.javaboy.exception;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/7 16:02
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        int i = 1/0;
        return "hello";
    }
}

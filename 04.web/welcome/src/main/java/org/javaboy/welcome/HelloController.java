package org.javaboy.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/9 22:57
 */
@Controller
public class HelloController {

    @GetMapping("/index")
    public String hello(){
        return "index";
    }

}

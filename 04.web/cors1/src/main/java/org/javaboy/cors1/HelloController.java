package org.javaboy.cors1;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/7 20:52
 */
@RestController
//@CrossOrigin(origins = "http://localhost:8081")
public class HelloController {

    @GetMapping("/hello")
    //可以放在类上也可以放在方法上，还是有些麻烦  因此我们做一下配置
//    @CrossOrigin(origins = "http://localhost:8081")
    public String hello(){
        return "hello cors1";
    }

    @PutMapping("/doPut")
    //可以放在类上也可以放在方法上，还是有些麻烦  因此我们做一下配置
//    @CrossOrigin(origins = "http://localhost:8081")
    public String doPut(){
        return "doPut cors1";
    }
}

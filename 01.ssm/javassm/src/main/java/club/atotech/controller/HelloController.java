package club.atotech.controller;

import club.atotech.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hello", produces = "text/html;charset=utf-8")
    public String hello(){
        return helloService.sayHello();
    }

    @GetMapping("/data")
    public List<String> getData(){
        List<String> list = new ArrayList<String>();
        list.add("club.atotech---->1");
        list.add("club.atotech---->2");
        list.add("club.atotech---->3");
        list.add("club.atotech---->4");
        list.add("club.atotech---->5");
        return list;
    }
}

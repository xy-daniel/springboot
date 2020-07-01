package org.javaboy.controlleradvice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/7 15:31
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model){
        Map<String, Object> map = model.asMap();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key+":"+map.get(key));
            System.out.println(map.get(key));
            Map<String, Object> o = (Map<String, Object>)map.get(key);
            System.out.println(o.get("name"));
            System.out.println(o.get("address"));
        }
        return "hello";
    }
}

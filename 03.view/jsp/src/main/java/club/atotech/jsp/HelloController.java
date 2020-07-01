package club.atotech.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/1/12 18:30
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model, String name){
        model.addAttribute("name", name);
        return "hello";
    }
}

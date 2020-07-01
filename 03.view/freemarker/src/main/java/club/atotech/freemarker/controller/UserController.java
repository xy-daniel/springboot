package club.atotech.freemarker.controller;

import club.atotech.freemarker.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/user")
    public String user(Model model){
        List<User> userList = new ArrayList<>();
        userList.add(new User(1L, "user1", "user1"));
        userList.add(new User(2L, "user2", "user2"));
        userList.add(new User(3L, "user3", "user3"));
        model.addAttribute("userList", userList);
        return "user";
    }
}

package club.atotech.thymeleaf.controller;

import club.atotech.thymeleaf.bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/1/12 18:00
 */
@Controller
public class BookController {

    @GetMapping("/book")
    public String book(Model model){
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "1", "1", 1.0));
        bookList.add(new Book(2, "2", "2", 2.0));
        bookList.add(new Book(3, "3", "3", 3.0));
        bookList.add(new Book(4, "4", "4", 4.0));
        model.addAttribute("bookList", bookList);
        return "book";
    }

}

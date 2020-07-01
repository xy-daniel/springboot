package org.javaboy.controlleradvice;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/7 15:42
 */
@RestController
public class BookController {

    /**
     * 两个实体都包含name属性  因此会出现重叠的情况，所以这个时候我们就需要使用ControllerAdvice的请求参数预处理进行反馈真实的数据了
     * @param book  书籍
     * @param author    作者
     */
    @PostMapping("/book")
    public void addBook(@ModelAttribute("b") Book book, @ModelAttribute("a") Author author){
        System.out.println(book);
        System.out.println(author);
    }

}

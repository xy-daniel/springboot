package club.atotech.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/1/4 20:57
 */
@RestController
public class BookController {

    @Autowired
    Book book;

    @GetMapping("/book/show")
    public Book show(){
        return book;
    }

}

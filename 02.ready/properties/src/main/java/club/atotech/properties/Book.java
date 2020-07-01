package club.atotech.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/1/4 20:20
 */
@Component
@PropertySource("classpath:book.properties")
//一一对应自动注入
@ConfigurationProperties(prefix = "book")
public class Book {
//    @Value("${book.id}")
    private String id;
//    @Value("${book.name}")
    private String name;
//    @Value("${book.author}")
    private String author;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

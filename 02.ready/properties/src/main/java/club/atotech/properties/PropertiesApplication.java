package club.atotech.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 属性注入Value
 * 类型安全的属性注入ConfigurationProperties
 */
@SpringBootApplication
public class PropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(PropertiesApplication.class, args);
    }

}

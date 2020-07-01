package club.atotech.tomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 演示tomcat配置----》内嵌tomcat
 */
@SpringBootApplication
public class TomcatApplication {

    public static void main(String[] args) {
        SpringApplication.run(TomcatApplication.class, args);
    }

}

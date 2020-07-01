package club.atotech.yaml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * YAML配置对比properties配置
 * 1、有序-无需
 * 2、自定义的yaml暂时不支持使用注解直接注入到springboot项目中
 */
@SpringBootApplication
public class YamlApplication {

    public static void main(String[] args) {
        SpringApplication.run(YamlApplication.class, args);
    }

}

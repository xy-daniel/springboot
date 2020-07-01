package org.javaboy.cancelauto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

/**
 * 去除自动化配置
 */
@SpringBootApplication(exclude = WebMvcAutoConfiguration.class)
public class CancelautoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CancelautoApplication.class, args);
    }

}

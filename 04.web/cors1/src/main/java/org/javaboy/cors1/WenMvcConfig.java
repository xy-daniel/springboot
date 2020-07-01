package org.javaboy.cors1;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/7 22:08
 */
@Configuration
public class WenMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8081")
                .allowedHeaders("*")
                .allowedMethods("*")
                //有效时间
                .maxAge(30*1000);
    }
}

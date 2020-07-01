package org.javaboy.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/8 16:59
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    /**
     * 配置拦截器
     * @param registry  注册工具
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor()).addPathPatterns("/**");
    }

    @Bean
    MyInterceptor myInterceptor(){
        return new MyInterceptor();
    }
}

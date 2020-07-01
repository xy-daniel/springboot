package club.atotech.config;

import club.atotech.interceptor.MyInterceptors;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

/**
 * SpringMVC配置文件
 */
@Configuration
@ComponentScan(basePackages = "club.atotech", useDefaultFilters = false, includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class),@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)})
public class SpringMVCConfig extends WebMvcConfigurationSupport {

    /**
     * 配置静态资源映射
     * @param registry  注册器
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }

    /**
     * 配置拦截器
     * @param registry  注册器
     */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptorsBean()).addPathPatterns("/**");
    }

    @Bean
    MyInterceptors myInterceptorsBean(){
        return new MyInterceptors();
    }

    /**
     * 配置fastJson消息转换器
     * @param converters
     */
    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        converters.add(converter);
    }
}
package org.javaboy.json.config;

//import com.fasterxml.jackson.databind.ObjectMapper;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.text.SimpleDateFormat;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/6 21:39
 */
@Configuration
public class WebMvcConfig {

//    @Bean
//    MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter(){
//        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//        ObjectMapper om = new ObjectMapper();
//        om.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
//        converter.setObjectMapper(om);
//        return converter;
//    }

//    @Bean
//    ObjectMapper objectMapper(){
//        ObjectMapper om = new ObjectMapper();
//        om.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
//        //这两个方法可以设置很多东西根据需求进行配置就行
//        return om;
//    }

//    @Bean
//    GsonHttpMessageConverter gsonHttpMessageConverter(){
//        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
//        converter.setGson(new GsonBuilder().setDateFormat("yyyy/MM/dd").create());
//        return converter;
//    }

//    @Bean
//    Gson gson(){
//        return new GsonBuilder().setDateFormat("yyyy/MM/dd").create();
//    }

    @Bean
    FastJsonHttpMessageConverter fastJsonHttpMessageConverter(){
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        FastJsonConfig config = new FastJsonConfig();
        config.setDateFormat("yyyy-MM-dd");
        converter.setFastJsonConfig(config);
        return converter;
    }
}

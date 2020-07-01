package club.atotech.json.config;

//import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.text.SimpleDateFormat;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/1/12 18:58
 */
@Configuration
public class WebMvcConfig{

    /**
     * 注入bean
     * @return MappingJackson2HttpMessageConverter
     */
//    @Bean
//    MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter(){
//        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//        //起作用的还是 ObjectMapper----》因此是否我们只提供这个类如下
//        ObjectMapper om = new ObjectMapper();
//        om.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
//        converter.setObjectMapper(om);
//        return converter;
//    }
    //-----注释掉下面的这段代码，因为排除了jackson之后会报错，我们现在使用gson进行开发
//    @Bean
//    ObjectMapper objectMapper(){
//        ObjectMapper om = new ObjectMapper();
//        om.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
//        return om;
//    }

    /**
     * Gson的对象转换----》可以直接配置Gson如下
     * @return
     */
//    @Bean
//    GsonHttpMessageConverter gsonHttpMessageConverter(){
//        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setDateFormat("yyyy/MM/dd");
//        converter.setGson(gsonBuilder.create());
//        return converter;
//    }

    @Bean
    Gson gson(){
        return new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
    }
}

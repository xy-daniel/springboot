package org.javaboy.controlleradvice;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/7 15:28
 */
@ControllerAdvice
public class GlobalData {

    /**
     * 预设全局数据
     */
    @ModelAttribute(value = "info")
    public Map<String, Object> myData(){
        Map<String, Object> map = new HashMap<>();
        map.put("name", "javaboy");
        map.put("address", "www.javaboy.org");
        return map;
    }

    /**
     * 请求参数预处理
     */
    @InitBinder("a")
    public void initA(WebDataBinder binder){
        binder.setFieldDefaultPrefix("a.");
    }

    /**
     * 请求参数预处理
     */
    @InitBinder("b")
    public void initB(WebDataBinder binder){
        binder.setFieldDefaultPrefix("b.");
    }
}

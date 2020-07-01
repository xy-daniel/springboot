package org.javaboy.exception;

import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolver;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 自定义异常视图
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/7 16:40
 */
@Component
public class MyErrorViewResolver extends DefaultErrorViewResolver {


    /**
     * Create a new {@link DefaultErrorViewResolver} instance.
     *
     * @param applicationContext the source application context
     * @param resourceProperties resource properties
     */
    public MyErrorViewResolver(ApplicationContext applicationContext, ResourceProperties resourceProperties) {
        super(applicationContext, resourceProperties);
    }

    /**
     * 返回自定义异常视图
     * @param request  请求信息
     * @param status  状态码
     * @param model  异常数据
     * @return  自定义异常视图
     */
    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        ModelAndView view = new ModelAndView();
        view.setViewName("javaboy");
        view.addAllObjects(model);
        return view;
    }
}

package club.atotech.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * 代替WebXML
 */
public class WebInit implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) throws ServletException {
        //加载springMVC配置文件
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        //这儿的配置接在的是springmvc的配置文件，spring的配置文件一直没有用上---->解决方案：MVC检索Configuration
        ctx.register(SpringMVCConfig.class);
        //添加DispatcherServlet
        ServletRegistration.Dynamic springmvc = servletContext.addServlet("springmvc", new DispatcherServlet(ctx));
        //添加路径映射
        springmvc.addMapping("/");
        //给DispatcherServlet添加启动时机
        springmvc.setLoadOnStartup(1);
    }
}

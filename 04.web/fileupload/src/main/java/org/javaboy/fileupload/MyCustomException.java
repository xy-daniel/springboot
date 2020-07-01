package org.javaboy.fileupload;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 异常全局处理类
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/7 14:07
 */
@ControllerAdvice
public class MyCustomException {

    /**
     * 处理全局异常返回错误信息
     */
//    @ExceptionHandler(MaxUploadSizeExceededException.class)
//    public void myException(MaxUploadSizeExceededException e, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html;charset=utf-8");
//        PrintWriter out = response.getWriter();
//        out.write("上传文件大小超出限制");
//        out.flush();
//        out.close();
//    }

    /**
     * 处理全局异常返回错误页面
     */
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ModelAndView myException(MaxUploadSizeExceededException e) throws IOException {
        ModelAndView mav = new ModelAndView("error");
        mav.addObject("error", "上传文件大小超出限制");
        return mav;
    }

}

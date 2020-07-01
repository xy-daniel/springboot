package org.javaboy.fileupload;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/7 10:32
 */
@RestController
public class FileUploadController {
    SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/");
    @PostMapping("/upload")
    public String upload(MultipartFile file, HttpServletRequest request) {
        String format = sdf.format(new Date());
        String realPath = request.getServletContext().getRealPath("/img")+format;
        File folder = new File(realPath);
        if (!folder.exists()){
            folder.mkdirs();
        }
        String oldName = file.getOriginalFilename();
        String newName = UUID.randomUUID().toString()+oldName.substring(oldName.lastIndexOf("."));
        try {
            file.transferTo(new File(folder, newName));
            //返回真是路径
            String url = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/img"+format+ newName;
            return url;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "error";
    }

    @PostMapping("/uploadFiles")
    public String uploadFiles(MultipartFile[] files, HttpServletRequest request) {
        String format = sdf.format(new Date());
        String realPath = request.getServletContext().getRealPath("/img")+format;
        File folder = new File(realPath);
        if (!folder.exists()){
            folder.mkdirs();
        }
        for (MultipartFile file : files) {
            String oldName = file.getOriginalFilename();
            String newName = UUID.randomUUID().toString()+oldName.substring(oldName.lastIndexOf("."));
            try {
                file.transferTo(new File(folder, newName));
                //返回真是路径
                String url = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/img"+format+ newName;
                System.out.println(url);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "success";
    }

}

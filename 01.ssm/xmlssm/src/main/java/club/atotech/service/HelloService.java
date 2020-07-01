package club.atotech.service;

import org.springframework.stereotype.Service;

/**
 * @ClassName HelloService
 * @Author '丁代光'
 * @Date 2020/01/01
 * @Version V1.0
 **/
@Service
public class HelloService {
    public String sayHello() {
        return "hello";
    }
}

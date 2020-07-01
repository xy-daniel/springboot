package club.atotech.yaml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    RedisCluster redisCluster;

    @GetMapping("/show")
    public RedisCluster show(){
        return redisCluster;
    }
}

package club.atotech.yaml;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("redis")
public class RedisCluster {
    private Integer port;
    private List<String> host;
    private List<Redis> redis;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public List<String> getHost() {
        return host;
    }

    public void setHost(List<String> host) {
        this.host = host;
    }

    public List<Redis> getRedis() {
        return redis;
    }

    public void setRedis(List<Redis> redis) {
        this.redis = redis;
    }


    @Override
    public String toString() {
        return "RedisCluster{" +
                "port=" + port +
                ", host=" + host +
                ", redis=" + redis +
                '}';
    }
}

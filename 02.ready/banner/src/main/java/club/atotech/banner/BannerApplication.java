package club.atotech.banner;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BannerApplication {

    public static void main(String[] args) {
        //关闭banner
//        SpringApplication.run(BannerApplication.class, args);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(BannerApplication.class);
        SpringApplication build = builder.build();
        build.setBannerMode(Banner.Mode.OFF);
        build.run(args);
    }

}

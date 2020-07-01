package org.javaboy.commandliner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/8 17:07
 */
@Component
@Order(99)
public class MyCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("MyCommandLineRunner---->"+ Arrays.toString(args));
    }
}

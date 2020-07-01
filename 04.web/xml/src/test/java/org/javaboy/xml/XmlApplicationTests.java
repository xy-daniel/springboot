package org.javaboy.xml;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XmlApplicationTests {

    @Autowired
    SayHello sayHello;

    @Test
    void contextLoads() {
        System.out.println(sayHello.sayHello());
    }

}

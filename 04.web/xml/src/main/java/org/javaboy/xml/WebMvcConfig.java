package org.javaboy.xml;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/7 22:28
 */
@Configuration
@ImportResource(locations = "classpath:beans.xml")
public class WebMvcConfig {

}

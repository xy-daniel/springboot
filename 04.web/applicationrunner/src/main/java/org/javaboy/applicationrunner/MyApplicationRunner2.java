package org.javaboy.applicationrunner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/8 17:19
 */
@Component
@Order(1)
public class MyApplicationRunner2 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        //获取启动的所有参数
        String[] sourceArgs = args.getSourceArgs();
        System.out.println("MyApplicationRunner2>>>sourceArgs:"+ Arrays.toString(sourceArgs));
        //没有键的参数
        List<String> nonOptionArgs = args.getNonOptionArgs();
        System.out.println("MyApplicationRunner2>>>nonOptionArgs:"+ nonOptionArgs);
        System.out.println("=============================================");
        //key-value形式的参数
        //获取所有的key
        Set<String> optionNames = args.getOptionNames();
        for (String optionName : optionNames) {
            List<String> optionValues = args.getOptionValues(optionName);
            System.out.println(optionName+":"+optionValues);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

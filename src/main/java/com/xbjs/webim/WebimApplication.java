package com.xbjs.webim;

import com.xbjs.webim.controller.WebSocketController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xincheng.zhao
 * @date: 2018 /8/2
 * @description:
 */
@SpringBootApplication
@MapperScan("com.xbjs.webim.mapper.*")
public class WebimApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(WebimApplication.class);
        ConfigurableApplicationContext configurableApplicationContext = springApplication.run(args);
        //解决WebSocket不能注入的问题
        WebSocketController.setApplicationContext(configurableApplicationContext);
    }
}

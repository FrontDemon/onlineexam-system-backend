package com.mwt.oes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 *
 * 使用@SpringBootApplication启动类进行启动时需要下面这段代码，但生成war包部署在tomcat中不需要这段
 * 若打成war包使用tomcat运行的话,则注释掉这个类中serverEndpointExporter 方法.
 *
 */
@Configuration
public class WebSocketConfig {
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
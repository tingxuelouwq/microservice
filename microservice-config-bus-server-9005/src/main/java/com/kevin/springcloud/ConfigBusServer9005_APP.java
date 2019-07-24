package com.kevin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 类名: ConfigBusServer_APP<br/>
 * 包名：PACKAGE_NAME<br/>
 * 作者：kevin<br/>
 * 时间：2019/7/24 9:31<br/>
 * 版本：1.0<br/>
 * 描述：
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigBusServer9005_APP {
    public static void main(String[] args) {
        SpringApplication.run(ConfigBusServer9005_APP.class, args);
    }
}

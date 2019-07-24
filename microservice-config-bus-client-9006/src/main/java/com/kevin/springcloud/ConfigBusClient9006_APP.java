package com.kevin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 类名: ConfigBusClient9006_APP<br/>
 * 包名：com.kevin.springcloud<br/>
 * 作者：kevin<br/>
 * 时间：2019/7/24 9:39<br/>
 * 版本：1.0<br/>
 * 描述：
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigBusClient9006_APP {
    public static void main(String[] args) {
        SpringApplication.run(ConfigBusClient9006_APP.class, args);
    }
}

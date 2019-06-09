package com.kevin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @类名: DeptConsumer80_App<br />
 * @包名：com.kevin.springcloud<br/>
 * @作者：kevin<br/>
 * @时间：2019/3/19 21:17<br/>
 * @版本：1.0<br/>
 * @描述：<br/>
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.kevin.springcloud"})
public class DeptConsumerFeign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign_App.class, args);
    }
}

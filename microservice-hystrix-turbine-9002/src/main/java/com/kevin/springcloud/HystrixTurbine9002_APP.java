package com.kevin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 类名: HystrixTurbine9002_APP<br/>
 * 包名：com.kevin.springcloud<br/>
 * 作者：kevin<br/>
 * 时间：2019/7/29 15:18<br/>
 * 版本：1.0<br/>
 * 描述：<br/>
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
@EnableTurbine
public class HystrixTurbine9002_APP {
    public static void main(String[] args) {
        SpringApplication.run(HystrixTurbine9002_APP.class, args);
    }
}

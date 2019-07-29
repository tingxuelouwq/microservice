package com.kevin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @类名: HystrixDashboard9001_APP<br />
 * @包名：com.kevin.springcloud<br/>
 * @作者：kevin<br/>
 * @时间：2019/6/20 23:06<br/>
 * @版本：1.0<br/>
 * @描述：<br/>
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
public class HystrixDashboard9001_APP {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9001_APP.class, args);
    }
}

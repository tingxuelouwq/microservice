package com.kevin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @类名: DeptConsumer_DashBoard_App<br />
 * @包名：com.kevin.springcloud<br/>
 * @作者：kevin<br/>
 * @时间：2019/6/20 23:06<br/>
 * @版本：1.0<br/>
 * @描述：<br/>
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_DashBoard_App.class, args);
    }
}

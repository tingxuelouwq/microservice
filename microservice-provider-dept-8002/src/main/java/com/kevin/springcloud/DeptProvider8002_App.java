package com.kevin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @类名: DeptProvider8002_App<br />
 * @包名：com.kevin.springcloud<br/>
 * @作者：kevin<br/>
 * @时间：2019/3/18 22:26<br/>
 * @版本：1.0<br/>
 * @描述：<br/>
 */
@SpringBootApplication
@EnableEurekaClient  //本服务启动后会自动注册进eureka服务中
//@EnableDiscoveryClient  // 服务发现
public class DeptProvider8002_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_App.class, args);
    }
}

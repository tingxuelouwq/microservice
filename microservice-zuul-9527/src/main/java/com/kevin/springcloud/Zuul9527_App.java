package com.kevin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @类名: com.kevin.springcloud.Zuul9527_App<br />
 * @包名：PACKAGE_NAME<br/>
 * @作者：kevin<br/>
 * @时间：2019/7/14 22:50<br/>
 * @版本：1.0<br/>
 * @描述：<br/>
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul9527_App {
    public static void main(String[] args) {
        SpringApplication.run(Zuul9527_App.class, args);
    }
}

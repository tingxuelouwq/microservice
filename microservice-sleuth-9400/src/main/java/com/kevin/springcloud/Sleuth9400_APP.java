package com.kevin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * 类名: Sleuth9400_APP<br/>
 * 包名：PACKAGE_NAME<br/>
 * 作者：kevin<br/>
 * 时间：2019/7/24 17:58<br/>
 * 版本：1.0<br/>
 * 描述：
 */
@SpringBootApplication
@EnableZipkinServer
public class Sleuth9400_APP {
    public static void main(String[] args) {
        SpringApplication.run(Sleuth9400_APP.class, args);
    }
}

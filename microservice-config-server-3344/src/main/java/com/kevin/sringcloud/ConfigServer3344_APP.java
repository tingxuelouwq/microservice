package com.kevin.sringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @类名: Config3344_APP<br />
 * @包名：com.kevin.sringcloud<br/>
 * @作者：kevin<br/>
 * @时间：2019/7/17 21:38<br/>
 * @版本：1.0<br/>
 * @描述：<br/>
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer3344_APP {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer3344_APP.class, args);
    }
}

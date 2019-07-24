package com.kevin.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名: ClientController<br/>
 * 包名：com.kevin.springcloud.controller<br/>
 * 作者：kevin<br/>
 * 时间：2019/7/24 9:40<br/>
 * 版本：1.0<br/>
 * 描述：
 */
@RestController
@RefreshScope
public class ClientController {

    @Value("${profile}")
    private String profile;

    @GetMapping("/config")
    public String getConfig() {
        String config = "profile: " + profile;
        System.out.println("******" + config);
        return config;
    }
}


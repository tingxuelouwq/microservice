package com.kevin.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名: ConfigClientRest<br />
 * @包名：com.kevin.springcloud<br/>
 * @作者：kevin<br/>
 * @时间：2019/7/21 9:27<br/>
 * @版本：1.0<br/>
 * @描述：<br/>
 */
@RestController
public class ConfigClientRest {

    @Value("${profile}")
    private String profile;
    @RequestMapping("/config")
    public String getConfig() {
        String config = "profile: " + profile;
        System.out.println("******" + config);
        return config;
    }
}

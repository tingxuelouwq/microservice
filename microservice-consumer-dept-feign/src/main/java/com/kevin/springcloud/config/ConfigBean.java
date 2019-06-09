package com.kevin.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @类名: ConfigBean<br />
 * @包名：com.kevin.springcloud.config<br/>
 * @作者：kevin<br/>
 * @时间：2019/3/19 20:51<br/>
 * @版本：1.0<br/>
 * @描述：<br/>
 */
@Configuration
public class ConfigBean {

    @Bean
    public IRule myRule() {
//        return new RoundRobinRule();
        return new RandomRule();
//        return new RetryRule();
    }
}

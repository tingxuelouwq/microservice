package com.kevin.springcloud.controller;

import com.kevin.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @类名: DeptController_Consumer<br />
 * @包名：com.kevin.springcloud.controller<br/>
 * @作者：kevin<br/>
 * @时间：2019/3/19 20:56<br/>
 * @版本：1.0<br/>
 * @描述：<br/>
 */
@RestController
public class DeptController_Consumer {

//    private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://MICROSERVICE-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/dept/add")
    public int add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Integer.class);
    }

    @RequestMapping("/consumer/dept/{deptno}")
    public Dept get(@PathVariable("deptno") String deptno) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/" + deptno, Dept.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }

    @RequestMapping("/consumer/dept/discovery")
    public Object discory() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
    }
}

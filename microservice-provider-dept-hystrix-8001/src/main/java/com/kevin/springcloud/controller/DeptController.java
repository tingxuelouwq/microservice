package com.kevin.springcloud.controller;

import com.kevin.springcloud.entity.Dept;
import com.netflix.discovery.DiscoveryManager;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import com.kevin.springcloud.service.DeptService;

import java.util.List;

/**
 * @类名: DeptController<br />
 * @包名：com.kevin.springcloud.controller<br/>
 * @作者：kevin<br/>
 * @时间：2019/3/18 22:22<br/>
 * @版本：1.0<br/>
 * @描述：<br/>
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient client;

    @PostMapping("/add")
    public int add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    /**
     *  一旦调用方法调用失败后并抛出错误信息后，会自动调用@HystrixCommand标注的fallbackMethod中的指定方法
     */
    @GetMapping("/{deptno}")
    @HystrixCommand(fallbackMethod = "processHystrixGet")
    public Dept get(@PathVariable("deptno") Long deptno) {
        Dept dept = deptService.get(deptno);
        if (null == dept) {
            throw new RuntimeException("该ID: " + deptno + "没有对应的信息");
        }
        return dept;
    }

    public Dept processHystrixGet(@PathVariable("deptno") Long deptno) {
        return new Dept().setDeptno(deptno)
                .setDname("该ID: " + deptno + "没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }

    @GetMapping("/list")
    public List<Dept> list() {
        return deptService.list();
    }

    @GetMapping("/discovery")
    public Object discovery() {
        List<String> list = client.getServices();
        List<ServiceInstance> srvList = client.getInstances("MICROSERVICE-DEPT");
        for (ServiceInstance srv : srvList) {
            System.out.println(srv.getServiceId() + "\t" + srv.getHost() + "\t" + srv.getPort() + "\t" + srv.getUri());
        }
        return this.client;
    }

    @GetMapping("/offline")
    public void offline() {
        DiscoveryManager.getInstance().shutdownComponent();
    }
}

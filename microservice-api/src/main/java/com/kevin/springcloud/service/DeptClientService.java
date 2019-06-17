package com.kevin.springcloud.service;

import com.kevin.springcloud.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @类名: DeptClientService<br />
 * @包名：com.kevin.springcloud.service<br/>
 * @作者：kevin<br/>
 * @时间：2019/6/8 20:55<br/>
 * @版本：1.0<br/>
 * @描述：<br/>
 */
@FeignClient(value = "MICROSERVICE-DEPT",
//        fallbackFactory = DeptClientServiceFallbackFactory.class)
        fallback = DeptClientServiceFallback.class)
public interface DeptClientService {

    @PostMapping("/dept/add")
    int add(@RequestBody Dept dept);

    @GetMapping("/dept/{deptno}")
    Dept get(@PathVariable("deptno") Long deptno);

    @GetMapping("/dept/list")
    List<Dept> list();
}

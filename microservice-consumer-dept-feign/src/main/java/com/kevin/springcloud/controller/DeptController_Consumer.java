package com.kevin.springcloud.controller;

import com.kevin.springcloud.entity.Dept;
import com.kevin.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping("/consumer/dept/add")
    public int add(@RequestBody Dept dept) {
        return deptClientService.add(dept);
    }

    @RequestMapping("/consumer/dept/{deptno}")
    public Dept get(@PathVariable("deptno") Long deptno) {
        return deptClientService.get(deptno);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {
        return deptClientService.list();
    }
}

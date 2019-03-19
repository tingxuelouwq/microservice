package com.kevin.springcloud.controller;

import com.kevin.springcloud.entity.Dept;
import com.kevin.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add")
    public int add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @GetMapping("/{deptno}")
    public Dept get(@PathVariable("deptno") Long deptno) {
        return deptService.get(deptno);
    }

    @GetMapping("/list")
    public List<Dept> list() {
        return deptService.list();
    }
}

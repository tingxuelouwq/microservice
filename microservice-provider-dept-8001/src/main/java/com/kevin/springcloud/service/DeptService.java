package com.kevin.springcloud.service;

import com.kevin.springcloud.entity.Dept;

import java.util.List;

/**
 * @类名: DeptService<br />
 * @包名：com.kevin.springcloud.service<br/>
 * @作者：kevin<br/>
 * @时间：2019/3/18 22:12<br/>
 * @版本：1.0<br/>
 * @描述：<br/>
 */
public interface DeptService {

    int add(Dept dept);

    Dept get(Long deptno);

    List<Dept> list();
}

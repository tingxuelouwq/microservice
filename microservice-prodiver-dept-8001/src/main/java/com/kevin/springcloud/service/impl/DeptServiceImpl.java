package com.kevin.springcloud.service.impl;

import com.kevin.springcloud.dao.DeptMapper;
import com.kevin.springcloud.entity.Dept;
import com.kevin.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @类名: DeptServiceImpl<br />
 * @包名：com.kevin.springcloud.service.impl<br/>
 * @作者：kevin<br/>
 * @时间：2019/3/18 22:20<br/>
 * @版本：1.0<br/>
 * @描述：<br/>
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public int add(Dept dept) {
        return deptMapper.add(dept);
    }

    @Override
    public Dept get(Long deptno) {
        return deptMapper.selectByPrimaryKey(deptno);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.findAll();
    }
}

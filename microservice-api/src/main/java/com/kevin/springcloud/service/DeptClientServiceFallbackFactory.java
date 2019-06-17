//package com.kevin.springcloud.service;
//
//import com.kevin.springcloud.entity.Dept;
//import feign.hystrix.FallbackFactory;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
///**
// * @类名: DeptClientServiceFallbackFactory<br />
// * @包名：com.kevin.springcloud.service<br/>
// * @作者：kevin<br/>
// * @时间：2019/6/17 21:28<br/>
// * @版本：1.0<br/>
// * @描述：<br/>
// */
//@Component
//public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
//    @Override
//    public DeptClientService create(Throwable cause) {
//        return new DeptClientService() {
//            @Override
//            public int add(Dept dept) {
//                return 0;
//            }
//
//            @Override
//            public Dept get(Long deptno) {
//                return new Dept().setDeptno(deptno).setDname("该ID：" + deptno + "没有对应的信息," +
//                        "这是Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
//                        .setDb_source("no this database in MySQL");
//            }
//
//            @Override
//            public List<Dept> list() {
//                return null;
//            }
//        };
//    }
//}

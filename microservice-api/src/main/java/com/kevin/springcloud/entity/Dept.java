package com.kevin.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 类名: Dept<br/>
 * 包名：com.kevin.com.kevin.springcloud<br/>
 * 作者：kevin<br/>
 * 时间：2019/3/14 9:23<br/>
 * 版本：1.0<br/>
 * 描述：
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    private static final long serialVersionUID = -3081954497465008580L;
    private Long deptno;        // 主键
    private String dname;       // 部门名称
    private String db_source;   // 来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        this.dname = dname;
    }
}

package com.newcapec.entity;

import lombok.Data;
import lombok.ToString;

import java.util.List;


@Data
@ToString
public class Dept {
    private Integer deptno;
    private String dname;
    private String loc;

    /**
     * 关系属性:一对多
     */
    List<Emp> empList;
}
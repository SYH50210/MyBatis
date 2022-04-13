package com.newcapec.entity;

/**
 * @ClassName Dept
 * @Description TODO
 * @Author Sunyuhang
 * @Date 2022年04月13日 16:31
 * @Version 1.0
 */
public class Dept {
    private Integer deptNo;
    private String dName;
    private String loc;

    public Dept() {
    }

    public Dept(Integer deptNo, String dName, String loc) {
        this.deptNo = deptNo;
        this.dName = dName;
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptNo=" + deptNo +
                ", dName='" + dName + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}

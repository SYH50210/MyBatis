package com.newcapec.entity;

import javafx.beans.property.ObjectProperty;

/**
 * @ClassName Stu
 * @Description TODO
 * @Author Sunyuhang
 * @Date 2022年04月14日 17:28
 * @Version 1.0
 */
public class Stu {
    private Integer id;
    private String name;
    private Integer age;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

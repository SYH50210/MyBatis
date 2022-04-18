package com.newcapec.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Person implements Serializable {
    private Integer id;
    private String personName;
    private Integer personAge;
    private String personAddress;
}
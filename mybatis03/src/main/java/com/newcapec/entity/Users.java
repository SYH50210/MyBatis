package com.newcapec.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Users {
    private Integer id;
    private String username;
    private String password;
    private String realname;
}
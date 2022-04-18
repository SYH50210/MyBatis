package com.newcapec.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName OrdersQuery
 * @Description TODO
 * @Author Sunyuhang
 * @Date 2022年04月15日 15:25
 * @Version 1.0
 */
@Data
@ToString
public class OrdersQuery {
    // 订单属性
    private Integer id;
    private String orderNumber;
    private Double totalPrice;
    private String status;
    private Integer userId;
    // 用户属性
    private String username;
    private String password;
    private String realname;
}

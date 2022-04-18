package com.newcapec.entity;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @ClassName Orders
 * @Description 订单实体类
 * @Author Sunyuhang
 * @Date 2022年04月15日 15:44
 * @Version 1.0
 */
@Data
@ToString
public class Orders {
    private Integer id;
    private String orderNumber;
    private Double totalPrice;
    private String status;
    private Integer userId;

    /**
     * 一对一关系属性
     */
    private Users users;

    /**
     * 一对多关系属性
     */
    private List<OrdersDetail> ordersDetailList;
}

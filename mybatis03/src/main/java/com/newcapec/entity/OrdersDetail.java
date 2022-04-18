package com.newcapec.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OrdersDetail {
    private Integer id;
    private Integer amount;
    private Integer ordersId;
    private Integer goodsId;

    private Goods goods;
}
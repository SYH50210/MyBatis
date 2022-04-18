package com.newcapec.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName Goods
 * @Description 商品实体类
 * @Author Sunyuhang
 * @Date 2022年04月15日 16:38
 * @Version 1.0
 */
@Data
@ToString
public class Goods {
    private Integer id;
    private String goodsName;
    private String description;
    private Double price;
}

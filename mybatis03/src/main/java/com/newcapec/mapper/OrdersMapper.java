package com.newcapec.mapper;

import com.newcapec.entity.Orders;
import com.newcapec.entity.OrdersQuery;

import java.util.List;

/**
 * @InterfaceName OrdersMapper
 * @Description TODO
 * @Author Sunyuhang
 * @Date 2022年04月15日 15:29
 * @Version 1.0
 */
public interface OrdersMapper {

    List<OrdersQuery> selectOrderResultType();

    List<Orders> findOneToOne();

    List<Orders> findOneToMany();

    List<Orders> findManyToMany();
}

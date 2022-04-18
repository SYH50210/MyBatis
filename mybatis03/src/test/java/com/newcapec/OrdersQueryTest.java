package com.newcapec;

import com.newcapec.entity.Orders;
import com.newcapec.entity.OrdersQuery;
import com.newcapec.mapper.OrdersMapper;
import com.newcapec.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName OrdersQueryTest
 * @Description TODO
 * @Author Sunyuhang
 * @Date 2022年04月15日 15:35
 * @Version 1.0
 */
public class OrdersQueryTest {
    SqlSession sqlSession;
    OrdersMapper mapper;

    @Before
    public void before() {
        sqlSession = MyBatisUtil.getSqlSession();
        mapper = sqlSession.getMapper(OrdersMapper.class);
    }

    @Test
    public void selectOrderResultTypeTest() {
        List<OrdersQuery> list = mapper.selectOrderResultType();
        list.forEach(System.out::println);
    }

    @Test
    public void testOneToOne(){
        List<Orders> orders = mapper.findOneToOne();
        orders.forEach(System.out::println);
    }

    @Test
    public void testOneToMany(){
        List<Orders> orders = mapper.findOneToMany();
        orders.forEach(System.out::println);
    }

    @Test
    public void testManyToMany(){
        List<Orders> orders = mapper.findManyToMany();
        orders.forEach(System.out::println);
    }

    @After
    public void after(){
        sqlSession.close();
    }
}

package com.newcapec.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * @ClassName MyBatisUtil
 * @Description TODO
 * @Author Sunyuhang
 * @Date 2022年04月13日 15:06
 * @Version 1.0
 */
public class MyBatisUtil {

    private static SqlSessionFactory factory;

    private MyBatisUtil() {
    }

    static {
        try {
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            factory = builder.build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static SqlSession getSqlSession(){
        return factory.openSession();
    }
}

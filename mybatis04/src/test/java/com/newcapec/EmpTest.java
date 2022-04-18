package com.newcapec;

import com.newcapec.entity.Emp;
import com.newcapec.mapper.EmpMapper;
import com.newcapec.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName EmpTest
 * @Description TODO
 * @Author Sunyuhang
 * @Date 2022年04月18日 17:09
 * @Version 1.0
 */
public class EmpTest {
    private SqlSession sqlSession;
    private EmpMapper empMapper;

    @Before
    public void init() {
        sqlSession = MyBatisUtil.getSqlSession();
        empMapper = sqlSession.getMapper(EmpMapper.class);
    }

    @Test
    public void testSelect() {
        List<Emp> emps = empMapper.select();
        for (Emp emp : emps) {
            System.out.println(emp.getEname()+","+emp.getJob()+","+emp.getDept().getDname());
        }
    }

    @After
    public void destroy() {
        sqlSession.close();
    }
}

package com.newcapec;

import com.newcapec.entity.Dept;
import com.newcapec.entity.Emp;
import com.newcapec.mapper.DeptMapper;
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
public class DeptTest {
    private SqlSession sqlSession;
    private DeptMapper deptMapper;

    @Before
    public void init() {
        sqlSession = MyBatisUtil.getSqlSession();
        deptMapper = sqlSession.getMapper(DeptMapper.class);
    }

    @Test
    public void testSelect() {
        List<Dept> list = deptMapper.selectAll();
        for (Dept dept : list) {
            System.out.println(dept.getDeptno() + "--" + dept.getDname() + "--" + dept.getLoc());

            //查询关联信息
            List<Emp> empList = dept.getEmpList();
            for (Emp emp : empList) {
                System.out.println("员工姓名：" + emp.getEname());
            }
        }

    }

    @After
    public void destroy() {
        sqlSession.close();
    }
}

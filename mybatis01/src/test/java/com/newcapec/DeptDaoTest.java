package com.newcapec;

import com.newcapec.dao.DeptDao;
import com.newcapec.entity.Dept;
import com.newcapec.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName DeptDaoTest
 * @Description TODO
 * @Author Sunyuhang
 * @Date 2022年04月13日 16:35
 * @Version 1.0
 */
public class DeptDaoTest {
    SqlSession sqlSession = MyBatisUtil.getSqlSession();
    DeptDao deptDao = sqlSession.getMapper(DeptDao.class);

    @Test
    public void selectAll() {
        List<Dept> depts = deptDao.selectAll();
        depts.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void selectDeptByDeptNo() {
        Dept dept = deptDao.selectDeptByDeptNo(10);
        System.out.println(dept);
        sqlSession.close();
    }

    @Test
    public void selectDeptByDName() {
        List<Dept> depts = deptDao.selectDeptByDName("e");
        depts.forEach(System.out::println);
    }

    @Test
    public void insertDept() {
        Dept dept = new Dept(50,"cxy","666");
        deptDao.insertDept(dept);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateDept() {
        Dept dept = new Dept(50,"syh","888");
        deptDao.updateDept(dept);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteDept() {
        deptDao.deleteDept(50);
        sqlSession.commit();
        sqlSession.close();
    }

}

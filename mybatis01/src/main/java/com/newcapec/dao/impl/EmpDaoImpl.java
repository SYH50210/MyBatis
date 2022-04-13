package com.newcapec.dao.impl;

import com.newcapec.dao.EmpDao;
import com.newcapec.entity.Emp;
import com.newcapec.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @ClassName EmpDaoImpl
 * @Description TODO
 * @Author Sunyuhang
 * @Date 2022年04月13日 15:18
 * @Version 1.0
 */
public class EmpDaoImpl implements EmpDao {
    @Override
    public Emp selectEmpByEmpno(Integer empno) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        Emp emp = sqlSession.selectOne("selectEmpByEmpno", empno);
        sqlSession.close();
        return emp;
    }

    @Override
    public List<Emp> selectAllEmp() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<Emp> emps = sqlSession.selectList("selectAllEmp");
        sqlSession.close();
        return emps;
    }

    @Override
    public List<Emp> selectEmpByName(String ename) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<Emp> emps = sqlSession.selectList("selectAllEmp",ename);
        sqlSession.close();
        return emps;
    }

    @Override
    public int insertEmp(Emp emp) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int insert = sqlSession.insert("insertEmp", emp);
        sqlSession.commit();
        System.out.println(emp);
        sqlSession.close();
        return insert;
    }

    @Override
    public int updateEmp(Emp emp) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int update = sqlSession.update("updateEmp", emp);
        sqlSession.commit();
        sqlSession.close();
        return update;
    }

    @Override
    public int deleteEmp(Integer empno) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int delete = sqlSession.delete("deleteEmp", empno);
        sqlSession.commit();
        sqlSession.close();
        return delete;
    }
}

package com.newcapec;

import com.newcapec.entity.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.List;

/**
 * @ClassName EmpTest
 * @Description TODO
 * @Author Sunyuhang
 * @Date 2022年04月13日 10:52
 * @Version 1.0
 */
public class EmpTest {
    public static SqlSession getSqlSession() {
        InputStream is = null;
        SqlSession sqlSession = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            // 创建sqlsessionfactory
            SqlSessionFactory factory = builder.build(is);
            // 创建sqlsession对象
            sqlSession = factory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSession;
    }

    @Test
    public void selectEmp() throws IOException {
        SqlSession sqlSession = EmpTest.getSqlSession();
        Emp emp = sqlSession.selectOne("selectEmpByEmpno", 7369);
        System.out.println(emp);
        System.out.println("*********************************************************************************************************");
        List<Emp> emps = sqlSession.selectList("selectAllEmp");
        emps.forEach(System.out::println);
        sqlSession.close();
    }

    /**
     * 模糊查询
     * @author Sunyuhang
     * @date 2022/4/13 14:31
     */
    @Test
    public void selectEmpByName() throws IOException {
        SqlSession sqlSession = EmpTest.getSqlSession();
        List<Emp> emps = sqlSession.selectList("selectEmpByName", "S");
        emps.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void insertEmp() throws IOException {
        SqlSession sqlSession = EmpTest.getSqlSession();

        Emp emp = new Emp("syh", "cxy", 8888, new Date(System.currentTimeMillis()), 10000.0, 1000.0, 20);

        int insert = sqlSession.insert("insertEmp", emp);
        sqlSession.commit();
        System.out.println(insert);
        System.out.println(emp);
        sqlSession.close();
    }

    @Test
    public void updateEmp() throws IOException {
        SqlSession sqlSession = EmpTest.getSqlSession();
        int update = sqlSession.update("updateEmp", new Emp(7566, "syh666", "cxy", 8888, new Date(System.currentTimeMillis()), 10000.0, 1000.0, 20));
        sqlSession.commit();
        System.out.println(update);
        sqlSession.close();
    }

    @Test
    public void deleteEmp() throws IOException {
        SqlSession sqlSession = EmpTest.getSqlSession();
        int delete = sqlSession.delete("deleteEmp", 7839);
        sqlSession.commit();
        System.out.println(delete);
        sqlSession.close();
    }
}

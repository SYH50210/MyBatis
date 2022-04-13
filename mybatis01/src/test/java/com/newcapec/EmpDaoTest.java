package com.newcapec;

import com.newcapec.dao.EmpDao;
import com.newcapec.dao.impl.EmpDaoImpl;
import com.newcapec.entity.Emp;
import com.newcapec.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Date;
import java.util.List;

/**
 * @ClassName EmpDaoTest
 * @Description TODO
 * @Author Sunyuhang
 * @Date 2022年04月13日 15:23
 * @Version 1.0
 */
public class EmpDaoTest {

    @Test
    public void test(){
        EmpDao empDao = new EmpDaoImpl();
        List<Emp> emps = empDao.selectAllEmp();
        emps.forEach(System.out::println);
        /*Emp emp = empDao.selectEmpByEmpno(7521);
        System.out.println(emp);*/
        /*List<Emp> emps = empDao.selectEmpByName("s");
        emps.forEach(System.out::println);*/
       /* Emp emp = new Emp("syh", "cxy", 8888, new Date(System.currentTimeMillis()), 10000.0, 1000.0, 20);

        int i = empDao.insertEmp(emp);
        System.out.println(i);*/

       /* Emp emp = new Emp(7566, "syh888", "cxy", 8888, new Date(System.currentTimeMillis()), 10000.0, 1000.0, 20);
        empDao.updateEmp(emp);*/

        //empDao.deleteEmp(7939);

    }

}

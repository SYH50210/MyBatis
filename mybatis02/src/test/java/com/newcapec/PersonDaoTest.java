package com.newcapec;

import com.newcapec.dao.PersonDao;
import com.newcapec.entity.Person;
import com.newcapec.entity.Stu;
import com.newcapec.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Mapper测试类
 */
public class PersonDaoTest {
    SqlSession sqlSession = null;
    PersonDao personDao = null;

    @Before
    public void beforeTest() {
        sqlSession = MyBatisUtil.getSqlSession();
        personDao = sqlSession.getMapper(PersonDao.class);
    }

    @Test
    public void getCount() {
        Integer count = personDao.getCount();
        System.out.println(count);
    }

    @Test
    public void getPersonById() {
        Person person = personDao.getPersonById(2);
        System.out.println(person);
    }

    @Test
    public void selectAll() {
        List<Person> personList = personDao.selectAll();
        personList.forEach(System.out::println);
    }

    @Test
    public void select() {
        List<Stu> list = personDao.select();
        list.forEach(System.out::println);
    }

    @After
    public void afterTest() {
        sqlSession.close();
    }

}

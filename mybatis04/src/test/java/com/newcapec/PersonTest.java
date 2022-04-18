package com.newcapec;

import com.newcapec.entity.Person;
import com.newcapec.mapper.PersonMapper;
import com.newcapec.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @ClassName EmpTest
 * @Description TODO
 * @Author Sunyuhang
 * @Date 2022年04月18日 17:09
 * @Version 1.0
 */
public class PersonTest {
    private SqlSession sqlSession;
    private PersonMapper personMapper;

    @Before
    public void init() {
        sqlSession = MyBatisUtil.getSqlSession();
        personMapper = sqlSession.getMapper(PersonMapper.class);
    }

    @Test
    public void testSelect() {
        Person person = personMapper.selectPersonById(1);
        sqlSession.close();
        SqlSession sqlSession2 = MyBatisUtil.getSqlSession();
        PersonMapper personMapper2 = sqlSession2.getMapper(PersonMapper.class);
        Person person2 = personMapper2.selectPersonById(1);

        System.out.println(person);
        System.out.println(person2);
    }


}

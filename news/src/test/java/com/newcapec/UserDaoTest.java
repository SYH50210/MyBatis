package com.newcapec;

import com.newcapec.dao.UserDao;
import com.newcapec.entity.User;
import com.newcapec.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Date;
import java.util.List;

/**
 * Mapper测试类
 */
public class UserDaoTest {
    SqlSession sqlSession = MyBatisUtil.getSqlSession();
    UserDao userDao = sqlSession.getMapper(UserDao.class);

    @Test
    public void selectAll() {
        List<User> users = userDao.selectAll();
        users.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void selectUserById() {
        User user = userDao.selectUserById(27);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void selectUserByName() {
        List<User> users = userDao.selectUserByName("10");
        users.forEach(System.out::println);
    }

    @Test
    public void insertDept() {
        User user = new User("syh","syh","888",new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()));
        userDao.insertUser(user);
        System.out.println(user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateDept() {
        User user = new User(47,"syh666","syh777","888888",new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()));
        userDao.updateUser(user);
        System.out.println(user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteDept() {
        userDao.deleteUser(40);
        sqlSession.commit();
        sqlSession.close();
    }
}

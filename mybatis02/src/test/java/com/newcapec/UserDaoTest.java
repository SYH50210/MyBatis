package com.newcapec;

import com.newcapec.dao.UserDao;
import com.newcapec.entity.User;
import com.newcapec.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Date;
import java.util.ArrayList;
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
    public void selectUser() {
        User user = new User();
        user.setName(null);
        //user.setId(20);
        List<User> users = userDao.selectUser(user);
        users.forEach(System.out::println);
    }

    @Test
    public void selectUserTrim() {
        User user = new User();
        user.setName(null);
        user.setId(20);
        List<User> users = userDao.selectUserTrim(user);
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
    public void insertUser(){
        User user = new User();
        user.setName("1100");
        user.setPwd("66666");
        user.setUptime(new Date(System.currentTimeMillis()));
        userDao.insertUserTrim(user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateDept() {
        User user = new User();
        user.setId(48);
        user.setAcct("超级超级管理员");
        userDao.updateUser(user);
        System.out.println(user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteDept() {
        userDao.deleteUser(61);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUserForeach(){
        userDao.deleteUserForeach(new Integer[]{35,36,37,38,39});
        sqlSession.commit();
    }

    @Test
    public void insertUserForeach(){
        userDao.insertUserForeach(new ArrayList<>());
    }
}

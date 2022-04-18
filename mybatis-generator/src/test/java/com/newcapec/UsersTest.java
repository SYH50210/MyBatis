package com.newcapec;

import com.newcapec.dao.UsersDao;
import com.newcapec.entity.Users;
import com.newcapec.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @ClassName UsersTest
 * @Description TODO
 * @Author Sunyuhang
 * @Date 2022年04月18日 21:04
 * @Version 1.0
 */
public class UsersTest {
    private UsersDao usersDao;
    private SqlSession sqlSession;

    @Before
    public void init() {
        sqlSession = MyBatisUtil.getSqlSession();
        usersDao = sqlSession.getMapper(UsersDao.class);
    }

    @Test
    public void test(){
        Users users = usersDao.queryById(1);
        System.out.println(users);
    }
}

package com.newcapec;

import com.newcapec.dao.UsersDao;
import com.newcapec.entity.Page;
import com.newcapec.entity.Users;
import com.newcapec.entity.UsersQuery;
import com.newcapec.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Mapper测试类
 */
public class UsersDaoTest {
    SqlSession sqlSession = null;
    UsersDao usersDao = null;

    @Before
    public void test() {
        sqlSession = MyBatisUtil.getSqlSession();
        usersDao = sqlSession.getMapper(UsersDao.class);
    }

    @Test
    public void selectByRealname() {
        List<Users> users = usersDao.selectByRealname("汤");
        users.forEach(System.out::println);
    }

    @Test
    public void selectByPage() {
        Page page = new Page();
        page.setPageNum(2);
        page.setPageSize(2);
        System.out.println(page);
        List<Users> users = usersDao.selectByPage(page);
        users.forEach(System.out::println);
    }

    @Test
    public void selectByRealnameAndPage() {
        UsersQuery usersQuery = new UsersQuery();
        Page page = new Page();
        page.setPageNum(1);
        page.setPageSize(2);
        Users users = new Users();
        users.setRealname("汤");
        usersQuery.setUsers(users);
        usersQuery.setPage(page);
        List<Users> users1 = usersDao.selectByRealnameAndPage(usersQuery);
        users1.forEach(System.out::println);
    }

    @Test
    public void testAll() {
        List<Users> users = usersDao.selectAll();
        users.forEach(System.out::println);
    }

    @Test
    public void testMap(){
        Map<String, Object> map = new HashMap<>();
        map.put("name","汤");
        map.put("begin",1);
        map.put("size",1);

        List<Users> users = usersDao.selectUsersByHashMap(map);
        users.forEach(System.out::println);
    }

    // 多输入参数测试
    @Test
    public void testMultiParam(){
        Users users = usersDao.login("syh", "666");
        System.out.println(users);
    }

}

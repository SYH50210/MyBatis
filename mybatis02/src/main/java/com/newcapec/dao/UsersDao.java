package com.newcapec.dao;

import com.newcapec.entity.Page;
import com.newcapec.entity.Users;
import com.newcapec.entity.UsersQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UsersDao {

    /**
     * @param realname
     * @return java.util.List<com.newcapec.entity.Users>
     * @author Sunyuhang
     * @date 2022/4/14 16:16
     */
    List<Users> selectByRealname(String realname);

    List<Users> selectByPage(Page page);

    List<Users> selectByRealnameAndPage(UsersQuery usersQuery);

    List<Users> selectAll();

    List<Users> selectUsersByHashMap(Map<String, Object> map);

   Users login(@Param("userName") String userName , @Param("userPwd") String userPwd);
}

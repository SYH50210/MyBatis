package com.newcapec.dao;

import com.newcapec.entity.User;

import java.util.List;

/**
 * 用户接口
 */
public interface UserDao {

    /**
     * 查询所有用户
     * @author Sunyuhang
     * @date 2022/4/13 17:35
     * @return java.util.List<com.newcapec.entity.User>
     */
    List<User> selectAll();

    /**
     * 根据id查询单个用户
     * @author Sunyuhang
     * @date 2022/4/13 17:36
     * @param id 要查询用户的id
     * @return com.newcapec.entity.User
     */
    User selectUserById(Integer id);

    /**
     * 模糊搜索用户
     * @author Sunyuhang
     * @date 2022/4/13 17:36
     * @param name 模糊搜索名
     * @return java.util.List<com.newcapec.entity.User>
     */
    List<User> selectUserByName(String name);

    /**
     * 新增用户
     * @author Sunyuhang
     * @date 2022/4/13 17:36
     * @param user 新增用户对象
     */
    void insertUser(User user);

    /**
     * 更新用户
     * @author Sunyuhang
     * @date 2022/4/13 17:36
     * @param user 更新用户对象
     */
    void updateUser(User user);

    /**
     * 删除用户
     * @author Sunyuhang
     * @date 2022/4/13 17:36
     * @param id 删除用户的id
     */
    void deleteUser(Integer id);

}

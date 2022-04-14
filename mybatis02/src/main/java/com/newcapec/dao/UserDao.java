package com.newcapec.dao;

import com.newcapec.entity.User;

import java.util.List;

/**
 * 用户接口
 */
public interface UserDao {

    /**
     * 查询所有用户
     *
     * @return java.util.List<com.newcapec.entity.User>
     * @author Sunyuhang
     * @date 2022/4/13 17:35
     */
    List<User> selectAll();

    /**
     * 根据id查询单个用户
     *
     * @param id 要查询用户的id
     * @return com.newcapec.entity.User
     * @author Sunyuhang
     * @date 2022/4/13 17:36
     */
    User selectUserById(Integer id);

    /**
     * 模糊搜索用户
     *
     * @param name 模糊搜索名
     * @return java.util.List<com.newcapec.entity.User>
     * @author Sunyuhang
     * @date 2022/4/13 17:36
     */
    List<User> selectUserByName(String name);

    /**
     * 新增用户
     *
     * @param user 新增用户对象
     * @author Sunyuhang
     * @date 2022/4/13 17:36
     */
    void insertUser(User user);

    void insertUserForeach(List<User> list);

    /**
     * 更新用户
     *
     * @param user 更新用户对象
     * @author Sunyuhang
     * @date 2022/4/13 17:36
     */
    void updateUser(User user);

    /**
     * 删除用户
     *
     * @param id 删除用户的id
     * @author Sunyuhang
     * @date 2022/4/13 17:36
     */
    void deleteUser(Integer id);

    List<User> selectUser(User user);

    List<User> selectUserTrim(User user);

    void insertUserTrim(User user);

    void deleteUserForeach(Integer[] integers);

}

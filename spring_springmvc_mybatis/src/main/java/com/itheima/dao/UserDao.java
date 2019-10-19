package com.itheima.dao;

import com.itheima.pojo.User;

import java.util.List;

/**
 * 用户dao接口
 */
public interface UserDao {

    /**
     * 查询全部用户列表
     */
    List<User> findAllUser();

    /**
     * 添加用户信息
     */
    void insertUser(User user);

    /**
     * 根据用户id查询用户
     */
    User findUserById(Integer id);

    /**
     * 修改用户
     */
    void updateUser(User user);
}

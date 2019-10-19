package com.itheima.service;

import com.itheima.pojo.User;

import java.util.List;

/**
 * 用户service接口
 */
public interface UserService {

    /**
     * 查询全部列表用户
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

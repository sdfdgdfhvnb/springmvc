package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户service实现类
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    // 定义用户dao
    @Autowired
    private UserDao userDao;

    /**
     * 查询全部列表用户
     */
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    /**
     * 添加用户信息
     *
     * @param user
     */
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    /**
     * 根据用户id查询用户
     *
     * @param id
     */
    public User findUserById(Integer id) {
        return userDao.findUserById(id);
    }

    /**
     * 修改用户
     *
     * @param user
     */
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}

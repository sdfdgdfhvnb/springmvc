package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 用户controller
 */
@Controller
public class UserController {

    // 定义用户service
    @Autowired
    private UserService userService;

    /**
     * 查询全部用户列表数据
     */
    @RequestMapping("list")
    public String list(Model model) {

        // 1.准备用户列表数据
        List<User> userList = userService.findAllUser();


        // 2.响应用户列表数据
        model.addAttribute("userList", userList);

        return "user/list";
    }

    /**
     * 跳转到添加用户界面:
     * http:localhost/add.do
     */
    @RequestMapping("add")
    public String add() {
        return "user/add";
    }

    /**
     * 保存用户:
     * http:localhost/insert.do
     */
    @RequestMapping("insert")
    public String insert(User user) {

        // 保存用户
        userService.insertUser(user);

        return "redirect:/list.do";
    }

    /**
     * 根据用户id查询用户:
     * http:localhost/get.do?id=1
     */
    @RequestMapping("get")
    public String get(Model model, Integer id) {

        // 根据用户id查询用户
        User user = userService.findUserById(id);

        // 响应数据
        model.addAttribute("user", user);

        return "user/edit";
    }

    /**
     * 修改保存用户
     * http:localhost/edit.do
     */
    @RequestMapping("edit")
    public String edit(User user) {

        // 修改保存用户
        userService.updateUser(user);

        return "redirect:/list.do";
    }
}

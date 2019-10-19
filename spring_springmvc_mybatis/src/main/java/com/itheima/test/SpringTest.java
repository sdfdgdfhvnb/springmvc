package com.itheima.test;

import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试spring框架在web项目中的独立运行
 */
public class SpringTest {

    public static void main(String[] args) {

        // 1.加载spring配置文件,创建springIOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");

        // 2.获取用户service
        UserService userService = (UserService) context.getBean("userService");

        // 3.查询全部用户列表
        userService.findAllUser();
    }
}

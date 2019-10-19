package com.itheima.test;

import com.itheima.dao.UserDao;
import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * 测试mybatis框架在web项目中独立运行
 */
public class MybatisTest {

    public static void main(String[] args) throws Exception {

        // 1.加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis/sqlMapConfig.xml");

        // 2.读取解析配置文件内容,获取框架的核心对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);

        // 3.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 4.获取接口代理对象
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        // 5.执行操作
        List<User> list = mapper.findAllUser();
        for (User user : list) {
            System.out.println(user);
        }

        // 释放资源
        sqlSession.close();
    }
}

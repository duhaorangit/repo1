package cn.itcast.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

/**
 *
 *
 * springboot项目中没有web.xml 因为springboot
 * 中默认的是servlet3.0 纯注解 不需要配文件
 *
 *
 *  在Java代码中可以完成数据库连接池的配置
 *   <bean id="dataSourse" class="com.alibaba.druid.pool.DruidDataSourse"
 *     init-method="init" destroy-method="close">
 *   <property name="url" value="${idbc.url}"></property>
 *   <property name="username" value="${jdbc.username}"></property>
 *   <property name="password" value="${jdbc.password}"/>
 *
 *   </bean>
 *
 */
@Controller
public class HelloController {



    @Autowired   //给controller注入连接池
    private DataSource dataSource;



    @GetMapping("hello")
    @ResponseBody
    public String hello(){

        return "hello SpringBootMVC！";   //并没有真的连接数据库的 在此打断点 debug运行 浏览器访问 看控制台dataSource中的值


    }
}

package cn.itcast.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * 2
 *
 * 使用springboot的方式集成mybatis   ---注入配置文件的值
 *
 * 注释掉的是Java的方式
 *
 *
 */
@Configuration //这个类代表一个xml配置文件
//@PropertySource("classpath:application.properties")  //指定外部属性文件 不写 必须修改配置文件名为application.properties
// 转到下JdbcProperties类中单独注入


@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {

//    @Value("${jdbc.url}")        ctrl+/
//    String url;
//
//    @Value("${jdbc.driverClassName}")
//    String driverClassName;
//
//    @Value("${jdbc.userName}")
//    String userName;
//
//    @Value("${jdbc.password}")
//    String password;


//    @Autowired            这种方式也可以使用
//    JdbcProperties jdbcProperties;
//
//    public JdbcConfig(JdbcProperties jdbcProperties){
//
//        this.jdbcProperties = jdbcProperties;
//    };





    @Bean
    public DataSource dataSourse(JdbcProperties prop){  //注意加了参数 谁调用(spring)此方法谁传值

        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setDriverClassName(prop.getDriverClassName());
        dataSource.setUrl(prop.getUrl());
        dataSource.setUsername(prop.getUsername());
        dataSource.setPassword(prop.getPassword());

        return dataSource;

    }



}

package cn.itcast.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="jdbc")
                            //prefix="jdbc" 声明配置文件中的前缀
                            //表示该类单独编写配置文件属性
                            //加get set方法一 : alt + insert

@Data   //在编译时帮我们自动生成get set hashcode equals toString等所有方法
public class JdbcProperties {

    String driverClassName;
    String url;
    String username;
    String password;

}

package hunan.yishi.univercity.test;

import hunan.yishi.univercity.starter.annotation.EnableRegisterServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//自定义注解，开启自动配置
@EnableRegisterServer
public class StarterApplication {
    public static void main(String[] args) {
        SpringApplication.run(StarterApplication.class,args);
    }
}

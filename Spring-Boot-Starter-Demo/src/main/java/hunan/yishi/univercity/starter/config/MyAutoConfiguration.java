package hunan.yishi.univercity.starter.config;


import hunan.yishi.univercity.starter.entity.SimpleBean;
import hunan.yishi.univercity.starter.otherjar.ConfigMarker;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAutoConfiguration {

    //类创建对象会先加载类，然后输出静态代码块语句
    static {
        System.out.println("MyAutoConfiguration init success!");
    }


    @Bean
    @ConditionalOnBean(ConfigMarker.class)
    public SimpleBean simpleBean(){
        return new SimpleBean();
    }


}

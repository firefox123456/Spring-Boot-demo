package hunan.yishi.univercity.starter.otherjar;


import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;

/**
 * spi这个类可以实现门面模式，像Tomcat那样子实现选择服务器，应该由其他类导入
 * 下面可以使用@Bean实现多种实例
 * 然后+@ConditionalOnClass,判断是否导入辽对应的jar包，实现动态的选择看上去非常智能
 */
public class ConfigMarker {
}

package hunan.yishi.univercity.starter.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//开启允许@ConfigurationProperties的使用
@EnableConfigurationProperties(SimpleBean.class)
//导入META-INF/spring.factories下配置的属性，并指定前缀为simplebean
@ConfigurationProperties(prefix = "simplebean")
public class SimpleBean {

    private int id;

    private String name;

    private String aihao;

    @Override
    public String toString() {
        return "SimpleBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", aihao='" + aihao + '\'' +
                '}';
    }

    public String getAihao() {
        return aihao;
    }

    public void setAihao(String aihao) {
        this.aihao = aihao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

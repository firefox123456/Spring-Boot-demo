package hunan.yishi.univercity.starter.annotation;

import hunan.yishi.univercity.starter.otherjar.ConfigMarker;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//这个注释可以作用在类上
@Target(ElementType.TYPE)
//在运行是作用
@Retention(RetentionPolicy.RUNTIME)
//创建ConfigMarker类的bean实例
@Import(ConfigMarker.class)
public @interface EnableRegisterServer {

}

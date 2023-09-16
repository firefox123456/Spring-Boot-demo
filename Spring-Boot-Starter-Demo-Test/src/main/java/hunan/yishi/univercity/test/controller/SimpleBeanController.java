package hunan.yishi.univercity.test.controller;

import hunan.yishi.univercity.starter.entity.SimpleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试自动配置simple bean，是否成功
 *
 * @author "黄骐"
 * @date 2023/07/07 15:35
 **/
@RestController
@RequestMapping("starter")
public class SimpleBeanController {
    //注入自定义的simple bean
    @Autowired
    SimpleBean simpleBean;

    @GetMapping("test")
    public String test(){
        return simpleBean.toString();
    }


}

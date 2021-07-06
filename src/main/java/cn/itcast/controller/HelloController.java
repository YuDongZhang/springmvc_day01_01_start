package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//控制器类
@Controller//springioc容器
public class HelloController {

    @RequestMapping(path = "/hello")//请求映射,在index.jsp中发请求方法就执行了,"/hello"就是这个方法的请求路径
    public String sayHello() {
        System.out.println("hello springmvc");
        return "success";//这里是找名为 success的jsp , 怎么去找 , 要在 springmvc.xml中配置视图解析器
    }
}

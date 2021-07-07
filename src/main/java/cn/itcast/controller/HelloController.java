package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//控制器类
@Controller//springioc容器
@RequestMapping(path = "/user")
public class HelloController {

    @RequestMapping(path = "/hello")//请求映射,在index.jsp中发请求方法就执行了,"/hello"就是这个方法的请求路径
    public String sayHello() {
        System.out.println("hello springmvc");
        return "success";//这里是找名为 success的jsp , 怎么去找 , 要在 springmvc.xml中配置视图解析器
    }

    /**
     * requestMapping
     *
     * @return
     */
//    @RequestMapping(value = "/testRequestMapping")//value 和path一样 , 如果是value上可以省略的
//    @RequestMapping("/testRequestMapping")
//    @RequestMapping(value = "/testRequestMapping", method = {RequestMethod.POST})
//    @RequestMapping(value = "/testRequestMapping",params = {"username"})//说明请求这个方法必须传username
//    @RequestMapping(value = "/testRequestMapping",params = {"username=hi"})//传的时候username也得等于hi才行
    @RequestMapping(value = "/testRequestMapping",params = {"username=hi"},headers = {"accept"})//传的时候username也得等于hi才行
    public String testRequestMapping() {
        System.out.println("测试requestMapping注解---");
        return "success";
    }
}

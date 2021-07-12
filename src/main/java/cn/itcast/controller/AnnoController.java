package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 常用注解
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username) {
        System.out.println("执行了...");
        System.out.println(username);
        return "success";
    }

    /**
     * 获取到请求体的内容
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println("执行了...");
        System.out.println(body);
        return "success";
    }

    /**
     * PathVariable注解
     * @return
     */
    @RequestMapping(value="/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name="sid") String id){
        System.out.println("执行了...");
        System.out.println(id);
        return "success";
    }


}

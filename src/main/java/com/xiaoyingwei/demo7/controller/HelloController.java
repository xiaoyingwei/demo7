package com.xiaoyingwei.demo7.controller;

import com.xiaoyingwei.demo7.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaoyingwei
 * @since 11/4/2022 下午4:44
 */
public class HelloController {
    //请求映射
    @RequestMapping("/hello")
    public String hello(User user){
        return "hello"+user.getName()+user.getAge();
    }
}

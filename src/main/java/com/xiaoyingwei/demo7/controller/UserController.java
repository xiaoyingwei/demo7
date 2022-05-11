package com.xiaoyingwei.demo7.controller;

import com.xiaoyingwei.demo7.bean.User;

import com.xiaoyingwei.demo7.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author xiaoyingwei
 * @since 18/4/2022 下午4:37
 */
@RestController
public class UserController {
    private UserMapper userMapper;
    private RedisTemplate  redisTemplate;
    /**
     *
     */
    @GetMapping("/v1/users/{id}")
    public User getOneUser(@PathVariable Integer id) {
        return new User(1, "李炳源", 18);
    }
    @GetMapping("/v1/users")
    public List<User> getManyUser(){
        List<User> list = new ArrayList<>();
       /* list.add(new User(1, "李炳源", 18));
        list.add(new User(2, "李大饼", 18));*/
        list=userMapper.getUser();
        return list;
    }
    @PostMapping("/v1/users")
    public String addUser(@RequestBody User user){
        System.out.println(user.getName());
        System.out.println(user.getAge());
        //调用userMapper接口
        userMapper.addUser(user);
        return "ok";
    }
    @DeleteMapping("/v1/users/{id}")
    public String deleteUser(Integer id){
        System.out.println(id);
        return "ok";
    }
    @PutMapping("/v1/users/{id}")
    public String updateUser(@RequestBody User user){
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getAge());
        return "ok";
    }
    @PostMapping("/v1/users/{id}")
    public String testReadis(){
        //redisTemplate.opsForValue().set("hello","world",10, TimeUnit.MINUTES);
        Map<String,String> map =new HashMap<>();
        map.put("name","张三");
        map.put("age","18");
        map.put("sex","1");
        redisTemplate.opsForHash().putAll("user2",map);

        return "ok";
    }
}

package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserService userService;
//
//    @Value("${itcast.url}")
//    private String itcastUrl;
//
//    @Value("${itheima.url}")
//    private String itheimaUrl;

    @GetMapping("/user/{id}")
    public User queryById(@PathVariable Long id){
        return userService.queryById(id);
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring Boot";
    }


}

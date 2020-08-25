package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloContoller {
  @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
    @PostMapping("/check")
    public String check(@RequestParam Map<String,Object> param)
    {
        String username=(String)param.get("username");
        String password =(String)param.get("password");
        if (username.equals("kk")&&password.equals("123")){
            return "success";
        }else {
            return "failed";
        }

    }
}

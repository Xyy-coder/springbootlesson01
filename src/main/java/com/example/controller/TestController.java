package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class TestController {
    @GetMapping("/test")
    public ModelAndView test(){
        ModelAndView mv= new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
}

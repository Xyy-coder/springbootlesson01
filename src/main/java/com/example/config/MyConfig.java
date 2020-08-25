package com.example.config;

import org.apache.jasper.tagplugins.jstl.core.Url;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("/hello");
        registry.addViewController("/index").setViewName("redirect:/demo");
    }
}

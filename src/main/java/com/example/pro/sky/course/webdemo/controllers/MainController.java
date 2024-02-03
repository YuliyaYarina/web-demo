package com.example.pro.sky.course.webdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping
    public String testApi() {
        return "WebApp is working!";
    }

}

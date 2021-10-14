package com.phisoft.oauth2github.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home.html";
    }

    @GetMapping("/hello")
    public String hello(){
        return "home.html";
    }

    @GetMapping("/alo")
    public String alo(){
        return "home.html";
    }
}

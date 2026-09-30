package com.urvi.SimpleWebApp.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController 
public class HomeController {
    @RequestMapping("/")
    public String greet(){
        return "Welcome to Spring Boot Application";
    }


    @RequestMapping ("/about")
    public String about(){
        return "This is a simple web application built using Spring Boot.";
    }
}

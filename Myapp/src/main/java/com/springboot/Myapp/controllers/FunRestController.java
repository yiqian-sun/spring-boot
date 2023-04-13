package com.springboot.Myapp.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //inject properties from applications
    @Value("${author}")
    private String authorName;
    @Value("${book}")
    private String bookName;
    // expose new endpoint for shelf
    @GetMapping("/shelf")
    public String getABook(){
        return "Author: " + authorName + " , Book: " + bookName;
    }

    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }


    //expose a new endpoint for workout
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run 5 k";
    }
}

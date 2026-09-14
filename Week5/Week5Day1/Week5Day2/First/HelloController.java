package com.First;

import com.First.App.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/name")
    public String Sayhello(){
        return "Radha Krishan Yadav";

    }
    @GetMapping("/user")// this are create in jason code by springboot using jakson
    public User getUser(){
        return new User(152,"Radha Krishan Yadav","radhakrishan81217@gmail.com");

    }
}

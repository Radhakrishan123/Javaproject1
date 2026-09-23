package com.SpringBoot1.Controller;

import com.SpringBoot1.model.User;

import com.SpringBoot1.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        try{
            HashMap<String,String> lst=userService.createUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(lst);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.MULTI_STATUS).body(e.getLocalizedMessage());
        }

    }
}
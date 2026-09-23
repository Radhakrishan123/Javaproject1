package com.First.App;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    private Map<Integer,User> userDb = new HashMap<>();
    @PostMapping//we are created at web server
    public  String createUser(@RequestBody User user){// requestbody
        // use to infrom to create a object of user like and auto work
        System.out.println(user.getEmailid());//read email
        userDb.putIfAbsent(user.getId(),user);// if key not present then it will add not override
        return "User Created";
    }
    @PutMapping//update name thorugh user body if key present
    public String updateUser(@RequestBody User user){
        if (userDb.containsKey(user.getId()))
            userDb.put(user.getId(),user);
        return "update successful";
    }
    @DeleteMapping("{id}")
    public String dleteUser(@PathVariable int id){//to make dynnamic url use this notation
        userDb.remove(id);
        return "User deleted";
        @GetMapping
                public List<User> getUsers(){
            return new ArrayList<>(userDb.values());

        }
    }


}

package com.SpringBoot1.Service;


import com.SpringBoot1.model.User;

import java.util.HashMap;
import java.util.List;

public interface UserService {
    HashMap<String,String> createUser(User user);
}
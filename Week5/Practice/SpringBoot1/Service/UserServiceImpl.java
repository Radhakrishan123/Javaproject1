package com.SpringBoot1.Service;


import com.SpringBoot1.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public HashMap<String,String> createUser(User user) {
        HashMap<String,String> lst=new HashMap<>();
        lst.put("id",user.getId().toString());
        lst.put("Email id",user.getEmailId());
        lst.put("Name",user.getName());
        return lst;

    }
}
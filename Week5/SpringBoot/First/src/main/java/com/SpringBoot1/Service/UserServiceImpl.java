package com.SpringBoot1.Service;

import com.SpringBoot1.Dao.UserDao;
import com.SpringBoot1.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Override
    public HashMap<String,String> createUser(User user) {

        userDao.save(user);

        HashMap<String,String> map = new HashMap<>();
        map.put("message","User Saved Successfully");
        return map;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }
}
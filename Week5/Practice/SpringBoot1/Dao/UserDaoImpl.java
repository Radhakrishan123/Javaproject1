package com.SpringBoot1.Dao;

import com.SpringBoot1.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void save(User user) {

        System.out.println("User Saved");
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getEmailId());

    }
}
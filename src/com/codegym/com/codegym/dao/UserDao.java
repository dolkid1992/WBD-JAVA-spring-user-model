package com.codegym.com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(10);
        u1.setName("Khoa");
        u1.setAccount("Khoa");
        u1.setEmail("Khoa@codegym.vn");
        u1.setPassword("123");
        users.add(u1);

        User u2 = new User();
        u2.setAge(20);
        u2.setName("Hieu");
        u2.setAccount("Hieu");
        u2.setEmail("Hieu@codegym.vn");
        u2.setPassword("123");
        users.add(u2);

        User u3 = new User();
        u3.setAge(20);
        u3.setName("Hieu");
        u3.setAccount("Hieu");
        u3.setEmail("Hieu@codegym.vn");
        u3.setPassword("123");
        users.add(u3);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())) {
                return u;
            }
        }
        return null;
    }
}

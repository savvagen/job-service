package com.example.db;

import com.example.entity.User;

import java.util.List;

public interface UserDao {


    void save(User user);

    List<User> findAll();

    User findOne(int id);

    void delete(int id);

    void update(User user);

}
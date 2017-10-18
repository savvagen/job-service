package com.example.service;

import com.example.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void save(User user);

    User findOne(int id);

    void delete(int id);

    void update(User user);




}

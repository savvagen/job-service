package com.example.service;

import com.example.db.UserRepo;
import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {


    @Autowired
    public UserRepo userRepo;


    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public User findOne(int id) {
       return userRepo.findOne(id);
    }

    @Override
    public void delete(int id) {
        userRepo.delete(id);
    }

    @Override
    public void update(User user) {
        userRepo.update(user);
    }



}

package com.example.service;

import com.example.entity.Status;

import java.util.List;

public interface StatusService {

    List<Status> findAll();

    Status findOne(int id);


}

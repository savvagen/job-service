package com.example.db;

import com.example.entity.Status;

import java.util.List;

public interface StatusRepo {

    List<Status> findAll();

    Status findOne(int id);

}

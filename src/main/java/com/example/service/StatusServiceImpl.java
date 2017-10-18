package com.example.service;

import com.example.db.StatusRepo;
import com.example.entity.Status;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StatusServiceImpl implements StatusService{

    @Autowired
    public StatusRepo statusRepo;

    @Override
    public List<Status> findAll() {
        return statusRepo.findAll();
    }

    @Override
    public Status findOne(int id) {
       return statusRepo.findOne(id);
    }
}

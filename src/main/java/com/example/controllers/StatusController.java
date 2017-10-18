package com.example.controllers;


import com.example.entity.Status;
import com.example.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class StatusController {

    @Autowired
    StatusService statusService;



    @GetMapping("/status")
    public @ResponseBody List<Status> getStatusOptions(){
        return statusService.findAll();
    }





}

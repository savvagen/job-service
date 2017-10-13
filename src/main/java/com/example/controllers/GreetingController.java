package com.example.controllers;


import com.example.entity.Greeting;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/")
public class GreetingController {





    @GetMapping("/greeting")
    public String greeting(){
        return "greeting";
    }



    @GetMapping("/greeting/hello")
    public @ResponseBody Greeting getGreeting(@RequestParam(value = "name") String name){
        Greeting greeting = new Greeting();
        greeting.setId(12);
        greeting.setMessage("Hello " + name);
        return greeting;
    }








}

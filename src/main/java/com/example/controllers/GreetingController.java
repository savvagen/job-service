package com.example.controllers;


import com.example.entity.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


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

package com.example.controllers;


import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class CustomerController {


    @Autowired
    public UserService userService;


    @GetMapping("/")
    public String getIndex(){
        return "index";
    }


    @GetMapping("/hello")
    public String getHello(){
        return "hello";
    }


    @GetMapping("/signUp")
    public String signUp(){
        return "signUp";
    }




    @GetMapping("/users")
    public String getAllUsers(Model model){
        model.addAttribute("users", userService.findAll());
        return "usersList";
    }


    @GetMapping("/user/{user_id}")
    public String openUser(@PathVariable(value = "user_id") Integer id, Model model){
        model.addAttribute("user", userService.findOne(id));
        return "showUser";
    }


    @PostMapping("/register")
    public String registerUser(@ModelAttribute(name = "user") User user){
        userService.save(user);
        return "redirect:/users";
    }

    @PostMapping("/update")
    public String updateUser(@ModelAttribute("user") User user){
        userService.update(user);
        return "redirect:/user/" + user.getUser_id();
    }

    @GetMapping("/update/{user_id}")
    public String update(@PathVariable(value = "user_id") Integer id, Model model){
        model.addAttribute("user", userService.findOne(id));
        return "editUser";
    }


    @GetMapping("/delete/{user_id}")
    public String deleteUser(@PathVariable(value = "user_id") Integer id){
        userService.delete(id);
        return "redirect:/users";
    }





}

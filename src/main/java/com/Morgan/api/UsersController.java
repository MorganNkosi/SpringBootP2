package com.Morgan.api;

import com.Morgan.service.UsersService;
import com.Morgan.users.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {

    @RequestMapping("/home")
    public String message(){
        return "Welcome to Spring Cache and Security";
    }

    @Autowired
    UsersService usersService;

    @GetMapping("/users/{id}")
    public Users findUserById(@PathVariable long id)
    {
        System.out.println("Searching by ID  : " + id);
        return usersService.getUser(id);
    }
}

package com.example.demo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(path="api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @CrossOrigin(origins = "")
    @PostMapping
    public void addUser(User user) {
        if (userService.findByUsername(user.getUsername()) == null) {
            userService.addUser(user);
        }
        else {
            throw new ResponseStatusException(HttpStatus.CREATED, "Student already exists");
        }
    }


    // public void addUser(@RequestBody User user) {
    //     this.userService.addUser(
    //         user.getId(),
    //         user.getUsername(),
    //         user.getPassword(),
    //         user.getFirstName(),
    //         user.getLastName(),
    //         user.getHealthCareNumber(),
    //         user.getThreatyNo(),
    //         user.getPhoneNumber(),
    //         user.getEmail())
    //         ;
    //   }
}

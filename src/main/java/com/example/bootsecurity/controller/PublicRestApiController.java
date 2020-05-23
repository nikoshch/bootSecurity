package com.example.bootsecurity.controller;

import com.example.bootsecurity.db.UserRepository;
import com.example.bootsecurity.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/public")
public class PublicRestApiController {

    private UserRepository userRepository;

    public PublicRestApiController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("test1")
    public String test1(){return "Api test 1";}

    @GetMapping("test2")
    public String test2(){return "Api test 2";}

    @GetMapping("users")
    public List<User> users(){
        return this.userRepository.findAll();
    }
}

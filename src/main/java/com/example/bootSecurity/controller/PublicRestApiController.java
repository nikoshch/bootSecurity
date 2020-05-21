package com.example.bootSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/public")
public class PublicRestApiController {

    public PublicRestApiController(){}

    @GetMapping("test1")
    public String test1(){return "Api test 1";}

    @GetMapping("test2")
    public String test2(){return "Api test 2";}
}

package it.diao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/sayHello")
    public String sayhello(){
        return "I`m provider 1 ,Hello consumer!";
    }
}

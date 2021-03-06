package com.spring.sfgdi.controllers;

import com.spring.sfgdi.services.PrimaryGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public MyController(PrimaryGreetingService primaryGreetingService) {
        this.primaryGreetingService = primaryGreetingService;
    }

    private final PrimaryGreetingService primaryGreetingService;


    public String sayHello() {
        System.out.println("hello world ");
        return primaryGreetingService.sayGreeting();
    }


}

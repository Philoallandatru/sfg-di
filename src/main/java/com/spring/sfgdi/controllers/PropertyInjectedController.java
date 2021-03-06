package com.spring.sfgdi.controllers;

import com.spring.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    // using property to get service
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }



}

package com.solanodennis.sfdi.controllers;

import com.solanodennis.sfdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingServiceImpl")
    @Autowired
    public GreetingsService greetingsService;

    public String getGreeting(){
        return this.greetingsService.sayGreeting();
    }

}

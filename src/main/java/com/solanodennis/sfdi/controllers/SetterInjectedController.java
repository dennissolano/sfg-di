package com.solanodennis.sfdi.controllers;

import com.solanodennis.sfdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingsService greetingsService;

    public String getGreeting() {
        return this.greetingsService.sayGreeting();
    }

    @Autowired
    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }
}

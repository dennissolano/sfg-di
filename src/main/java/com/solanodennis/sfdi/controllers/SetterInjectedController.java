package com.solanodennis.sfdi.controllers;

import com.solanodennis.sfdi.services.GreetingsService;

public class SetterInjectedController {
    private GreetingsService greetingsService;

    public String getGreeting() {
        return this.greetingsService.sayGreeting();
    }

    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }
}

package com.solanodennis.sfdi.controllers;

import com.solanodennis.sfdi.services.GreetingsService;

public class ConstructorInjectedController {
    private final GreetingsService greetingsService;

    public ConstructorInjectedController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreeting() {
        return this.greetingsService.sayGreeting();
    }

}

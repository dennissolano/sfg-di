package com.solanodennis.sfdi.controllers;

import com.solanodennis.sfdi.services.GreetingsService;

public class PropertyInjectedController {

    public GreetingsService greetingsService;

    public String getGreeting(){
        return this.greetingsService.sayGreeting();
    }

}

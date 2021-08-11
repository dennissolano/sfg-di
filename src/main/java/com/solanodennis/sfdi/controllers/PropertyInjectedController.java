package com.solanodennis.sfdi.controllers;

import com.solanodennis.sfdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingsService greetingsService;

    public String getGreeting(){
        return this.greetingsService.sayGreeting();
    }

}

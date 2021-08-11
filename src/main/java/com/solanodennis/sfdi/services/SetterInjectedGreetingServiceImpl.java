package com.solanodennis.sfdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingServiceImpl implements GreetingsService {
    @Override
    public String sayGreeting() {
        return "Hello world - Setter injected dependency";
    }
}

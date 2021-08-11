package com.solanodennis.sfdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingServiceImpl implements GreetingsService {
    @Override
    public String sayGreeting() {
        return "Hello world - Constructor injected dependency";
    }
}

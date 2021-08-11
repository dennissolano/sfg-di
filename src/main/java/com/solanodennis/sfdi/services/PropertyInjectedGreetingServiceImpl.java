package com.solanodennis.sfdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl implements GreetingsService {
    @Override
    public String sayGreeting() {
        return "Hello world - Property injected dependency";
    }
}

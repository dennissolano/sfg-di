package com.solanodennis.sfdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayGreeting() {
        return "Hello world - Primary service";
    }
}
package com.solanodennis.sfdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// Default profile specified.
@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishGreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayGreeting() {
        return "Hola mundo ----- Español";
    }
}

package com.solanodennis.sfdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayGreeting() {
        return "Hello world ----- English";
    }
}

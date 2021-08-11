package com.solanodennis.sfdi;

import com.solanodennis.sfdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfDiApplication {

    public static void main(String[] args) {

    	// Spring framework is in charge of creating beans that are annotated with typical annotations such as @Component,
		// @Controller, @Service, @Repository, among others. This is called inversion of control.
		// The spring framework instantiates those objects and stores them in the application context. Thus, every time
		// one of them is requested, spring framework will provide it via dependency injection.
		// Beans names are the same as classes, but they start with lower case.

        ApplicationContext aplApplicationContext = SpringApplication.run(SfDiApplication.class, args);

        System.out.println("----------- Profile Specific Bean");
        I18nController i18nController = (I18nController) aplApplicationContext.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        System.out.println("----------- Primary Bean");
        MyController myController = (MyController) aplApplicationContext.getBean("myController");
        System.out.println(myController.sayHello());

        System.out.println("----------- Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) aplApplicationContext.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("----------- Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) aplApplicationContext.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("----------- Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) aplApplicationContext.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }
}

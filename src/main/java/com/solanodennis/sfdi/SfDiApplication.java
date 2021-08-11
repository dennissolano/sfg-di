package com.solanodennis.sfdi;

import com.solanodennis.sfdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfDiApplication {

    public static void main(String[] args) {

    	// Spring framework is in charge of creating beans that are annotated with typical annotations such as @Component,
		// @Controller, @Service, @Repository, among others. This is called inversion of control.
		// The spring framework instantiates those objects and store them in th application context. Thus, every time
		// one of them is requested, spring framework will provide it via dependency injection.
		// Beans names are the same as classes, but they start with lower case.

        ApplicationContext aplApplicationContext = SpringApplication.run(SfDiApplication.class, args);
        MyController myController = (MyController) aplApplicationContext.getBean("myController");
        String greeting = myController.sayHello();
        System.out.println(greeting);
    }
}

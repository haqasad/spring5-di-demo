package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;

/**
 * Created by jt on 5/24/17.
 */

//================================================================================
//                  DEPENDENCY INJECTION BY CONSTRUCTOR
//================================================================================
// This is the most preferred way of DI
//
// Create an interface and declare the interface as a private property in
// dependency injection class
//
// Create a constructor using the private property
//================================================================================
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}

package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;

/**
 * Created by jt on 5/24/17.
 */

//================================================================================
//                  DEPENDENCY INJECTION BY SETTERS
//================================================================================
// This is the least preferred way of DI. This is an example of how not to do DI
//================================================================================
public class SetterInjectedController {

    //============================================================================
    // A private property of type GreetingService is declared
    //
    // GreetingService is an Interface and is used directly as a property
    //
    // To access this property a setter is used
    //
    // For property injected dependency a public property was declared and the
    // property was an implemented class of an interface but for setter injected
    // dependency a private property is declared and the property is the interface
    //============================================================================
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}

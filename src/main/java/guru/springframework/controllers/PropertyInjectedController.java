package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;


/**
 * Created by jt on 5/24/17.
 */

//================================================================================
//                  DEPENDENCY INJECTION BY CLASS PROPERTY
//================================================================================
// This is the least preferred way of DI. This is an example of how not to do DI
//================================================================================
public class PropertyInjectedController {

    //============================================================================
    // NOTICE: A public property of type GreetingServiceImpl is declared but no
    // object is created using 'new' keyword in this class
    //============================================================================
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}

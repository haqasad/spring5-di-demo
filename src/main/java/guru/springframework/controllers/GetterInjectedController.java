package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 5/24/17.
 */

//================================================================================
//               DEPENDENCY INJECTION BY SETTERS - SPRING MANAGED
//================================================================================
// @Controller component marks this class as a spring component and this tells
// spring to manage this class as a spring bean
//================================================================================
// Missing this annotation would let to a NoSuchBeanDefinitionException
// NoSuchBeanDefinitionException: No qualifying bean of type
// 'guru.springframework.controllers.GetterInjectedController' available
//================================================================================
@Controller
public class GetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    //============================================================================
    // @Autowired annotation asks spring to inject the annotated property
    // For this example the annotated property is setGreetingService
    //============================================================================
    // Missing this annotation would let to a NullPointerException
    // Exception in thread "main" java.lang.NullPointerException
    //============================================================================
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}

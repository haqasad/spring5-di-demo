package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 5/24/17.
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    //============================================================================
    // @Qualifier is used to choose among multiple services
    // @Qualifier takes a string parameter
    // The string parameter is the bean/service name with a lower case
    //============================================================================
    // In this example, there are more that one (three) services.
    // Missing '@Qualifier' would result in application failure
    //============================================================================
    // APPLICATION FAILED TO START
    //
    // Description:
    // Parameter 0 of constructor in guru.springframework.ConstructorInjectedController
    // required a single bean but 3 were found:
    // constructorGreetingServices: defined in file [...]
    // getterGreetingService: defined in file [...]
    // greetingServiceImpl: defined in file [...]
    //
    // Action:
    // Consider marking one of the beans as @Primary, updating the consumer to
    // accept multiple beans or using @Qualifier to identify the bean that should
    // be consumed
    //============================================================================
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}

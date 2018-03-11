package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */

//================================================================================
// @Service marks a class as spring service
//================================================================================
// Missing this annotation would led to application start failure
//================================================================================
// APPLICATION FAILED TO START
//
// Description:
// Parameter 0 of method setGreetingService in guru.springframework.controllers.
// GetterInjectedController required a bean of type 'guru.springframework.services.
// GreetingService' that could not be found
//
// Action:
// Consider defining a bean of type 'guru.springframework.services.GreetingService'
// in your configuration
//================================================================================
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}

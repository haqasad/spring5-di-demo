package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */

//==========================================================
// @Service annotation means that this is a Spring component
//==========================================================
@Service
//==========================================================================
// GreetingServiceImpl is an implementation of the interface GreetingService
//
// Check out the interface GreetingService
//==========================================================================
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}

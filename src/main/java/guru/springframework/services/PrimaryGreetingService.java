package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
@Primary
//================================================================================
// @Primary allows to mark a bean as primary; There is no need of a qualifier to
// pick the bean marked as primary as spring service
//================================================================================
// In this example, GreetingService interface has been implemented four ways.
// Property, constructor and setter injected dependencies are using
// @Qualifier but MyController is using @Primary so no @Qualifier is needed
//================================================================================
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - Primary Greeting service";
    }
}

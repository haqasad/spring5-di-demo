package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
@Primary
@Profile({"en", "default"})
//================================================================================
// @Profile can take an array of strings
// For English @Profile takes "en' and for default it takes "default"
//================================================================================
// If no profile is active then the default profile will run at run time
//================================================================================
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - Primary Greeting service";
    }
}

package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
@Profile("es")
//================================================================================
// @Profile allows to choose among different profiles and run the chosen profile(s)
// at run time
//================================================================================
// In this example, other than four different implementations of GreetingService a
// new implementation has been added which prints the greeting in Spanish
//================================================================================
// @Profile takes a string that makes the bean unique from other beans
// For English @Profile takes "en' and for Spanish it takes "es"
//================================================================================
// Both the English and Spanish greeting beans are marked @Primary as well
// The one that is needed to be run at run time must be specified at application.
// properties
//================================================================================
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Servicio de Saludo Primario";
    }
}

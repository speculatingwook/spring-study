package speculatingwook.spring.bean_primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreetingClient {

    private final GreetingService greetingService;


    @Autowired
    public GreetingClient (GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayGreeting() {
        System.out.println(greetingService.getGreeting());
    }
}

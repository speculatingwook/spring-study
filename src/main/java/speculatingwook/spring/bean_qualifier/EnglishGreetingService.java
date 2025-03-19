package speculatingwook.spring.bean_qualifier;

import org.springframework.stereotype.Component;

@Component("englishGreetingService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello!";
    }
}

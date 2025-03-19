package speculatingwook.spring.bean_primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("englishGreetingService")
@Primary
public class EnglishGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello!";
    }
}

package speculatingwook.spring.bean_primary;

import org.springframework.stereotype.Component;

@Component("koreanGreetingService")
public class KoreanGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "안녕하세요!";
    }
}

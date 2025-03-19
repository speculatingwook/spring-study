package speculatingwook.spring.property;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyBean {

    @Value("${greeting.message}")
    private String greetingMessage;

    public void printGreeting() {
        System.out.println(greetingMessage);
    }
}
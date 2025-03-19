package speculatingwook.spring.bean_primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("primary-application.xml");

        GreetingClient client = context.getBean(GreetingClient.class);
        client.sayGreeting();
    }
}

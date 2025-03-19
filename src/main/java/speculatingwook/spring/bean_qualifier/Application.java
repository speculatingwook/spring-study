package speculatingwook.spring.bean_qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("qualifier-application.xml");

        GreetingClient client = context.getBean(GreetingClient.class);
        client.sayGreeting();
    }
}

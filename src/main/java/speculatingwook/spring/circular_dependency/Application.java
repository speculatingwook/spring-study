package speculatingwook.spring.circular_dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("circular-application.xml");

        BeanA beanA = (BeanA) context.getBean("beanA");
        beanA.doSomething();
    }
}

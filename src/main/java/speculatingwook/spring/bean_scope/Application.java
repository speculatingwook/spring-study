package speculatingwook.spring.bean_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("scope-application.xml");

        SingletonBean singleton1 = (SingletonBean) context.getBean("singletonBean");
        SingletonBean singleton2 = (SingletonBean) context.getBean("singletonBean");
        System.out.println("SingletonBean instance 1: " + singleton1);
        System.out.println("SingletonBean instance 2: " + singleton2);

        PrototypeBean prototype1 = (PrototypeBean) context.getBean("prototypeBean");
        PrototypeBean prototype2 = (PrototypeBean) context.getBean("prototypeBean");
        System.out.println("PrototypeBean instance 1: " + prototype1);
        System.out.println("PrototypeBean instance 2: " + prototype2);
    }
}

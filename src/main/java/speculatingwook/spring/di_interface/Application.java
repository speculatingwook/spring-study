package speculatingwook.spring.di_interface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("di-application.xml");

        TargetClass targetClass = context.getBean(TargetClass.class);

        targetClass.implFunction();
    }
}

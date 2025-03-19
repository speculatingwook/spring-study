package speculatingwook.spring.bean_lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifecycle-application.xml");

        LifecycleBean bean = (LifecycleBean) context.getBean("lifecycleBean");

        context.registerShutdownHook();

        context.close();
    }
}

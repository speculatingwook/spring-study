package speculatingwook.spring.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationBeanConfiguration.class);
        AnnotationBean annotationBean = applicationContext.getBean(AnnotationBean.class);

        System.out.println("Annoation bean info: ");
        System.out.println(annotationBean.toString());
    }
}

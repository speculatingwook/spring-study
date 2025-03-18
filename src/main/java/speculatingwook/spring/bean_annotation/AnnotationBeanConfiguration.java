package speculatingwook.spring.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationBeanConfiguration {
    @Bean
    public AnnotationBean annotationBean() {
        return new AnnotationBean("annotationBean1", 1L);
    }
}

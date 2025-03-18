package speculatingwook.spring.bean_annotation;

import org.springframework.context.annotation.Bean;

/**
 * - Spring 프레임워크에서 애너테이션(@Autowired, @Inject 등)을 사용하여 빈을 주입합니다.
 * - 애너테이션을 이용하여 빈 의존성을 설정하고, 해당 방식으로 빈을 주입하는 코드를 작성합니다.
 * - 애너테이션으로 주입된 빈이 올바르게 동작하는지 확인하기 위해 실행 결과를 확인합니다.
 * - 결과물로 애너테이션으로 주입된 빈의 실행 결과 스크린샷을 제출합니다.
 */
public class AnnotationBean {
    private final String beanName;
    private final Long beanId;

    public AnnotationBean(String beanName, Long beanId) {
        this.beanName = beanName;
        this.beanId = beanId;
    }

    public String getBeanName() {
        return beanName;
    }

    public Long getBeanId() {
        return beanId;
    }

    @Override
    public String toString() {
        return "beanName: " + beanName + "\n"
                + "beanId: " + beanId + "\n";
    }
}

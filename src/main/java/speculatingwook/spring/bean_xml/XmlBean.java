package speculatingwook.spring.bean_xml;

/**
 * - Spring 프레임워크에서 구성 파일(예: application.xml)을 사용하여 빈을 정의합니다.
 * - 빈 간의 의존 관계를 설정하고, 해당 관계를 코드에서 구현합니다.
 * - 빈 간 관계가 올바르게 구현되었는지 확인하기 위해 실행 결과를 확인합니다.
 * - 결과물로 빈 간 관계가 구현된 코드와 실행 결과 스크린샷을 제출합니다.
 */
public class XmlBean {
    private final String beanName;
    private final Long beanId;

    public XmlBean(String beanName, Long beanId) {
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
        return "bean id: " +
                beanName + "\n" +
                "bean name: " + beanName + "\n";
    }
}
